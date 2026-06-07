package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.sdk.paypal.PayPalSDK;

public class PayPalGateway implements PagamentoGateway {

    private final PayPalSDK sdk = new PayPalSDK();

    @Override
    public void processarPagamento(double valor) {
        sdk.enviarPagamento(valor);
    }
}