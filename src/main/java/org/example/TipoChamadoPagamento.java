package org.example;

public class TipoChamadoPagamento implements TipoChamado {

    private static TipoChamadoPagamento tipoChamadoPagamento = new TipoChamadoPagamento();

    private TipoChamadoPagamento() {};

    public static TipoChamadoPagamento TipoChamadoPagamento() {
        return tipoChamadoPagamento;
    }
}