package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro.PagSeguroSDK;

public class PagSeguroGateway implements PagamentoGateway {

    private final PagSeguroSDK sdk = new PagSeguroSDK();

    @Override
    public void processarPagamento(double valor) {
        sdk.efetuarTransacao(valor);
    }
}