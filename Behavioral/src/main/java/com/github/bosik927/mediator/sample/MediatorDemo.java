package com.github.bosik927.mediator.sample;

import com.github.bosik927.mediator.sample.control.Consumer;
import com.github.bosik927.mediator.sample.control.Mediator;
import com.github.bosik927.mediator.sample.control.Producer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediatorDemo {

    public static void main( String[] args ) {
        List<Thread> producerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER for exit");

        Mediator mb = new Mediator();
        producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Producer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));
        producerList.add(new Thread(new Consumer(mb)));

        producerList.forEach(Thread::start);

        boolean stop = false;

        String exit = scanner.nextLine();
        while (!stop) {
            if (exit.equals("")) {
                stop = true;
                producerList.forEach(Thread::interrupt);
            }
        }
    }
}