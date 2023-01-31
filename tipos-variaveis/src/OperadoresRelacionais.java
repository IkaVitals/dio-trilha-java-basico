public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nome1 = "Ikã";
        String nome2 = "Ikã";
        // String nome2 = new String("Ikã");
        // System.out.println(nome1.equals(nome2));
        // em caso de objetos é mais comum usarmos o "equals" pois ele consegue comparar
        // os contúdos do objetos
        // se tivessemos impreeso da mesma maneira que tá escrito o comando mas com o
        // variavel nome2 modificada
        // como no comentário, daria falso porque ele compararia o objeto e não o
        // conteúdo.
        System.out.println(nome1 == nome2);

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 6;
        int numero4 = 7;

        boolean simNao = numero1 == numero2;

        if (numero3 < numero4) {
            System.out.println("Condição verdadeira");
        }

        System.out.println("Numero Um é igual ao Numero Dois? " + simNao);

        // Imprimir uma mensagem e concatenado com a variável booleana simNao

        simNao = numero1 != numero2;

        System.out.println("Numero Um é diferente do Numero Dois? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("Numero Um é maior ou Igual a Numero Dois? " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("Numero Umn é menor ou Igual a Numero Dois? " + simNao);

        // variaável booleana simNao para comparar a variaveis numero1 e numero2 e
        // retornar um valor a partir dos operadores Relacionais que no exemplo são
        // igual " == ", diferente " != ", maior ou igual" >= " e menor ou igual "<=".
    }
}
