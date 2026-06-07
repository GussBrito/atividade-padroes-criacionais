package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoElfoMago implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Cajado da Natureza", 18, "Cajado"); }
    public Armadura criarArmadura() { return new Armadura("Mantos Élficos", 10, "Leve"); }
}