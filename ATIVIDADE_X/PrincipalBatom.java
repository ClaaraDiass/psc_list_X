public class PrincipalBatom {
    public static void main(String[] args) {
        Batom batom = new Batom("Bastão", true, "Vermelho", "Maybelline", "Morango");

        System.out.println("A embalagem do batom é: " + batom.getEmbalagem());
        System.out.println("A tampa do batom está " + (batom.isTampa() ? "presente" : "ausente"));
        System.out.println("A coloração do batom é: " + batom.getColoracao());
        System.out.println("A marca do batom é: " + batom.getMarca());
        System.out.println("O cheiro do batom é: " + batom.getCheiro());

        batom.hidratarLabios();
        batom.aumentarLabios();
        batom.trazerAutoEstima();
        batom.preencherCor();
        batom.contornarLabios();
    }
}
