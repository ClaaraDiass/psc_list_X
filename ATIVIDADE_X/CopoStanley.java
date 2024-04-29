public class CopoStanley {
    private String material;
    private String coresVariadas;
    private boolean tampa;
    private int contagemMl;
    private boolean altaPerformanceResfriamento;

    public CopoStanley(String material, String coresVariadas, boolean tampa, int contagemMl, boolean altaPerformanceResfriamento) {
        this.material = material;
        this.coresVariadas = coresVariadas;
        this.tampa = tampa;
        this.contagemMl = contagemMl;
        this.altaPerformanceResfriamento = altaPerformanceResfriamento;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCoresVariadas() {
        return coresVariadas;
    }

    public void setCoresVariadas(String coresVariadas) {
        this.coresVariadas = coresVariadas;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public int getContagemMl() {
        return contagemMl;
    }

    public void setContagemMl(int contagemMl) {
        this.contagemMl = contagemMl;
    }

    public boolean isAltaPerformanceResfriamento() {
        return altaPerformanceResfriamento;
    }

    public void setAltaPerformanceResfriamento(boolean altaPerformanceResfriamento) {
        this.altaPerformanceResfriamento = altaPerformanceResfriamento;
    }

    public void beber() {
        System.out.println("Bebendo...");
    }

    public void jogarAguaNoProfessor() {
        System.out.println("Jogando água no professor... memekkkkkkkkkkkk");
    }

    public void resistenteAoCalor() {
        System.out.println("Resistente ao calor...");
    }

    public void servirMaisDeUmaBebida() {
        System.out.println("Usado para servir mais de uma bebida...");
    }
}
