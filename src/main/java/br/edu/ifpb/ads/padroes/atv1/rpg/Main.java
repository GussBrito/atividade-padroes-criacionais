package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;

public class Main {

    public static void main(String[] args) {

        // Singleton
        ConfiguracaoJogo config1 = ConfiguracaoJogo.getInstance();
        ConfiguracaoJogo config2 = ConfiguracaoJogo.getInstance();
        config1.setNivelDificuldade(3);

        System.out.println("=== Singleton ===");
        System.out.println("Mesma instância: " + (config1 == config2));
        System.out.println("Dificuldade (config2): " + config2.getNivelDificuldade());

        // Builder + Abstract Factory + Factory Method
        System.out.println("\n=== Factory Method + Abstract Factory + Builder ===");
        Personagem guerreiroHumano = CriadorPersonagem.criarPersonagem("Arthur", "Humano", "Guerreiro");
        Personagem magoElfo        = CriadorPersonagem.criarPersonagem("Legolas", "Elfo", "Mago");
        Personagem arqueiroOrc     = CriadorPersonagem.criarPersonagem("Gruk", "Orc", "Arqueiro");

        System.out.println(guerreiroHumano);
        System.out.println("Arma: " + guerreiroHumano.getArma().getNome());
        System.out.println("Armadura: " + guerreiroHumano.getArmadura().getNome());

        System.out.println(magoElfo);
        System.out.println("Arma: " + magoElfo.getArma().getNome());

        System.out.println(arqueiroOrc);
        System.out.println("Arma: " + arqueiroOrc.getArma().getNome());

        // Combinação inválida
        System.out.println("\n=== Combinação inválida ===");
        Personagem invalido = CriadorPersonagem.criarPersonagem("X", "Dragão", "Guerreiro");
        System.out.println("Retornou null: " + (invalido == null));

        // Prototype
        System.out.println("\n=== Prototype ===");
        Personagem especial = CriadorPersonagem.criarPersonagemEspecial("Arthur", "Humano", "Guerreiro");
        System.out.println("Original: " + guerreiroHumano.getNome());
        System.out.println("Clone:    " + especial.getNome());
        System.out.println("São objetos diferentes: " + (guerreiroHumano != especial));
        System.out.println("Armas são objetos diferentes: " + (guerreiroHumano.getArma() != especial.getArma()));
    }
}