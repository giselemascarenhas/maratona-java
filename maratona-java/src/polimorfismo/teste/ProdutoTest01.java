package polimorfismo.teste;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {
        Computador computador = new Computador("MAC", 20000);
        Tomate tomate = new Tomate("Tomate Cereja", 6);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
