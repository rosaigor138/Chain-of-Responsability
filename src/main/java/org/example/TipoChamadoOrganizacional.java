package org.example;

public class TipoChamadoOrganizacional implements TipoChamado {

    private static TipoChamadoOrganizacional tipoChamadoOrganizacional = new TipoChamadoOrganizacional();

    private TipoChamadoOrganizacional() {};

    public static TipoChamadoOrganizacional getTipoChamadoOrganizacional() {
        return tipoChamadoOrganizacional;
    }
}