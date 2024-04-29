public class Porta {
    private String tamanho;
    private String material;
    private String cor;
    private double altura;
    private double largura;

    public Porta(String tamanho, String material, String cor, double altura, double largura) {
        this.tamanho = tamanho;
        this.material = material;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void abrir() {
        System.out.println("Abrindo a porta...");
    }

    public void fechar() {
        System.out.println("Fechando a porta...");
    }

    public void proteger() {
        System.out.println("Protegendo...");
    }
}
