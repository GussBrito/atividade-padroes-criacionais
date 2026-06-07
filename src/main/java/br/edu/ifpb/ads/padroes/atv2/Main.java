package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.modulo.PayPalModulo;
import br.edu.ifpb.ads.padroes.atv2.modulo.StripeModulo;
import br.edu.ifpb.ads.padroes.atv2.modulo.PagSeguroModulo;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        Injector paypalInjector = Guice.createInjector(new PayPalModulo());
        PagamentoService servicoPayPal = paypalInjector.getInstance(PagamentoService.class);
        servicoPayPal.pagar(150.00);

        Injector stripeInjector = Guice.createInjector(new StripeModulo());
        PagamentoService servicoStripe = stripeInjector.getInstance(PagamentoService.class);
        servicoStripe.pagar(299.99);

        Injector pagSeguroInjector = Guice.createInjector(new PagSeguroModulo());
        PagamentoService servicoPagSeguro = pagSeguroInjector.getInstance(PagamentoService.class);
        servicoPagSeguro.pagar(89.90);
    }
}