import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveRetornarPendenciaDepartamentoMedicoTransferencia() {
        Jogador jogador = new Jogador();
        DepartamentoMedico.getInstancia().addJogadorPendente(jogador);

        assertEquals(false, jogador.transferir());
    }

    @Test
    void deveRetornarPendenciaDepartamentoJuridicoTransferencia() {
        Jogador jogador = new Jogador();
        DepartamentoJuridico.getInstancia().addJogadorPendente(jogador);

        assertEquals(false, jogador.transferir());
    }

    @Test
    void deveRetornarPendenciaFinanceiroTransferencia() {
        Jogador jogador = new Jogador();
        Financeiro.getInstancia().addJogadorPendente(jogador);

        assertEquals(false, jogador.transferir());
    }

    @Test
    void deveRetornarJogadorSemPendenciaTransferencia() {
        Jogador jogador = new Jogador();

        assertEquals(true, jogador.transferir());
    }

}
