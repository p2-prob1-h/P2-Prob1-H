public class WAVPlayer 
    implements FormatoAudio{
    private String file;

    public WAVPlayer(String file) {
        this.file = file;
    }

    public void play() {
        System.out.println("Audio reproduzindo");
    }
    //pode retornar com o play
    public void stop() {
        System.out.println("Audio parado");
    }
    
    public int forward(int milissegundos){
        System.out.println("Avançou " + milissegundos + "segundos");
        return milissegundos;
    }
    
    public int reward(int milissegundos){
        System.out.println("Retornou " + milissegundos + "segundos");
        return milissegundos;
    }
    
    @Override
    protected void finalize(){
        System.out.println("Arquivo fechado e memoria liberada");
    }
    
    @Override
    public void abrir(String file) {
        System.out.println("Abriu um arquivo do tipo WAV");
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
        System.out.println("Reproduziu arquivo WMA de forma simples");
    }

    @Override
    public void pararSimples() {
        System.out.println("Parou audio de forma simples");
    }

}
