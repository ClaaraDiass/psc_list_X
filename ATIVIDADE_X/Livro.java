public class Livro{

    private String Titulo;
    private int Capitulos;
    private int Paginas;
    private int Letras;
    private int Paragrafos;

    public Livro (String Titulo, int Capitulos, int Paginas, int Letras, int Paragrafos) {

        this.Titulo = Titulo;
        this.Capitulos = Capitulos;
        this.Paginas = Paginas;
        this.Letras = Letras;
        this.Paragrafos = Paragrafos;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int capitulos) {
        Capitulos = capitulos;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int paginas) {
        Paginas = paginas;
    }

    public int getLetras() {
        return Letras;
    }

    public void setLetras(int letras) {
        Letras = letras;
    }

    public int getParagrafos() {
        return Paragrafos;
    }

    public void setParagrafos(int paragrafos) {
        Paragrafos = paragrafos;
    }

    public void Acao() {
        System.out.println("A ação do livro é: Transmitir informações ao leitor e Desenvolver habilidades cognitivas através da leitura.");
    }

}