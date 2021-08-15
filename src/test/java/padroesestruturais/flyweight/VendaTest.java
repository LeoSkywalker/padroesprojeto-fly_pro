package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {

    @Test
    void deveRetornarClientes() {
        Venda venda = new Venda();
        venda.comprar("11122233315", "Banco do Brasil", "11222333000144");
        venda.comprar("12233344426", "Banco do Brasil", "11222333000144");
        venda.comprar("13344455537", "Banco Bradesco", "11333222111145");
        venda.comprar("14455544448", "Nubank", "11444555222146");

        List<String> resultado = Arrays.asList(
                "Cliente{CPF: 11122233315, Banco: Banco do Brasil, CNPJ: 11222333000144}",
                "Cliente{CPF: 12233344426, Banco: Banco do Brasil, CNPJ: 11222333000144}",
                "Cliente{CPF: 13344455537, Banco: Banco Bradesco, CNPJ: 11333222111145}",
                "Cliente{CPF: 14455544448, Banco: Nubank, CNPJ: 11444555222146}");

        assertEquals(resultado, venda.obterClientes());
    }

    @Test
    void deveRetornarTotalBancos() {
        Venda venda = new Venda();
        venda.comprar("11122233315", "Banco do Brasil", "11222333000144");
        venda.comprar("12233344426", "Banco do Brasil", "11222333000144");
        venda.comprar("13344455537", "Banco Bradesco", "11333222111145");
        venda.comprar("14455544448", "Nubank", "11444555222146");

        assertEquals(3, BancoFactory.getTotalBancos());
    }
}
