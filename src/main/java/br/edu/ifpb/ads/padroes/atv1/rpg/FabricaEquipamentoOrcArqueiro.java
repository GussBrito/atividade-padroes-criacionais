package br.edu.ifpb.ads.padroes.atv1.rpg;

public class FabricaEquipamentoOrcArqueiro implements FabricaEquipamento {
    public Arma criarArma() { return new Arma("Arco de Osso", 24, "Arco"); }
    public Armadura criarArmadura() { return new Armadura("Couro de Besta", 16, "Média"); }
}