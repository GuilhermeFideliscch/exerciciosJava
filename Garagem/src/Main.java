public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem();
        Vaga vaga1 = new Vaga(1);
        Vaga vaga2 = new Vaga(2);
        Vaga vaga3 = new Vaga(3);

        Carro corolla = new Carro("12345", "corolla 2020", "sla");
        Carro supra = new Carro("12345679", "supra 2020", "sla2");

        garagem.adicionarVaga(vaga1);
        garagem.adicionarVaga(vaga2);
        garagem.adicionarVaga(vaga3);

        garagem.mostrarVagas();
        garagem.ocuparVaga(corolla,1);
        garagem.ocuparVaga(supra,1);
        garagem.ocuparVaga(supra,3);
        garagem.mostrarVagas();
        garagem.liberarVaga(corolla, 1);
        garagem.mostrarVagas();

    }
}
