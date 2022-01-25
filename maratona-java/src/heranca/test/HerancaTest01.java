package heranca.test;

import heranca.dominio.Endereco;
import heranca.dominio.Funcionario;
import heranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua da Alegria");
        endereco.setCep("1111-222");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Leozinho");
        pessoa.setCpf("111111111111-77");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("------------------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gigi");
        funcionario.setCpf("22222222222-77");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();


    }
}
