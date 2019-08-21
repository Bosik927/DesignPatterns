package com.github.bosik927.bridge.sample;

import com.github.bosik927.bridge.sample.stack.control.Stack;
import com.github.bosik927.bridge.sample.stack.control.StackFIFO;
import com.github.bosik927.bridge.sample.stack.control.StackHanoi;

import java.util.Random;

import static com.github.bosik927.bridge.sample.stack.entity.StackConstants.ARRAY;
import static com.github.bosik927.bridge.sample.stack.entity.StackConstants.LIST;

public class BridgeDisk {

    private static final String TOTAL_REJECTED_IS = "total rejected is ";

    public static void main(String[] args) {
        Stack[] stacks = {new Stack(ARRAY), new Stack(LIST),
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
        System.out.println(TOTAL_REJECTED_IS + ((StackHanoi) stacks[3]).reportRejected());
    }
}
