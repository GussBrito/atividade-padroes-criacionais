package br.edu.ifpb.ads.padroes.atv2;

import com.google.inject.Inject;

public class PagamentoService {

    private final PagamentoGateway gateway;

    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void pagar(double valor) {
        System.out.println("Iniciando pagamento de R$ " + valor);
        gateway.processarPagamento(valor);
        System.out.println("Pagamento finalizado.\n");
    }
}