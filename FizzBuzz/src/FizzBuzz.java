import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FizzBuzz Code in Java - Iqwal Akmar");

        Scanner myObj = new Scanner(System.in);  
        System.out.println("Masukkan Angka");

        Integer inputAngka = myObj.nextInt();
        System.out.println("Angka: " + inputAngka);
        String print;

        for (int i = 1; i <= inputAngka; i++) {
            if (i%3==0 && i%5==0){
                print ="Fizz Buzz";
            }
            else if (i%3==0) {
                print = "Fizz";
            }
            else if (i%5==0){
                print = "Buzz";
            }
            else {
                print = Integer.toString(i);
            }


            System.out.print(" " + print + ",");
        }
    }
}
