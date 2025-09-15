public class Vaga {
    private int numero;
    private boolean ocupado;
    private Carro carroAtual;

    public Vaga(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Carro getCarroAtual() {
        return carroAtual;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setCarroAtual(Carro carroAtual) {
        this.carroAtual = carroAtual;
    }

    public void estacionar(Carro carroAtual){
        if(isOcupado()){
            System.out.println("Vaga ocupada");
        }else{
            setOcupado(true);
            setCarroAtual(carroAtual);
        }
    }

    public void liberar(Carro carroAtual){
        if(!isOcupado()){
            System.out.println("Vaga vazia");
        }else{
            setOcupado(false);
            setCarroAtual(null);
        }
    }

}
