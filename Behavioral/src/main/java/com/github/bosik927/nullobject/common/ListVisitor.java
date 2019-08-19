package com.github.bosik927.nullobject.common;

public interface ListVisitor {
    Object whenNonNullList(NonNullList host, Object param);
    Object whenNullList(NullList host, Object param);
}