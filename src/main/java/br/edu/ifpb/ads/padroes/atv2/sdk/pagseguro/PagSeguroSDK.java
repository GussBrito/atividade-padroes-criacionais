package br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro;

public class PagSeguroSDK {
    public void efetuarTransacao(double valor) {
        System.out.println("[PagSeguro SDK] Efetuando transação de R$ " + valor + " no PagSeguro...");
        System.out.println("[PagSeguro SDK] Transação aprovada.");
    }
}