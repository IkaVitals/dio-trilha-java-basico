
public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("TV qual canal? " + smartTv.canal);
        System.out.println("TV qual volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Você está no Canal: " + smartTv.canal);

        smartTv.proximoCanal();
        smartTv.canalAnterior();

        System.out.println("Você tem " + smartTv.striming + " disponível na sua SmartTv");

        smartTv.mudarStriming("AmazonPrime");
        System.out.println("Você mudou para " + smartTv.striming);

    }
}
