package padroesestruturais.proxy;

import jdk.dynalink.linker.LinkerServices;

import java.util.Arrays;
import java.util.List;

public class Cliente implements ICliente{

    private Integer id;
    private String nome;
    private String uf;
    private String cartaoCredito;
    private Float limite;

    public Cliente(Integer id) {
        this.id = id;
        Cliente obj = BD.getCliente(id);
        this.nome = obj.nome;
        this.uf = obj.uf;
        this.cartaoCredito = obj.cartaoCredito;
        this.limite = obj.limite;
    }

    public Cliente(Integer id, String nome, String uf, String cartaoCredito, Float limite) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.cartaoCredito = cartaoCredito;
        this.limite = limite;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.uf, this.cartaoCredito);
    }

    @Override
    public List<Float> obterLimiteCredito(Colaborador colaborador) {
        return Arrays.asList(this.limite);
    }
}
