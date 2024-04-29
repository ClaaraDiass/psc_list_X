public class Caneta {
    private String ponta;
    private String tinteiro;
    private String tuboCilindrico;
    private String marcaEmRelevo;
    private boolean tampa;
    private String materialPlastico;

    public Caneta(String ponta, String tinteiro, String tuboCilindrico, String marcaEmRelevo, boolean tampa, String materialPlastico) {
        this.ponta = ponta;
        this.tinteiro = tinteiro;
        this.tuboCilindrico = tuboCilindrico;
        this.marcaEmRelevo = marcaEmRelevo;
        this.tampa = tampa;
        this.materialPlastico = materialPlastico;
    }

    public String getPonta() {
        return ponta;
    }

    public void setPonta(String ponta) {
        this.ponta = ponta;
    }

    public String getTinteiro() {
        return tinteiro;
    }

    public void setTinteiro(String tinteiro) {
        this.tinteiro = tinteiro;
    }

    public String getTuboCilindrico() {
        return tuboCilindrico;
    }

    public void setTuboCilindrico(String tuboCilindrico) {
        this.tuboCilindrico = tuboCilindrico;
    }

    public String getMarcaEmRelevo() {
        return marcaEmRelevo;
    }

    public void setMarcaEmRelevo(String marcaEmRelevo) {
        this.marcaEmRelevo = marcaEmRelevo;
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

    public void escrever() {
        System.out.println("Escrevendo algo");
    }

    public void desenhar() {
        System.out.println("Desenhando algo");
    }

    public void assinar() {
        System.out.println("Assinando algo");
    }

    public void sublinhar() {
        System.out.println("Sublinhando algo");
    }

    public void rabiscar() {
        System.out.println("Rabiscando algo");
    }
}
