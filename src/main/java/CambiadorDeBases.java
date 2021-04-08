public class CambiadorDeBases {

    public static void main(String[] args) {

        int n = 1000;

        System.out.println(aBinario(n));
        System.out.println(aOctal(n));
        System.out.println(aHexadecimal(n));
    }

    public static String base10aN(int numero, int baseN) {

        if (numero < 0) {
            return "-" + base10aN(-numero, baseN);
        }

        int resto;
        StringBuilder resultado = new StringBuilder();
        String simbolos = "0123456789abcdefghijklmnopqrstuvwxyz";

        while (numero != 0) {
            resto = numero % baseN;
            resultado.insert(0, simbolos.charAt(resto));
            numero = numero / baseN;
        }

        return resultado.toString();
    }

    public static String aBinario(int numero) {
        return base10aN(numero, 2);
    }

    public static String aOctal(int numero) {
        return base10aN(numero, 8);
    }

    public static String aHexadecimal(int numero) {
        return base10aN(numero, 16);
    }
}
