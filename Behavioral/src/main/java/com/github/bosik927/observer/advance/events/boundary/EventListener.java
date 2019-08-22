package com.github.bosik927.observer.advance.events.boundary;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);
}