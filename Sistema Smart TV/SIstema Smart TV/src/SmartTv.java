public class SmartTv {
    // Foi criada a classe da Smart TV, onde abriga as suas funções básicas
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    String striming = "Netflix";

    // Foram criadas variáveis booleanas, inteiras e textuais para serem usadas em
    // outros métodos

    public void ligar() {
        ligada = true;
    }

    // Aqui foi criado o método "ligar" então quando ele for chamado a variável
    // "ligada" terá o valor alterado para true

    public void desligar() {
        ligada = false;
    }

    // Neste método usei a mesma lógica do primeiro mas pra manter a variável
    // "ligada" com o mesmo valor

    public void aumentarVolume() {
        volume++;
        System.out.println("Você aumentou o volume para: " + volume);
    }

    // Aqui eu ultilizei o "++" para adicionar mais um a cada vez que esse método
    // for chamado e toda vez que isso acontecer ele irá exibir a mensagem que
    // informe o volume atual
    public void diminuirVolume() {
        volume--;
        System.out.println("Você diminuiu o volume para: " + volume);
    }

    // Aqui mantive a mesma lógica do método "aumentarVolume"

    public void proximoCanal() {
        canal++;
        System.out.println("Você foi para o Canal: " + canal);
    }

    // Aqui mantive a mesma lógica do método "aumentarVolume"

    public void canalAnterior() {
        canal--;
        System.out.println("Você foi para o Canal: " + canal);
    }

    // Aqui mantive a mesma lógica do método "aumentarVolume"

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    // Neste método o usúario pode adicionar diretamente o valor na variável canal
    // atráves da variável inteira "novoCanal" que foi colocada neste método

    public void mudarStriming(String novoStriming) {
        striming = novoStriming;
    }

    // Neste método mantive a lógica do método "mudarCanal" mas agora com a variavel
    // String para o Usuário inserir o Striming de sua preferência

}