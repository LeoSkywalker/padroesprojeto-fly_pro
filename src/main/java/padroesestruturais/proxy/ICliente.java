package padroesestruturais.proxy;

import java.util.List;

public interface ICliente {
    List<String> obterDadosPessoais();
    List<Float> obterLimiteCredito(Colaborador colaborador);
}
