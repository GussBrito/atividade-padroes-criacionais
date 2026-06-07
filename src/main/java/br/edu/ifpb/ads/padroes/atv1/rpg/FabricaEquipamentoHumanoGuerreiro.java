package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoHumanoGuerreiro implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Espada de Ferro", 25, "Espada"); }
    public Armadura criarArmadura() { return new Armadura("Armadura de Placas", 20, "Pesada"); }
}