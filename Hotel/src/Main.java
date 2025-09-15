public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Mar Azul", "Avenida sei la das quantas");
        Quarto quarto1 = new Quarto(12, "Standard", 19.99, false);
        Quarto quarto2 = new Quarto(14, "Standard", 19.99, false);
        Quarto quarto3 = new Quarto(16, "Deluxe", 39.99, false);
        Quarto quarto4 = new Quarto(18, "Premium", 29.99, false);

        hotel.adicionarQuartos(quarto1);
        hotel.adicionarQuartos(quarto2);
        hotel.adicionarQuartos(quarto3);
        hotel.adicionarQuartos(quarto4);

        Hospede hospede1 = new Hospede("Joao carvalho", "999999999-99");
        Hospede hospede2 = new Hospede("Maurilio campano", "888888888-88");

        hotel.exibirRelatorioOcupacao();
        quarto1.ocupar(hospede1);
        quarto1.ocupar(hospede2);
        quarto3.ocupar(hospede2);
        hotel.exibirRelatorioOcupacao();
        hotel.realizarCheckout(12);
        hotel.exibirRelatorioOcupacao();
    }
}
