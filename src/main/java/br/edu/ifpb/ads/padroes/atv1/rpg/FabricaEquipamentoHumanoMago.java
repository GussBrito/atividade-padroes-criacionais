package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoHumanoMago implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Cajado Mágico", 15, "Cajado"); }
    public Armadura criarArmadura() { return new Armadura("Vestes Mágicas", 8, "Leve"); }
}