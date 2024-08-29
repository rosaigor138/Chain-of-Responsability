package org.example;


import java.util.ArrayList;

public abstract class Coolaborador {

    protected ArrayList listaChamados = new ArrayList();
    private Coolaborador coolaboradorSuperior;

    public Coolaborador getcoolaboradorSuperior() {
        return coolaboradorSuperior;
    }

    public void setCoolaboradorSuperior(Coolaborador coolaboradorSuperior) {
        this.coolaboradorSuperior = coolaboradorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String realizarChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        }
        else {
            if (coolaboradorSuperior != null) {
                return coolaboradorSuperior.realizarChamado(chamado);
            }
            else
            {
                return "Sem responsável";
            }
        }
    }
}