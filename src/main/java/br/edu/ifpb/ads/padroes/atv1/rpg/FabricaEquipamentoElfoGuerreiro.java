package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoElfoGuerreiro implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Lâmina Élfica", 22, "Espada"); }
    public Armadura criarArmadura() { return new Armadura("Cota de Malha Élfica", 15, "Média"); }
}