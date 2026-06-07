package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoHumanoArqueiro implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Arco Élfico", 20, "Arco"); }
    public Armadura criarArmadura() { return new Armadura("Armadura de Couro", 12, "Média"); }
}