public class PrincipalCopoStanley {
    public static void main(String[] args) {
        CopoStanley copoStanley = new CopoStanley("Aço Inoxidável", "Prata", true, 500, true);

        System.out.println("O material do copo Stanley é: " + copoStanley.getMaterial());
        System.out.println("As cores disponíveis do copo Stanley são: " + copoStanley.getCoresVariadas());
        System.out.println("A tampa do copo Stanley está " + (copoStanley.isTampa() ? "presente" : "ausente"));
        System.out.println("A contagem de ml do copo Stanley é: " + copoStanley.getContagemMl());
        System.out.println("Alta performance no resfriamento da bebida? " + (copoStanley.isAltaPerformanceResfriamento() ? "Sim" : "Não"));

        copoStanley.beber();
        copoStanley.jogarAguaNoProfessor();
        copoStanley.resistenteAoCalor();
        copoStanley.servirMaisDeUmaBebida();
    }
}
