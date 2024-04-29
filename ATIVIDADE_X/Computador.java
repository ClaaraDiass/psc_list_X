public class Computador {
    private String tela;
    private String sistema;
    private String processador;
    private String memoria;
    private String placaMae;
    private String placaVideo;
    private String armazenamento;

    public Computador(String tela, String sistema, String processador, String memoria, String placaMae, String placaVideo, String armazenamento) {
        this.tela = tela;
        this.sistema = sistema;
        this.processador = processador;
        this.memoria = memoria;
        this.placaMae = placaMae;
        this.placaVideo = placaVideo;
        this.armazenamento = armazenamento;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void ligarComputador() {
        System.out.println("Ligando o computador...");
    }

    public void inicializarSistemaOperacional() {
        System.out.println("Inicializando o sistema operacional...");
    }

    public void abrirProgramas() {
        System.out.println("Abrindo programas e aplicativos...");
    }

    public void navegarInternet() {
        System.out.println("Navegando na internet...");
    }

    public void salvarDocumentos() {
        System.out.println("Salvando documentos...");
    }
}
