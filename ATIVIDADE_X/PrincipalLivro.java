public class PrincipalLivro {
    public static void main(String[] args) {
        Livro Livro = new Livro("Tinker Bell e os Sete Anões.", 5, 200, 78560, 2000);
        System.out.println("O título do livro é: " + Livro.getTitulo() );

        System.out.println("Existem " + Livro.getCapitulos() + " capítulos à serem lidos." );

        System.out.println("O livro possui " + Livro.getPaginas() + " páginas.");

        System.out.println("O livro possui " + Livro.getLetras() + " letras.");

        System.out.println("Neste livro terá " + Livro.getParagrafos() + " parágrafos à serem lidos.");

        Livro.Acao();
    }
}
