package com.github.bosik927.observer.common;

import com.github.bosik927.observer.common.channels.NewsAgency;
import com.github.bosik927.observer.common.channels.NewsChannel;
import com.github.bosik927.observer.common.observers.ONewsAgency;
import com.github.bosik927.observer.common.observers.ONewsChannel;
import com.github.bosik927.observer.common.property.PCLNewsAgency;
import com.github.bosik927.observer.common.property.PCLNewsChannel;

public class NewsDemo {

    public static void main(String... args){
        /*OWN OBSERVER*/
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel("Sample news");

        observable.addObserver(observer);
        observable.setNews("New news 1");

        System.out.println(observer.getNews());

        /*JAVA OBSERVER INTERFACES*/
        ONewsAgency observable1 = new ONewsAgency();
        ONewsChannel observer1 = new ONewsChannel();

        observable1.addObserver(observer1);
        observable1.setNews("New news 2");

        System.out.println(observer1.getNews());

        /*PROPERTY CHANGE SUPPORT*/
        PCLNewsAgency observable2 = new PCLNewsAgency();
        PCLNewsChannel observer2 = new PCLNewsChannel();

        observable2.addPropertyChangeListener(observer2);
        observable2.setNews("New news 3");

        System.out.println(observer2.getNews());
    }
}
