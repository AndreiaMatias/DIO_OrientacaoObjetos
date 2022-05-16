public class Carro {
    Integer portas;
    String cor;
    String modelo;
    Double capacidadeTanque;


    Carro(){

    }

    Carro(Integer portas, String cor, String modelo, Double capacidadeTanque){
        this.portas = portas;
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Double ValorTanque(Double valorGasolina){
        Double valorTotal = valorGasolina * capacidadeTanque;
        return valorTotal;
    }

    public Double ValorTanque(Double valorGasolina, Double quantidadeGasolinaTanque){
        Double valorTotal = valorGasolina * (capacidadeTanque - quantidadeGasolinaTanque);
        return valorTotal;
    }

    public Double ValorTanque(Double valorGasolina, Double quantidadeGasolinaTanque, boolean fidelidade){
        Double descontoFidelidade = 0.1;
        Double valorTotal =0d;
        if(fidelidade == true){
            valorTotal = valorGasolina * (capacidadeTanque - quantidadeGasolinaTanque) * (1-descontoFidelidade);
        }else{
            valorTotal = valorGasolina * (capacidadeTanque - quantidadeGasolinaTanque);
        }
        return valorTotal;
    }

}
