package com.github.bosik927.iterator.advance2.iterator.boundary;

import com.github.bosik927.iterator.advance2.social.network.entity.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}