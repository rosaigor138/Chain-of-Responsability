package org.example;


public class CoolaboradorGestor extends Coolaborador {

    public CoolaboradorGestor(Coolaborador superior) {
        listaChamados.add(TipoChamadoOrganizacional.getTipoChamadoOrganizacional());
        setCoolaboradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gestor";
    }

}