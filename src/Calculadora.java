public class Calculadora {
    public static void main(String[] args) {
       iniciarPrograma();
    }

    public static void iniciarPrograma(){
        String resultado = convertirABinario(13); // Aquí falta la función ingresarNumero()
        System.out.println(resultado);
    }

    public static String convertirABinario(int numero){
        String acumulador=""; // Acumula los restos o residuos de la división
        int resto; //Se declara la variable "resto"
        for(int i = 0; i < 8; i++){ // Se hacen 8 iteraciones para formar los dígitos del número binario
            resto = numero%2;
            numero = numero/2;
            acumulador += Integer.toString(resto); // El resto se pasa a String y se almacena en "acumulador"
        }
        String resultado = invertirCadena(acumulador); // Se invierte la cadena String para obtener el resultado final de la conversión
        return resultado;
        }

    public static String invertirCadena(String cadena) {
        String cadena_invertida = "";
        for (int i = cadena.length()-1; i >= 0; i--) { // Este bucle permite invertir el orden de la cadena
            cadena_invertida += cadena.charAt(i);
        }
        return cadena_invertida;
    }
}
