public class Poltrona {
    private String código;
    private boolean ocupado;
    private Cliente clienteAlocado;

    public Poltrona(String código) {
        this.código = código;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setClienteAlocado(Cliente clienteAlocado) {
        this.clienteAlocado = clienteAlocado;
    }

    public String getCódigo() {
        return código;
    }

    public void ocupar(Cliente cliente){
        if(isOcupado()){
            System.out.println("Cadeira ocupada");
        }else{
            setOcupado(true);
            setClienteAlocado(cliente);
        }
    }

    public void desocupar(Cliente cliente){
        if(!isOcupado()){
            System.out.println("Cadeira desocupada");
        }else{
            setOcupado(false);
            setClienteAlocado(null);
        }
    }
}
