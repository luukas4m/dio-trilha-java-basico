public class Usuario {
    public static void main (String [] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println(" Novo Status -> Volume atual : " + smartTv.volume);

        smartTv.canalParaCima();
        smartTv.canalParaCima();
        smartTv.canalParaCima();
        smartTv.canalParaBaixo();
        System.out.println(" Novo Status -> Canal atual : " + smartTv.canal);
    }
}
