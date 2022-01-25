package modificadorfinal.test;

import modificadorfinal.dominio.Carro;
import modificadorfinal.dominio.Ferrari;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
        carro.COMPRADOR.setNome("Leoleo");
        System.out.println(Carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Wendy");
        ferrari.imprime();

    }
}
