package org.example;

public class CoolaboradorRh extends Coolaborador {

    public CoolaboradorRh(Coolaborador superior) {
        listaChamados.add(TipoChamadoTrabalhista.getTipoChamadoContratual());
        setCoolaboradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "RH";
    }

}