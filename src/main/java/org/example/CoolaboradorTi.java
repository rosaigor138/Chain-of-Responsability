package org.example;

public class CoolaboradorTi extends Coolaborador {

    public CoolaboradorTi(Coolaborador superior) {
        listaChamados.add(TipoChamadoInstalacao.getTipoChamadoInstalacao());
        setCoolaboradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Tec. Tecnologia";
    }

}