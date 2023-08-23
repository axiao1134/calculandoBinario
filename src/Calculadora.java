public class Calculadora {
    public static void main(String[] args) {
        String resultado = convertirABinario(13);
        System.out.println(resultado);
    }
    public static String convertirABinario(int numero){
        String acumulador="";
        int resto=0;
        for(int i = 0; i < 8; i++){
            resto = numero%2;
            numero = numero/2;
            acumulador += Integer.toString(resto);
        }
        String resultado = invertirCadena(acumulador);
        return resultado;
        }

    public static String invertirCadena(String cadena) {
        String cadena_invertida = "";
        for (int i = cadena.length()-1; i >= 0; i--) {
            cadena_invertida += cadena.charAt(i);
        }
        return cadena_invertida;
    }
    // ingresarNumero() ValidarNumero() convertirBinario() imprimirBinario()
}
