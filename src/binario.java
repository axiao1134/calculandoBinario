import java.util.Arrays;
import java.util.Scanner;

public class binario {
    /*
    este es un commentario
    */
    public static int getNumber(){
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Ingrese el número que transformará a 8-bits.");
        return scanNumber.nextInt();
    }
    public static int divisible2(int num){
        return (num%2);
    }
    public static void main(String[] argumentos){
        int number=256;
        while ((number>255) | (number<0)) {
            number=getNumber();
        }
        int[] numero= new int[8];

        for (int i=7; i>=0; i-=1){
            int a=divisible2(number);
            numero[i]=a;
            number=((number-a)/2);
        }
        System.out.println(Arrays.toString(numero));
    }

}
