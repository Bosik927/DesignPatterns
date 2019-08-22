package com.github.bosik927.nullobject.common.control;

import com.github.bosik927.nullobject.common.boundary.List;
import com.github.bosik927.nullobject.common.boundary.ListVisitor;

public class NonNullList extends List {

    private Object head;
    private List tail;

    public NonNullList(Object head, List tail) {
        this.head = head;
        this.tail = tail;
    }

    public Object getHead() {
        return head;
    }

    public List getTail() {
        return tail;
    }

    public Object accept(ListVisitor visitor, Object param) {
        return visitor.whenNonNullList(this, param);
    }
}