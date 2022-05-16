public class Execucao {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("azul");
        carro.setModelo("Uno");
        carro.setPortas(4);
        carro.setCapacidadeTanque(48d);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.ValorTanque(2.3));
    }

}
