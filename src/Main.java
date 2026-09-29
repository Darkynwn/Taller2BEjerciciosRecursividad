public class Main {

    //Factorial de un número
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    //Suma de los números del 1 al N
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        }

        return n + suma(n - 1);
    }

    //Potencia de un número
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        return base * potencia(base, exponente - 1);
    }

    //Contar dígitos de un número
    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        }

        return 1 + contarDigitos(n / 10);
    }

    //Invertir una cadena
    public static String invertir(String s) {
        if (s.isEmpty()) {
            return "";
        }
        return invertir(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int base = 2;
        int exponente = 5;
        int numero = 58321;
        String cadena = "hola";

        System.out.println("Factorial: " + factorial(a));
        System.out.println("Suma: " + suma(b));
        System.out.println("Potencia: " + potencia(base, exponente));
        System.out.println("Cantidad de dígitos: " + contarDigitos(numero));
        System.out.println("Cadena invertida: " + invertir(cadena));
    }
}