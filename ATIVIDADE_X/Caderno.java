public class Caderno {
    private String capa;
    private String cabecalho;
    private String linhas;
    private String espacoDadosPessoais;
    private boolean portaFolhas;
    private boolean cartelaAdesivos;

    public Caderno(String capa, String cabecalho, String linhas, String espacoDadosPessoais, boolean portaFolhas, boolean cartelaAdesivos) {
        this.capa = capa;
        this.cabecalho = cabecalho;
        this.linhas = linhas;
        this.espacoDadosPessoais = espacoDadosPessoais;
        this.portaFolhas = portaFolhas;
        this.cartelaAdesivos = cartelaAdesivos;
    }
    
    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }

    public String getLinhas() {
        return linhas;
    }

    public void setLinhas(String linhas) {
        this.linhas = linhas;
    }

    public String getEspacoDadosPessoais() {
        return espacoDadosPessoais;
    }

    public void setEspacoDadosPessoais(String espacoDadosPessoais) {
        this.espacoDadosPessoais = espacoDadosPessoais;
    }

    public boolean isPortaFolhas() {
        return portaFolhas;
    }

    public void setPortaFolhas(boolean portaFolhas) {
        this.portaFolhas = portaFolhas;
    }

    public boolean isCartelaAdesivos() {
        return cartelaAdesivos;
    }

    public void setCartelaAdesivos(boolean cartelaAdesivos) {
        this.cartelaAdesivos = cartelaAdesivos;
    }

    public void serEscrito() {
        System.out.println("Sendo escrito...");
    }

    public void desenhar() {
        System.out.println("Desenhando...");
    }

    public void rasgar() {
        System.out.println("Rasgando...");
    }

    public void usarComoArmaBranca() {
        System.out.println("Usando como arma branca...");
    }
}
