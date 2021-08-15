package padroesestruturais.flyweight;

public class Cliente {

    private String cpf;
    private Banco banco;

    public Cliente(String cpf, Banco banco) {
        this.cpf = cpf;
        this.banco = banco;
    }

    public String obterDadosCliente() {
        return "Cliente{" +
                "CPF: " + this.cpf +
                ", Banco: " + banco.getNomeIstituicao() +
                ", CNPJ: " + banco.getCnpj() +
                "}";
    }
}

