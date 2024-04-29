public class Batom {
    private String embalagem;
    private boolean tampa;
    private String coloracao;
    private String marca;
    private String cheiro;

    public Batom(String embalagem, boolean tampa, String coloracao, String marca, String cheiro) {
        this.embalagem = embalagem;
        this.tampa = tampa;
        this.coloracao = coloracao;
        this.marca = marca;
        this.cheiro = cheiro;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public String getColoracao() {
        return coloracao;
    }

    public void setColoracao(String coloracao) {
        this.coloracao = coloracao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCheiro() {
        return cheiro;
    }

    public void setCheiro(String cheiro) {
        this.cheiro = cheiro;
    }

    public void hidratarLabios() {
        System.out.println("Hidratando os lábios...");
    }

    public void aumentarLabios() {
        System.out.println("Aumentando os lábios...");
    }

    public void trazerAutoEstima() {
        System.out.println("Trazendo autoestima ao consumidor...");
    }

    public void preencherCor() {
        System.out.println("Preenchendo os lábios com a cor...");
    }

    public void contornarLabios() {
        System.out.println("Contornando os lábios...");
    }
}
