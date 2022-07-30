import java.util.Scanner;

public class main {
    static boolean isPrime(int a,int b){
        if (a > 1){
            if (b !=1){
                if (a % b !=0){
                    return isPrime(a,(b-1));
                }else {
                    return false;
                }
            }
        }else {
            return false;
        }


       return true;






    }
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number=input.nextInt();
        System.out.println(isPrime(number ,(number-1)));
    }
}
