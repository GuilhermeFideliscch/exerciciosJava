public class Carro {
    private String placa;
    private String modelo;
    private String dono;

    public Carro(String placa, String modelo, String dono) {
        this.placa = placa;
        this.modelo = modelo;
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDono() {
        return dono;
    }
}
