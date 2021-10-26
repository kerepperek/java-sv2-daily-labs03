package day02;

public class Mathematics {

    public boolean isPrime(int number){
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Mathematics math=new Mathematics();

        System.out.println(math.isPrime(19));

    }

}
