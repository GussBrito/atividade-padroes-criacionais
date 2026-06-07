package br.edu.ifpb.ads.padroes.atv2.modulo;

import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagSeguroGateway;
import com.google.inject.AbstractModule;

public class PagSeguroModulo extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(PagSeguroGateway.class);
    }
}