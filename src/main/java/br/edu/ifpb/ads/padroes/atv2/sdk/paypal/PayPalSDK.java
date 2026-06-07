package br.edu.ifpb.ads.padroes.atv2.sdk.paypal;

public class PayPalSDK {
    public void enviarPagamento(double valor) {
        System.out.println("[PayPal SDK] Enviando pagamento de R$ " + valor + " para API do PayPal...");
        System.out.println("[PayPal SDK] Pagamento autorizado.");
    }
}