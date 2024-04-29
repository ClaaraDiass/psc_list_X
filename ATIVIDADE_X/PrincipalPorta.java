public class PrincipalPorta {
    public static void main(String[] args) {
        Porta porta = new Porta("Padrão", "Madeira", "Marrom", 200.0, 80.0);

        System.out.println("O tamanho da porta é: " + porta.getTamanho());
        System.out.println("O material da porta é: " + porta.getMaterial());
        System.out.println("A cor da porta é: " + porta.getCor());
        System.out.println("A altura da porta é: " + porta.getAltura() + " cm");
        System.out.println("A largura da porta é: " + porta.getLargura() + " cm");

        porta.abrir();
        porta.fechar();
        porta.proteger();
    }
}
