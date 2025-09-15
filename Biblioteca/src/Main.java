public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Senhor dos aneis", "J. R. R. Tolkien");
        Usuario usuario1 = new Usuario("Carlos");
        Livro livro2 = new Livro("Diario de um banana", "Jeff Kinney");
        Usuario usuario2 = new Usuario("robert");

        biblioteca.adicionarUsuarios(usuario1);
        biblioteca.adicionarUsuarios(usuario2);
        biblioteca.emprestarLivro(livro1, usuario1);
        biblioteca.emprestarLivro(livro2, usuario1);
        biblioteca.emprestarLivro(livro1, usuario2);
        biblioteca.listarLivros();
        biblioteca.devolverLivro(livro1, usuario1);
        biblioteca.listarLivros();
        biblioteca.emprestarLivro(livro1, usuario2);
        biblioteca.listarLivros();
    }
}
