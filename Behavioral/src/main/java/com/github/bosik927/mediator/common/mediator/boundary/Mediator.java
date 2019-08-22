package com.github.bosik927.mediator.common.mediator.boundary;

import com.github.bosik927.mediator.common.components.entity.Note;
import com.github.bosik927.mediator.common.components.boundary.Component;

import javax.swing.ListModel;

public interface Mediator {

    void addNewNote(Note note);

    void deleteNote();

    void getInfoFromList(Note note);

    void saveChanges();

    void markNote();

    void clear();

    void sendToFilter(ListModel listModel);

    void setElementsList(ListModel list);

    void registerComponent(Component component);

    void hideElements(boolean flag);

    void createGUI();
}