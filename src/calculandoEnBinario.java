import java.util.Scanner;
class calculandoEnBinario {
    public static void main(String[] args) {
        byte numero =ingresarNumero();
        System.out.println("el numero ingresado es :"+ numero);
    }
    public static byte ingresarNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero entero no menor qeu 0 y no mayor que 255:");
        byte numero = input.nextByte();
        if (numero < 0){
            System.out.println("error, numero negativo");
        }

        return numero;
    }

}
