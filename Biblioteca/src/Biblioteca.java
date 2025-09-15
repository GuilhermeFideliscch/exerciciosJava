import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Livro> livros;

    public Biblioteca() {
        this.usuarios = new ArrayList<Usuario>();
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarUsuarios(Usuario usuario){
        usuarios.add(usuario);
    }

    public void emprestarLivro(Livro livro, Usuario usuario){
        for (Usuario u : usuarios){
            if(u.equals(usuario)){
                usuario.adicionarLivro(livro);
            }
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario){
        for(Usuario u : usuarios){
            if(u.equals(usuario)){
                usuario.removerLivro(livro);
            }
        }
    }

    public void listarLivros(){
        for (Usuario usuario : usuarios){
            System.out.println("------------");
            System.out.println("Nome: " + usuario.getNome());
            usuario.listarLivrosUsuario();
            System.out.println("------------");
        }
        System.out.println("");
    }
}
