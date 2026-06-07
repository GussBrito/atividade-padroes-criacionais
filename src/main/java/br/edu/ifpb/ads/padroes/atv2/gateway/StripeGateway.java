package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.sdk.stripe.StripeSDK;

public class StripeGateway implements PagamentoGateway {

    private final StripeSDK sdk = new StripeSDK();

    @Override
    public void processarPagamento(double valor) {
        sdk.charge(valor);
    }
}