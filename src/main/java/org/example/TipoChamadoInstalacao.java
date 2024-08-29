package org.example;

public class TipoChamadoInstalacao implements TipoChamado {

    private static TipoChamadoInstalacao tipoChamadoInstalacao = new TipoChamadoInstalacao();

    private TipoChamadoInstalacao() {};

    public static TipoChamadoInstalacao getTipoChamadoInstalacao() {
        return tipoChamadoInstalacao;
    }

}