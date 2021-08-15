package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteProxyTest {

    @BeforeEach
    void setUp() {
        BD.addCliente(new Cliente(1, "Claúdio", "MG", "4000123456789010", 125.0f));
        BD.addCliente(new Cliente(2, "Rosane", "RJ", "4000224507908915", 550.0f));
    }

    @Test
    void deveRetornarDadosPessoaisCliente(){
        ClienteProxy cliente = new ClienteProxy(1);
        assertEquals(Arrays.asList("Claúdio", "MG", "4000123456789010"), cliente.obterDadosPessoais());
    }

    @Test
    void deveRetornarLimiteCreditoCliente() {
        Colaborador colaborador = new Colaborador("11133344455", true);
        ClienteProxy cliente = new ClienteProxy(2);

        assertEquals(Arrays.asList(550.0f), cliente.obterLimiteCredito(colaborador));
    }

    @Test
    void deveRetornarExcecaoColaboradorNaoAutorizadoConsultaLimiteCliente(){
        try{
            Colaborador colaborador = new Colaborador("11144433377", false);
            ClienteProxy cliente = new ClienteProxy(2);

            cliente.obterLimiteCredito(colaborador);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Colaborador não é administrador. Acesso não autorizado!", e.getMessage());
        }
    }

}
