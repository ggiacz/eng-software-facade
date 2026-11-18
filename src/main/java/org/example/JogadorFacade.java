package org.example;

public class JogadorFacade {

    public static boolean verificarPendenciasTransferencia(Jogador jogador) {
        if (DepartamentoMedico.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        if (DepartamentoJuridico.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarJogadorComPendencia(jogador)) {
            return false;
        }
        return true;
    }
}
