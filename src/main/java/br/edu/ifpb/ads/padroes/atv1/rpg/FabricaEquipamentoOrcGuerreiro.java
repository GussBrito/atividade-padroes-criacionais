package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoOrcGuerreiro implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Machado de Guerra", 30, "Machado"); }
    public Armadura criarArmadura() { return new Armadura("Armadura Brutal", 25, "Pesada"); }
}