package org.example;

public class TipoChamadoTrabalhista implements TipoChamado {

    private static TipoChamadoTrabalhista tipoChamadoTrabalhista = new TipoChamadoTrabalhista();

    private TipoChamadoTrabalhista() {};

    public static TipoChamadoTrabalhista getTipoChamadoContratual() {
        return tipoChamadoTrabalhista;
    }

}