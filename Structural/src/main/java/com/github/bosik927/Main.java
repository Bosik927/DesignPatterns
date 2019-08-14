package com.github.bosik927;

import com.github.bosik927.adapter.RoundHole;
import com.github.bosik927.adapter.SquarePegAdapter;

public class Main {

    public static void main( String[] args ) {
        RoundHole roundHole = new RoundHole( 5 );
        SquarePegAdapter squarePegAdapter;
        for (int i = 6; i < 10; i++) {
            squarePegAdapter = new SquarePegAdapter((double)i);
            squarePegAdapter.makeFit(roundHole);
        }
    }
}
