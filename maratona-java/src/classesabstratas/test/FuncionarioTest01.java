package classesabstratas.test;

import classesabstratas.dominio.Desenvolvedor;
import classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Gigi", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 12000);
        System.out.println(desenvolvedor);
    }
}
