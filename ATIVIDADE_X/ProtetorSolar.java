public class ProtetorSolar {
    private String embalagem;
    private String rotulo;
    private String liquido;
    private boolean tampa;
    private String materialPlastico;

    public ProtetorSolar(String embalagem, String rotulo, String liquido, boolean tampa, String materialPlastico) {
        this.embalagem = embalagem;
        this.rotulo = rotulo;
        this.liquido = liquido;
        this.tampa = tampa;
        this.materialPlastico = materialPlastico;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getLiquido() {
        return liquido;
    }

    public void setLiquido(String liquido) {
        this.liquido = liquido;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public String getMaterialPlastico() {
        return materialPlastico;
    }

    public void setMaterialPlastico(String materialPlastico) {
        this.materialPlastico = materialPlastico;
    }

    public void protegerDoSol() {
        System.out.println("Protegendo do Sol...");
    }

    public void hidratarPele() {
        System.out.println("Hidratando a pele...");
    }

    public void evitarDoencasDePele() {
        System.out.println("Evitando possíveis doenças de pele...");
    }

    public void transmitirFrescor() {
        System.out.println("Transmitindo frescor na pele...");
    }

    public void aliviarPele() {
        System.out.println("Aliviando a pele...");
    }
}
