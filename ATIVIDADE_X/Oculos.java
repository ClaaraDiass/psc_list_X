public class Oculos {
    private String lente;
    private String cores;
    private String hastes;
    private String armacao;
    private String tamanhos;

    public Oculos(String lente, String cores, String hastes, String armacao, String tamanhos) {
        this.lente = lente;
        this.cores = cores;
        this.hastes = hastes;
        this.armacao = armacao;
        this.tamanhos = tamanhos;
    }

    public String getLente() {
        return lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getHastes() {
        return hastes;
    }

    public void setHastes(String hastes) {
        this.hastes = hastes;
    }

    public String getArmacao() {
        return armacao;
    }

    public void setArmacao(String armacao) {
        this.armacao = armacao;
    }

    public String getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(String tamanhos) {
        this.tamanhos = tamanhos;
    }

    public void protegerVisao() {
        System.out.println("Protegendo a visão...");
    }

    public void enxergar() {
        System.out.println("Enxergando...");
    }

    public void protegerSol() {
        System.out.println("Protegendo do sol...");
    }

    public void ajustarConformePosicao() {
        System.out.println("Ajustando conforme posição do rosto...");
    }
}
