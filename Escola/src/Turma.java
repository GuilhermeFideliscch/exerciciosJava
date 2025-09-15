import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String código;
    private List<Aluno> alunos;
    private int capacidadeMaxima;

    public Turma(String código, int capacidadeMaxima) {
        this.código = código;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunos = new ArrayList<Aluno>();
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public void alocarAluno(Aluno alunoNovo) {
        alunos.add(alunoNovo);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void listarAlunos(){
        for (Aluno aluno : alunos){
            System.out.println("Nome: "+ aluno.getNome() + " Matrícula: "+ aluno.getMatricula());
        }
    }

    public int getQuantidadeAlunos(){
        return alunos.size();
    }
}
