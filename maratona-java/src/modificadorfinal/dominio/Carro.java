package modificadorfinal.dominio;

// É possível deixar uma classe anotada com final
// Ex.: public final class Carro
public class Carro {
    private String nome;

    // Constantes são atributos que não são modificados nunca;
    // São definidos através da palavra final;
    // Pela convenção devem ser criadas em UPPER CASE separadas com underscore/underline ;
    public static final double VELOCIDADE_LIMITE; // = 250

    // Ou.....

    static {
        VELOCIDADE_LIMITE = 250;
    }

    // A referencia que a variável comprador tem para este objeto nunca poderá ser alterada;
    public static final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
