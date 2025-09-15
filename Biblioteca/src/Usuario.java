import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarLivro(Livro livro){
        if(livro.isEmprestado()){
            System.out.println("Livro indisponivel");
        }else {
            livrosEmprestados.add(livro);
            livro.setEmprestado(true);
        }
    }

    public void removerLivro(Livro livro){
        if(!livro.isEmprestado()){
            System.out.println("Livro nao emprestado");
        }else {
            livrosEmprestados.remove(livro);
            livro.setEmprestado(false);
        }
    }

    public void listarLivrosUsuario(){
        for (Livro livro : livrosEmprestados){
            System.out.println("Nome do livro: "+ livro.getTitulo());
            System.out.println("Autor: "+ livro.getAutor());
        }
    }
}
