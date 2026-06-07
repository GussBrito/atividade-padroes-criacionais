package br.edu.ifpb.ads.padroes.atv2.sdk.stripe;

public class StripeSDK {
    public void charge(double valor) {
        System.out.println("[Stripe SDK] Realizando cobrança de R$ " + valor + " via Stripe...");
        System.out.println("[Stripe SDK] Cobrança confirmada.");
    }
}