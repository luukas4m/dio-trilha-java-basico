public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Você aumentou o volume");
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Você diminuiu o volume");
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Você mudou o canal para : ".concat("Canal ") + novoCanal);
    }

    public void canalParaCima(){
        canal++;
        System.out.println("Você pulou um canal");
    }
    public void canalParaBaixo(){
        canal--;
        System.out.println("Você voltou um canal");
    }


}
