package com.github.bosik927.mediator.common.mediator.control;

import com.github.bosik927.mediator.common.components.entity.Note;
import com.github.bosik927.mediator.common.components.boundary.Component;
import com.github.bosik927.mediator.common.components.control.AddButton;
import com.github.bosik927.mediator.common.components.control.DeleteButton;
import com.github.bosik927.mediator.common.components.control.Filter;
import com.github.bosik927.mediator.common.components.control.List;
import com.github.bosik927.mediator.common.components.control.SaveButton;
import com.github.bosik927.mediator.common.components.control.TextBox;
import com.github.bosik927.mediator.common.components.control.Title;
import com.github.bosik927.mediator.common.components.entity.SingleComponent;
import com.github.bosik927.mediator.common.mediator.boundary.Mediator;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import static com.github.bosik927.mediator.common.components.entity.ComponentConstants.*;

public class Editor implements Mediator {

    private Title title;
    private TextBox textBox;
    private AddButton add;
    private DeleteButton del;
    private SaveButton save;
    private List list;
    private Filter filter;

    private JLabel titleLabel = new JLabel(TITLE_LABEL_CONTENT);
    private JLabel textLabel = new JLabel(TEXT_LABEL_CONTENT);
    private JLabel label = new JLabel(ADDING_LABEL_CONTENT);

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);

        SingleComponent.byName(component.getName()).ifPresent(singleComponent -> {
            switch (singleComponent) {
                case ADDING_BUTTON:
                    add = (AddButton) component;
                    break;
                case DELETE_BUTTON:
                    del = (DeleteButton) component;
                    break;
                case FILTER:
                    filter = (Filter) component;
                    break;
                case LIST:
                    list = (List) component;
                    this.list.addListSelectionListener(listSelectionEvent -> {
                        Note note = (Note) list.getSelectedValue();
                        if (note != null) {
                            getInfoFromList(note);
                        } else {
                            clear();
                        }
                    });
                    break;
                case SAVE_BUTTON:
                    save = (SaveButton) component;
                    break;
                case TEXT_BOX:
                    textBox = (TextBox) component;
                    break;
                case TITLE:
                    title = (Title) component;
                    break;
            }
        });

    }

    @Override
    public void addNewNote(Note note) {
        title.setText(EMPTY);
        textBox.setText(EMPTY);
        list.addElement(note);
    }

    @Override
    public void deleteNote() {
        list.deleteElement();
    }

    @Override
    public void getInfoFromList(Note note) {
        title.setText(note.getName().replace(ASTERISK_SIGN, SPACE_SIGN));
        textBox.setText(note.getText());
    }

    @Override
    public void saveChanges() {
        try {
            Note note = (Note) list.getSelectedValue();
            note.setName(title.getText());
            note.setText(textBox.getText());
            list.repaint();
        } catch (NullPointerException ignored) {
        }
    }

    @Override
    public void markNote() {
        try {
            Note note = list.getCurrentElement();
            String name = note.getName();
            if (!name.endsWith(ASTERISK_SIGN)) {
                note.setName(note.getName() + ASTERISK_SIGN);
            }
            list.repaint();
        } catch (NullPointerException ignored) {
        }
    }

    @Override
    public void clear() {
        title.setText(EMPTY);
        textBox.setText(EMPTY);
    }

    @Override
    public void sendToFilter(ListModel listModel) {
        filter.setList(listModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setElementsList(ListModel list) {
        this.list.setModel(list);
        this.list.repaint();
    }

    @Override
    public void hideElements(boolean flag) {
        titleLabel.setVisible(!flag);
        textLabel.setVisible(!flag);
        title.setVisible(!flag);
        textBox.setVisible(!flag);
        save.setVisible(!flag);
        label.setVisible(flag);
    }

    @Override
    public void createGUI() {
        JFrame notes = new JFrame(NOTES);
        notes.setSize(960, 600);
        notes.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel left = new JPanel();
        left.setBorder(new LineBorder(Color.BLACK));
        left.setSize(320, 600);
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        JPanel filterPanel = new JPanel();
        filterPanel.add(new JLabel(FILTER));
        filter.setColumns(20);
        filterPanel.add(filter);
        filterPanel.setPreferredSize(new Dimension(280, 40));
        JPanel listPanel = new JPanel();
        list.setFixedCellWidth(260);
        listPanel.setSize(320, 470);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(275, 410));
        listPanel.add(scrollPane);
        JPanel buttonPanel = new JPanel();
        add.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(add);
        del.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(del);
        buttonPanel.setLayout(new FlowLayout());
        left.add(filterPanel);
        left.add(listPanel);
        left.add(buttonPanel);
        JPanel right = new JPanel();
        right.setLayout(null);
        right.setSize(640, 600);
        right.setLocation(320, 0);
        right.setBorder(new LineBorder(Color.BLACK));
        titleLabel.setBounds(20, 4, 50, 20);
        title.setBounds(60, 5, 555, 20);
        textLabel.setBounds(20, 4, 50, 130);
        textBox.setBorder(new LineBorder(Color.DARK_GRAY));
        textBox.setBounds(20, 80, 595, 410);
        save.setBounds(270, 535, 80, 25);
        label.setFont(new Font(GUI_FONT_FAMILY, Font.PLAIN, 22));
        label.setBounds(100, 240, 500, 100);
        right.add(label);
        right.add(titleLabel);
        right.add(title);
        right.add(textLabel);
        right.add(textBox);
        right.add(save);
        notes.setLayout(null);
        notes.getContentPane().add(left);
        notes.getContentPane().add(right);
        notes.setResizable(false);
        notes.setLocationRelativeTo(null);
        notes.setVisible(true);
    }
}