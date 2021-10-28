package day04;

import java.util.Arrays;

public class Sultan {

    public static void main(String[] args) {
        Prison prison = new Prison();
        prison.openFreeCells();
        System.out.println(Arrays.toString(prison.getCells()));
    }
}
