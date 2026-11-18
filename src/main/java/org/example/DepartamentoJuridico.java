package org.example;

public class DepartamentoJuridico extends SetorClube {

    private static DepartamentoJuridico departamentoJuridico = new DepartamentoJuridico();

    private DepartamentoJuridico() {};

    public static DepartamentoJuridico getInstancia() {
        return departamentoJuridico;
    }
}
