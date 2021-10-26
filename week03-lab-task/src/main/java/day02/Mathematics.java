package day02;

import java.util.stream.IntStream;

public class Mathematics {

    public boolean isPrime(int number){
        if(Math.abs(number)<=4) {return false;}
            for (int i = 3; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

        return true;
      //  return number > 1
      //          && IntStream.rangeClosed(2, (int) Math.sqrt(number))
      //         .noneMatch(n -> (number % n == 0));
    }

    public static void main(String[] args) {
        Mathematics math=new Mathematics();

        System.out.println(math.isPrime(18));

    }

}
