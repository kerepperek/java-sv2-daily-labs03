package day04;

import java.util.Arrays;

public class Sultan {

    private boolean[] doors = new boolean[100];

    public static void main(String[] args) {
        Sultan sultan = new Sultan();
        sultan.command(sultan.doors);
        System.out.println(Arrays.toString(sultan.doors));
    }

    private void command(boolean[] doors) {
        for (int counter = 1; counter <= 100; counter++)
            for (int subcounter = counter - 1; subcounter < 100; subcounter += counter)
                doors[subcounter] ^= true;
    }
}
