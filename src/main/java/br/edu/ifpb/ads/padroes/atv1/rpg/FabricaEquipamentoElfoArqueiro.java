package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoElfoArqueiro implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Arco Longo Élfico", 28, "Arco"); }
    public Armadura criarArmadura() { return new Armadura("Armadura de Couro Élfico", 14, "Média"); }
}