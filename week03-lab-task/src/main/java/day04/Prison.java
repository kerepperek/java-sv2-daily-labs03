package day04;

import java.util.Arrays;

public class Prison {

    private boolean[] cells = new boolean[100];

    public void openFreeCells() {
        for (int counter = 1; counter <=cells.length ; counter++)
            for (int subcounter = counter - 1; subcounter < cells.length; subcounter += counter)
                cells[subcounter] ^= true;
    }

    public boolean[] getCells() {
        return cells;
    }
}
