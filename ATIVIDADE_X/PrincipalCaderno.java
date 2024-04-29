public class PrincipalCaderno {
    public static void main(String[] args) {
        Caderno caderno = new Caderno("Dura", "Quadriculado", "Pautadas", "Nome, Turma, Disciplina", true, true);

        System.out.println("A capa do caderno é: " + caderno.getCapa());
        System.out.println("O cabeçalho do caderno é: " + caderno.getCabecalho());
        System.out.println("O tipo de linhas do caderno é: " + caderno.getLinhas());
        System.out.println("O espaço para dados pessoais é: " + caderno.getEspacoDadosPessoais());
        System.out.println("Possui porta-folhas? " + (caderno.isPortaFolhas() ? "Sim" : "Não"));
        System.out.println("Possui cartela de adesivos? " + (caderno.isCartelaAdesivos() ? "Sim" : "Não"));

        caderno.serEscrito();
        caderno.desenhar();
        caderno.rasgar();
        caderno.usarComoArmaBranca();
    }
}
