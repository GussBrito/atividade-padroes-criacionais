package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoOrcMago implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Cajado Tribal", 12, "Cajado"); }
    public Armadura criarArmadura() { return new Armadura("Vestes Xamânicas", 6, "Leve"); }
}