package com.github.bosik927.iterator.advance2.social.network.boundary;

import com.github.bosik927.iterator.advance2.iterator.boundary.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}