package br.edu.ifpb.ads.padroes.atv1.rpg;

import java.util.Map;

public abstract class CriadorPersonagem {

    private static final Map<String, FabricaEquipamento> fabricas = Map.of(
        "Humano_Guerreiro",  new FabricaEquipamentoHumanoGuerreiro(),
        "Humano_Mago",       new FabricaEquipamentoHumanoMago(),
        "Humano_Arqueiro",   new FabricaEquipamentoHumanoArqueiro(),
        "Elfo_Guerreiro",    new FabricaEquipamentoElfoGuerreiro(),
        "Elfo_Mago",         new FabricaEquipamentoElfoMago(),
        "Elfo_Arqueiro",     new FabricaEquipamentoElfoArqueiro(),
        "Orc_Guerreiro",     new FabricaEquipamentoOrcGuerreiro(),
        "Orc_Mago",          new FabricaEquipamentoOrcMago(),
        "Orc_Arqueiro",      new FabricaEquipamentoOrcArqueiro()
    );

    public static Personagem criarPersonagem(String nome, String raca, String classe) {
        FabricaEquipamento fabrica = fabricas.get(raca + "_" + classe);

        if (fabrica == null) {
            System.out.println("Combinação inválida: " + raca + " " + classe);
            return null;
        }

        int[] atributos = resolverAtributos(raca, classe);

        return new Personagem.Builder(nome)
                .raca(raca)
                .classe(classe)
                .forca(atributos[0])
                .inteligencia(atributos[1])
                .agilidade(atributos[2])
                .vida(atributos[3])
                .mana(atributos[4])
                .arma(fabrica.criarArma())
                .armadura(fabrica.criarArmadura())
                .habilidades(resolverHabilidades(raca, classe))
                .build();
    }

    public static Personagem criarPersonagemEspecial(String nome, String raca, String classe) {
        Personagem base = criarPersonagem(nome, raca, classe);
        if (base == null) return null;

        if (raca.equals("Humano") && classe.equals("Guerreiro")) {
            Personagem especial = base.clone();
            especial.setNome(nome + " o Lendário");
            return especial;
        }

        return base;
    }

    private static int[] resolverAtributos(String raca, String classe) {
        return switch (raca + "_" + classe) {
            case "Humano_Guerreiro"  -> new int[]{15, 8,  10, 120, 30};
            case "Humano_Mago"       -> new int[]{6,  18, 8,  80,  150};
            case "Humano_Arqueiro"   -> new int[]{10, 12, 16, 100, 70};
            case "Elfo_Guerreiro"    -> new int[]{12, 14, 16, 100, 60};
            case "Elfo_Mago"         -> new int[]{4,  20, 14, 70,  180};
            case "Elfo_Arqueiro"     -> new int[]{8,  16, 20, 90,  100};
            case "Orc_Guerreiro"     -> new int[]{20, 6,  8,  150, 20};
            case "Orc_Mago"          -> new int[]{10, 14, 6,  100, 120};
            case "Orc_Arqueiro"      -> new int[]{14, 8,  12, 120, 40};
            default -> new int[]{0, 0, 0, 0, 0};
        };
    }

    private static String[] resolverHabilidades(String raca, String classe) {
        return switch (raca + "_" + classe) {
            case "Humano_Guerreiro"  -> new String[]{"Investida", "Bloqueio"};
            case "Humano_Mago"       -> new String[]{"Bola de Fogo", "Cura"};
            case "Humano_Arqueiro"   -> new String[]{"Tiro Certeiro", "Chuva de Flechas"};
            case "Elfo_Guerreiro"    -> new String[]{"Dança das Lâminas", "Agilidade Élfica"};
            case "Elfo_Mago"         -> new String[]{"Magia da Natureza", "Teleporte"};
            case "Elfo_Arqueiro"     -> new String[]{"Tiro Múltiplo", "Camuflagem"};
            case "Orc_Guerreiro"     -> new String[]{"Fúria", "Pancada Devastadora"};
            case "Orc_Mago"          -> new String[]{"Magia Sombria", "Invocação"};
            case "Orc_Arqueiro"      -> new String[]{"Tiro Brutal", "Intimidação"};
            default -> new String[]{};
        };
    }
}