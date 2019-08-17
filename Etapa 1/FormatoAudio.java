
public interface FormatoAudio {
    public void abrir(String file);
    public void reproduzir();
    public void pausar();
    public void parar();
    public void avancar(int qntSegundos);
    public void retornar(int qntSegundos);
    public void liberar();
    public void reproduzirSimples(String flie);
    public void pararSimples();
}
