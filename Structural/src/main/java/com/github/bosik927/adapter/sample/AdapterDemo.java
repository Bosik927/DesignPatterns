package com.github.bosik927.adapter.sample;

import com.github.bosik927.adapter.sample.control.RoundHole;
import com.github.bosik927.adapter.sample.control.SquarePegAdapter;

public class AdapterDemo {

    public static void main(String... args){
        RoundHole roundHole = new RoundHole( 5 );
        SquarePegAdapter squarePegAdapter;
        for (int i = 6; i < 10; i++) {
            squarePegAdapter = new SquarePegAdapter((double)i);
            squarePegAdapter.makeFit(roundHole);
        }
    }
}