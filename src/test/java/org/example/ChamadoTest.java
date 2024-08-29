package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    CoolaboradorGestor gestor;
    CoolaboradorRh rh;
    CoolaboradorTi ti;

    @BeforeEach
    void setUp() {
        gestor = new CoolaboradorGestor(null);
        rh = new CoolaboradorRh(gestor);
        ti = new CoolaboradorTi(rh);

    }

    @Test
    void deveRetornarTiChamadoInstalacao() {
        assertEquals("Tec. Tecnologia", ti.realizarChamado(new Chamado(TipoChamadoInstalacao.getTipoChamadoInstalacao())));
    }


    @Test
    void deveRetornarRhChamadoContratual() {
        assertEquals("RH", ti.realizarChamado(new Chamado(TipoChamadoTrabalhista.getTipoChamadoContratual())));
    }

    @Test
    void deveRetornarReitorParaAssinaturaDiploma() {
        assertEquals("Gestor", ti.realizarChamado(new Chamado(TipoChamadoOrganizacional.getTipoChamadoOrganizacional())));
    }

    @Test
    void deveRetornarSemResponsavelParaChamado() {
        assertEquals("Sem responsável", ti.realizarChamado(new Chamado(TipoChamadoPagamento.TipoChamadoPagamento())));
    }

}