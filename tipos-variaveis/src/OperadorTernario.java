public class OperadorTernario {

    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        // Aqui minha variável resultados não tem nenhum objeto adicionado pois só será
        // atribuído depois das condições.
        if (a == b)
            resultado = "verdadeiro";
        // Nessa caso ultilizei "if" para ilustrar que caso as variaveis "a" e "b"
        // tiverem valor iguais a variavel "resultado" será atribuído o objeto
        // "verdadeiro"
        else
            resultado = "falso";
        // Aqui eu ultilizo o "else" para dizer que caso não seja a opção anterior então
        // "resultado" será "falso"
        System.out.println(resultado);

        int c, d;

        c = 10;
        d = 10;

        String resultadoDois = (c == d) ? "verdadeiro" : "falso";
        // Aqui a "?" funciona como if e os " : " como um else só que descritos em uma
        // linha, lembrado que isto só pode ser usado quando a primeira operação for uma
        // expresão booleana no caso "a == b" é uma expressão booleana porque compara as
        // duas variáveis e irá dar 2 alternativas de resultados. também pode ser usado
        // com int ex:
        // int resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultadoDois);

    }
}