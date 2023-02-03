public class OperadorLogico {

    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        // O operador "&&" compara se as duas vairiaveis tem valores iguais para
        // realizar a ação.
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
        // O operador "| |" compara as se uma das variaveis é verdaeira para ai executar
        // a ação.
        if (condicao1 && (7 > 4)) {
            System.out.println("a condição é verdadeira e 7 é maior que 4");
        }
        // Aqui ao ultilizar ao operador Logico &&, eu quero dizer que se a variavel 1
        // for verdadeira e sete for maior que quatro eu realizo a ação.
        System.out.println("Fim");
    }

}
