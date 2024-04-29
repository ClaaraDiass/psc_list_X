public class PrincipalComputador {
    public static void main(String[] args) {
        Computador computador = new Computador("LED 15.6 polegadas", "Windows 10", "Intel Core i7", "8GB DDR4", "Asus Prime", "NVIDIA GeForce GTX 1660", "SSD 512GB");

        System.out.println("A tela do computador é: " + computador.getTela());
        System.out.println("O sistema operacional é: " + computador.getSistema());
        System.out.println("O processador é: " + computador.getProcessador());
        System.out.println("A memória é: " + computador.getMemoria());
        System.out.println("A placa mãe é: " + computador.getPlacaMae());
        System.out.println("A placa de vídeo é: " + computador.getPlacaVideo());
        System.out.println("O armazenamento é: " + computador.getArmazenamento());

        computador.ligarComputador();
        computador.inicializarSistemaOperacional();
        computador.abrirProgramas();
        computador.navegarInternet();
        computador.salvarDocumentos();
    }
}
