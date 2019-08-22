package com.github.bosik927.nullobject.common.boundary;

import com.github.bosik927.nullobject.common.control.NonNullList;
import com.github.bosik927.nullobject.common.control.NullList;

public interface ListVisitor {

    Object whenNonNullList(NonNullList host, Object param);

    Object whenNullList(NullList host, Object param);
}