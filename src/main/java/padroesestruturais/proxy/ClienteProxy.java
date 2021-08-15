package padroesestruturais.proxy;

import java.util.List;

public class ClienteProxy implements ICliente{

    private Cliente cliente;
    private Integer id;

    public ClienteProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if(this.cliente == null){
            this.cliente = new Cliente(this.id);
        }
        return this.cliente.obterDadosPessoais();
    }

    @Override
    public List<Float> obterLimiteCredito(Colaborador colaborador) {
        if(!colaborador.isAdmin()){
            throw new IllegalArgumentException("Colaborador não é administrador. Acesso não autorizado!");
        }
        if(this.cliente == null) {
            this.cliente = new Cliente(this.id);
        }
        return this.cliente.obterLimiteCredito(colaborador);
    }
}
