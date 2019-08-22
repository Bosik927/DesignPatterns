package com.github.bosik927.mediator.common.components.entity;

public class Note {

    private static final String NEW_NOTE_NAME = "New note";

    private String name;
    private String text;

    public Note() {
        name = NEW_NOTE_NAME;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return name;
    }
}