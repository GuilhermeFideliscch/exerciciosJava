public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Sessao sessao1 = new Sessao(1,40,"10:30");
        Sessao sessao2 = new Sessao(2,40,"10:30");
        Sessao sessao3 = new Sessao(3,40,"10:30");

        Filme filme1 = new Filme("titulo 1", 2.3);
        Filme filme2 = new Filme("titulo 2", 1.5);
        Filme filme3 = new Filme("titulo 3", 2.1);

        Poltrona poltrona1 = new Poltrona("A1");
        Poltrona poltrona2 = new Poltrona("A2");
        Poltrona poltrona3 = new Poltrona("A3");
        Poltrona poltrona4 = new Poltrona("A4");
        Poltrona poltrona5 = new Poltrona("A5");
        Poltrona poltrona6 = new Poltrona("A1");
        Poltrona poltrona7 = new Poltrona("A2");
        Poltrona poltrona8 = new Poltrona("A3");
        Poltrona poltrona9 = new Poltrona("A4");
        Poltrona poltrona10 = new Poltrona("A5");
        Poltrona poltrona11 = new Poltrona("A1");
        Poltrona poltrona12 = new Poltrona("A2");
        Poltrona poltrona13 = new Poltrona("A3");
        Poltrona poltrona14 = new Poltrona("A4");
        Poltrona poltrona15 = new Poltrona("A5");

        Cliente cliente1 = new Cliente("nome1", "A1");
        Cliente cliente2 = new Cliente("nome2", "A3");
        Cliente cliente3 = new Cliente("nome3", "A1");
        Cliente cliente4 = new Cliente("nome4", "A2");
        Cliente cliente5 = new Cliente("nome5", "A2");

        cinema.adicionarSessao(sessao1);
        cinema.adicionarSessao(sessao2);
        cinema.adicionarSessao(sessao3);

        sessao1.adicionarPoltrona(poltrona1);
        sessao1.adicionarPoltrona(poltrona2);
        sessao1.adicionarPoltrona(poltrona3);
        sessao1.adicionarPoltrona(poltrona4);
        sessao1.adicionarPoltrona(poltrona5);
        sessao2.adicionarPoltrona(poltrona6);
        sessao2.adicionarPoltrona(poltrona7);
        sessao2.adicionarPoltrona(poltrona8);
        sessao2.adicionarPoltrona(poltrona9);
        sessao2.adicionarPoltrona(poltrona10);
        sessao3.adicionarPoltrona(poltrona11);
        sessao3.adicionarPoltrona(poltrona12);
        sessao3.adicionarPoltrona(poltrona13);
        sessao3.adicionarPoltrona(poltrona14);
        sessao3.adicionarPoltrona(poltrona15);

        cinema.lugaresDisponiveis(1);
        cinema.lugaresDisponiveis(2);
        cinema.lugaresDisponiveis(3);

        cinema.confirmarOcupacaoPoltrona(1, cliente1, "A1");
        cinema.confirmarOcupacaoPoltrona(2, cliente2, "A3");
        cinema.confirmarOcupacaoPoltrona(3, cliente3, "A2");
        cinema.confirmarOcupacaoPoltrona(1, cliente4, "A2");
        cinema.confirmarOcupacaoPoltrona(2, cliente5, "A2");

        cinema.lugaresDisponiveis(1);
        cinema.lugaresDisponiveis(2);
        cinema.lugaresDisponiveis(3);

        cinema.confirmarDesocupacaoPoltrona(1, cliente1, "A1");

        cinema.lugaresDisponiveis(1);
        cinema.lugaresDisponiveis(2);
        cinema.lugaresDisponiveis(3);
    }
}
