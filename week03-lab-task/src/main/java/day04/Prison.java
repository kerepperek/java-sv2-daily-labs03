package day04;

import java.util.Arrays;

public class Prison {

    private boolean[] doors = new boolean[100];

    public boolean[] openFreeCells() {
        for (int counter = 1; counter <= 100; counter++)
            for (int subcounter = counter - 1; subcounter < 100; subcounter += counter)
                doors[subcounter] ^= true;
        return doors;
    }
}
