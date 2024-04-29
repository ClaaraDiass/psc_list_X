public class PrincipalCaneta {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Fina", "Azul", "Transparente", "BIC", true, "Plástico");

        System.out.println("A ponta da caneta é: " + caneta.getPonta());
        System.out.println("O tinteiro da caneta é: " + caneta.getTinteiro());
        System.out.println("O tubo cilíndrico da caneta é: " + caneta.getTuboCilindrico());
        System.out.println("A marca em relevo da caneta é: " + caneta.getMarcaEmRelevo());
        System.out.println("A tampa da caneta está " + (caneta.isTampa() ? "presente" : "ausente"));
        System.out.println("O material da caneta é: " + caneta.getMaterialPlastico());

        caneta.escrever();
        caneta.desenhar();
        caneta.assinar();
        caneta.sublinhar();
        caneta.rabiscar();
    }
}
