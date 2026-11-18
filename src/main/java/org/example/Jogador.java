package org.example;

public class Jogador {

    public boolean transferir() {
        return JogadorFacade.verificarPendenciasTransferencia(this);
    }
}
