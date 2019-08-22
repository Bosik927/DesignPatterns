package com.github.bosik927.observer.sample;

import com.github.bosik927.observer.sample.observers.control.BinObserver;
import com.github.bosik927.observer.sample.observers.control.HexObserver;
import com.github.bosik927.observer.sample.observers.control.OctObserver;
import com.github.bosik927.observer.sample.observers.control.Subject;

import java.util.Scanner;

public class ObserverDemo {

    public static void main( String[] args ) {
        Subject sub = new Subject();
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}