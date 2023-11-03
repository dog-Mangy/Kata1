public class Kata {
    public static void main(String[] args) {
        String palabra = "world";
        String palabraInvertida = solution(palabra);
        System.out.println(palabraInvertida);
    }

    public static String solution(String str) {
        char[] caracteres = str.toCharArray();

        int inicio = 0;
        int fin = caracteres.length - 1;

        while (inicio < fin) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fin];
            caracteres[fin] = temp;
            inicio++;
            fin--;
        }

        return new String(caracteres);
    }
}