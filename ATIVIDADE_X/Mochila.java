public class Mochila {
    private String marca;
    private String cor;
    private String modelo;
    private int compartimentos;

    public Mochila(String marca, String cor, String modelo, int compartimentos) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.compartimentos = compartimentos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(int compartimentos) {
        this.compartimentos = compartimentos;
    }

    public void guardar() {
        System.out.println("Guardando...");
    }

    public void abrir() {
        System.out.println("Abrindo...");
    }

    public void ajustarAlca() {
        System.out.println("Ajustando alça...");
    }

    public void transportar() {
        System.out.println("Transportando...");
    }

    public void esconder() {
        System.out.println("Escondendo...");
    }
}
