public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Turma turma1 = new Turma("4A", 50);
        Turma turma2 = new Turma("4B", 50);

        Aluno aluno1 = new Aluno("Nome1", "1");
        Aluno aluno2 = new Aluno("Nome2", "2");
        Aluno aluno3 = new Aluno("Nome3", "3");
        Aluno aluno4 = new Aluno("Nome4", "4");
        Aluno aluno5 = new Aluno("Nome5", "5");
        Aluno aluno6 = new Aluno("Nome6", "6");
        Aluno aluno7 = new Aluno("Nome7", "7");
        Aluno aluno8 = new Aluno("Nome8", "8");
        Aluno aluno9 = new Aluno("Nome9", "9");
        Aluno aluno10 = new Aluno("Nome10", "10");

        escola.adicionarTurma(turma1);
        escola.adicionarTurma(turma2);
        escola.listarTurmas();
        escola.matricularAluno(aluno1,"4A");
        escola.matricularAluno(aluno2,"4A");
        escola.matricularAluno(aluno3,"4B");
        escola.matricularAluno(aluno4,"4B");
        escola.listarTurmas();
        escola.desmatricularAluno(aluno1);
        escola.desmatricularAluno(aluno3);
        escola.listarTurmas();
        escola.matricularAluno(aluno1,"4A");
        escola.matricularAluno(aluno3,"4B");
        escola.matricularAluno(aluno5,"4A");
        escola.matricularAluno(aluno6,"4B");
        escola.matricularAluno(aluno7,"4A");
        escola.matricularAluno(aluno8,"4B");
        escola.matricularAluno(aluno9,"4A");
        escola.matricularAluno(aluno10,"4B");
        escola.listarTurmas();

    }
}
