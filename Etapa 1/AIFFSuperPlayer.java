public class AIFFSuperPlayer
    implements FormatoAudio{
    private String file;
    private int cursor;

    public AIFFSuperPlayer(String file) {
        this.file = file;
    }

    public void play() {
        System.out.println("Audio reproduzindo");
    }
    //não pode retornar com o play
    public void Stop() {
        System.out.println("Audio parado. Aguardando nova posição");
    }
    
    public void pause() {
        System.out.println("Audio Pausado");
    }
    
    public void setCursor(int cursor) {
        this.cursor = cursor;
    }
    
    public void Release (){
        System.out.println("Memória Liberada");
    }
    
    /////////////////////////////////
    
    
    @Override
    public void abrir(String file) {
        System.out.println("Abriu um arquivo do tipo AIFF");
        this.file = file;
    }

    @Override
    public void reproduzir() {
        System.out.println("Audio reproduzindo");
    }

    @Override
    public void pausar() {
        System.out.println("Audio Pausado");
    }

    @Override
    public void parar() {
        System.out.println("Audio reiniciado e parado");
    }

    @Override
    public void avancar(int qntSegundos) {
        System.out.println("Avançou " + qntSegundos + " segundos");
    }

    @Override
    public void retornar(int qntSegundos) {
        System.out.println("Retornou " + qntSegundos + " segundos");
    }

    @Override
    public void liberar() {
        System.out.println("Arquivo fechado e memoria liberada");
    }

    
    @Override
    public void reproduzirSimples(String flie) {
        System.out.println("Reproduziu audio de forma simples");
    }

    @Override
    public void pararSimples() {
        System.out.println("Parou audio de forma simples");
    }

}

