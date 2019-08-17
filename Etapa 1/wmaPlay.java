

public class wmaPlay
    implements FormatoAudio{
    private String file;
    private int Location;

    public void setFile(String file){
        System.out.println("Definido nome do arquivo WMA que sera reproduzido");
        this.file = file;
    }
    
    public void setLocacion(int location){
        this.Location = location;
        System.out.println("Áudio iniciou a reprodução em " + location + " segundos" );
    }
    
    public int getLocation (){
        return Location;
    }
    
    public void open() {
        System.out.println("Abriu o arquivo " + this.file + " do tipo WMA");
    }
    
    public void play() {
        System.out.println("Audio reproduzindo");
    }

    public void stop() {
        System.out.println("Audio parado");
    }
    
////////////////////
    
    @Override
    public void abrir(String file) {
        System.out.println("Abriu um arquivo do tipo WMA");
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
