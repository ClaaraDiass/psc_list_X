public class PrincipalOculos {
    public static void main(String[] args) {
        Oculos oculos = new Oculos("Polarizada", "Preto", "Flexíveis", "Aço", "Grande");

        System.out.println("A lente dos óculos é: " + oculos.getLente());
        System.out.println("As cores dos óculos são: " + oculos.getCores());
        System.out.println("As hastes dos óculos são: " + oculos.getHastes());
        System.out.println("A armação dos óculos é de: " + oculos.getArmacao());
        System.out.println("O tamanho dos óculos é: " + oculos.getTamanhos());

        oculos.protegerVisao();
        oculos.enxergar();
        oculos.protegerSol();
        oculos.ajustarConformePosicao();
    }
}
