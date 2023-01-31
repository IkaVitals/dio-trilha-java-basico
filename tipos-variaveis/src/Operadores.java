public class Operadores {

    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;
        // Aqui eu deixei a variável número com o valor negativo com o uso de um
        // operador unário de valor negativo.
        System.out.println(numero);

        numero = numero * -1;
        // Agora para retornar o valor positivo ultilizei a multiplicação com "-1", pois
        // se ultilizasse o "+" ele não trabalharia como operador unário e sim como
        // adição.
        System.out.println(numero);

    }

}