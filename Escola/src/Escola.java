import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Turma> turmas;

    public Escola(){
        this.turmas = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma){
        turmas.add(turma);
    }

    public void matricularAluno(Aluno aluno, String código){
        for(Turma turma : turmas) {
            if(turma.getCódigo().equals(código)){
                if(turma.getQuantidadeAlunos() < turma.getCapacidadeMaxima()){
                    turma.alocarAluno(aluno);
                }
            }
        }
    }

    public void desmatricularAluno(Aluno aluno){
        for(Turma turma : turmas) {
            turma.removerAluno(aluno);
        }
    }

    public void listarTurmas(){
        System.out.println("-------------------");
        for(Turma turma : turmas){
            System.out.println("Turma: "+ turma.getCódigo());
            System.out.println("Alunos: ");
            turma.listarAlunos();
            System.out.println("");
        }
        System.out.println("-------------------");
    }

}
