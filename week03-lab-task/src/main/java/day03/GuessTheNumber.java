package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        GuessTheNumber gtn= new GuessTheNumber();
        System.out.println("Találja ki 6 próbálkozásból azt a 100 alatti számot, amit kitaláltam: ");
        Random rand = new Random();
        System.out.println(gtn.isexact(rand.nextInt(100)+1));
    }

    private String isexact(int number){
        Scanner scanner=new Scanner(System.in);
        for(int counter=1;counter<=6;counter++){
            System.out.print(counter+". Próbálkozás: ");
            int probe= scanner.nextInt();
            if(probe==number) return "Gratulálok! Kitaláltad.";
            System.out.println("-->"+(probe<number?" nagyobb ":" kisebb ")+", amit kitaláltam.");
        }
        return "Sajnos nem sikerült kitalálni!";
    }
}
