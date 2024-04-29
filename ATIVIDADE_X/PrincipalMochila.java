public class PrincipalMochila {
    public static void main(String[] args) {
        Mochila mochila = new Mochila("Nike", "Preto", "Escolar", 5);

        System.out.println("A marca da mochila é: " + mochila.getMarca());
        System.out.println("A cor da mochila é: " + mochila.getCor());
        System.out.println("O modelo da mochila é: " + mochila.getModelo());
        System.out.println("O número de compartimentos da mochila é: " + mochila.getCompartimentos());

        mochila.guardar();
        mochila.abrir();
        mochila.ajustarAlca();
        mochila.transportar();
        mochila.esconder();
    }
}
