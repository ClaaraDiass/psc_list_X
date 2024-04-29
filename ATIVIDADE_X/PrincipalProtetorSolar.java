public class PrincipalProtetorSolar {
    public static void main(String[] args) {
        ProtetorSolar protetorSolar = new ProtetorSolar("Bisnaga", "FPS 50", "Creme", true, "Plástico");

        System.out.println("A embalagem do protetor solar é: " + protetorSolar.getEmbalagem());
        System.out.println("O rótulo do protetor solar é: " + protetorSolar.getRotulo());
        System.out.println("O líquido do protetor solar é: " + protetorSolar.getLiquido());
        System.out.println("A tampa do protetor solar está " + (protetorSolar.isTampa() ? "presente" : "ausente"));
        System.out.println("O material do protetor solar é: " + protetorSolar.getMaterialPlastico());

        protetorSolar.protegerDoSol();
        protetorSolar.hidratarPele();
        protetorSolar.evitarDoencasDePele();
        protetorSolar.transmitirFrescor();
        protetorSolar.aliviarPele();
    }
}
