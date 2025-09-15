public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite, boolean ocupado) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
    }

    public void ocupar(Hospede hospede){
        if(isOcupado()){
            System.out.println("Quarto ocupado");
        }else{
            setOcupado(true);
            setHospedeAtual(hospede);
        }
    }

    public void liberar(){
        if(!isOcupado()){
            System.out.println("O quarto esta livre");
        }else{
            setOcupado(false);
            setHospedeAtual(null);
        }
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Hospede getHospedeAtual() {
        return hospedeAtual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setHospedeAtual(Hospede hospedeAtual) {
        this.hospedeAtual = hospedeAtual;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }
}
