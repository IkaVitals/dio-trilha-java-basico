public class OperadorUnario {

    public static void main(String[] args) {
        int numero = 5;

        numero = numero + 1;
        numero++;
        // "numero ++" é a mesma coisa que "numero = numero + 1 " pois o "++" é um
        // operador que incrementa mais 1.
        System.out.println(numero);

        int numeroDois = 7;

        System.out.println(++numeroDois);
        // ao adicionar o"++" na hora de imprimir antes da variável eu incremento o
        // valor mais 1 antes da impressão, tendo o mesmo resultado que no exemplo
        // anterior.

        int numeroTres = 10;

        System.out.println(numeroTres++);
        // Se colocar o "++" depois da varivel na impressão, então irá imprimir o valor
        // da variavel sem o incremento.

        System.out.println(numeroTres);
        // Para ver variavel com o o incremento devo realizar mais uma impressão que no
        // caso não necessita adicionar o "++" pois já irá imprimir o incremento
        // adicionado anteriormente. Todas as regras descritas no exemplo valem para o
        // Operador de decremento "--".

        boolean variavel = true;

        System.out.println(!variavel);
        // ao adicionar "!" eu digo que minha variavel booleana é o contrário do que foi
        // atribuida a ela nesta impressão
        System.out.println(variavel);
        // no entanto se imprimir novamente este valor não foi atribuído de forma fixa a
        // variável

        boolean verdadeiroFalso = false;

        verdadeiroFalso = !verdadeiroFalso;
        // ao adicionar "!" neste caso irei negar o valor atribuido só que agora de
        // forma fixa.
        System.out.println(verdadeiroFalso);

    }

}
