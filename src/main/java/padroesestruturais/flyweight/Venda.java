package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<Cliente> clientes = new ArrayList<>();

    public void comprar(String cpfCliente, String nomeInsituicao, String cnpj){
        Banco banco = BancoFactory.getBanco(nomeInsituicao, cnpj);
        Cliente cliente = new Cliente(cpfCliente, banco);
        clientes.add(cliente);
    }

    public List<String> obterClientes(){
        List<String> resultado = new ArrayList<String>();
        for (Cliente cliente : this.clientes){
            resultado.add(cliente.obterDadosCliente());
        }
        return resultado;
    }
}
