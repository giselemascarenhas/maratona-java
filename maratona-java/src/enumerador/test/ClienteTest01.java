package enumerador.test;

import enumerador.dominio.Cliente;
import enumerador.dominio.TipoCliente;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gigi", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("LeoLeo", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
