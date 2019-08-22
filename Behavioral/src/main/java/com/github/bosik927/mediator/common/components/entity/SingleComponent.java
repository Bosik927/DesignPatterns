package com.github.bosik927.mediator.common.components.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum SingleComponent {

    ADDING_BUTTON("AddButton"),
    DELETE_BUTTON("DelButton"),
    FILTER("Filter"),
    LIST("List"),
    SAVE_BUTTON("SaveButton"),
    TEXT_BOX("TextBox"),
    TITLE("Title");

    private static final Map<String, SingleComponent> COMPONENTS = new HashMap<>(values().length, 1);
    private final String name;

    static {
        for (SingleComponent c : values()) COMPONENTS.put(c.name, c);
    }

    public static Optional<SingleComponent> byName(String name) {
        return Optional.of(COMPONENTS.get(name));
    }

    SingleComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}