package com.github.bosik927.bridge.sample;

import com.github.bosik927.bridge.sample.stack.Stack;
import com.github.bosik927.bridge.sample.stack.StackFIFO;
import com.github.bosik927.bridge.sample.stack.StackHanoi;

import java.util.Random;

public class BridgeDisk {

    public static void main(String[] args) {
        Stack[] stacks = {new Stack("array"), new Stack("list"),
                new StackFIFO(), new StackHanoi()};
        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                stacks[j].push(i);
            }
        }
        Random rn = new Random();
        for (int i = 1; i < 15; i++) {
            stacks[3].push(rn.nextInt(20));
        }
        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + "  ");
            }
            System.out.println();
        }
        System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
    }
}
