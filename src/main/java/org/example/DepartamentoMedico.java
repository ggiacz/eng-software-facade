package org.example;

public class DepartamentoMedico extends SetorClube {

    private static DepartamentoMedico departamentoMedico = new DepartamentoMedico();

    private DepartamentoMedico() {};

    public static DepartamentoMedico getInstancia() {
        return departamentoMedico;
    }
}
