package padroesestruturais.flyweight;

public class Banco {

    private String nomeIstituicao;
    private String cnpj;

    public Banco(String nomeIstituicao, String cnpj) {
        this.nomeIstituicao = nomeIstituicao;
        this.cnpj = cnpj;
    }

    public String getNomeIstituicao() {
        return nomeIstituicao;
    }

    public String getCnpj() {
        return cnpj;
    }
}
