package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BancoFactory {

    private static Map<String, Banco> bancos = new HashMap<>();

    public static Banco getBanco(String nomeInstituicao, String cnpj){
        Banco banco = bancos.get(nomeInstituicao);
        if (banco == null){
            banco = new Banco(nomeInstituicao, cnpj);
            bancos.put(nomeInstituicao, banco);
        }
        return banco;
    }

    public static int getTotalBancos(){
        return bancos.size();
    }
}
