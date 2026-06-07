package br.edu.ifpb.ads.padroes.atv1.rpg;

public class Personagem implements Cloneable {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    private Personagem() {}

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public String getClasse() { return classe; }
    public int getForca() { return forca; }
    public int getInteligencia() { return inteligencia; }
    public int getAgilidade() { return agilidade; }
    public int getVida() { return vida; }
    public int getMana() { return mana; }
    public Arma getArma() { return arma; }
    public Armadura getArmadura() { return armadura; }
    public String[] getHabilidades() { return habilidades; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public Personagem clone() {
        try {
            Personagem copia = (Personagem) super.clone();
            copia.arma = this.arma.clone();
            copia.armadura = this.armadura.clone();
            copia.habilidades = this.habilidades.clone();
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }

    public static class Builder {

        private final Personagem personagem;

        public Builder(String nome) {
            personagem = new Personagem();
            personagem.nome = nome;
        }

        public Builder raca(String raca) {
            personagem.raca = raca;
            return this;
        }

        public Builder classe(String classe) {
            personagem.classe = classe;
            return this;
        }

        public Builder forca(int forca) {
            personagem.forca = forca;
            return this;
        }

        public Builder inteligencia(int inteligencia) {
            personagem.inteligencia = inteligencia;
            return this;
        }

        public Builder agilidade(int agilidade) {
            personagem.agilidade = agilidade;
            return this;
        }

        public Builder vida(int vida) {
            personagem.vida = vida;
            return this;
        }

        public Builder mana(int mana) {
            personagem.mana = mana;
            return this;
        }

        public Builder arma(Arma arma) {
            personagem.arma = arma;
            return this;
        }

        public Builder armadura(Armadura armadura) {
            personagem.armadura = armadura;
            return this;
        }

        public Builder habilidades(String... habilidades) {
            personagem.habilidades = habilidades;
            return this;
        }

        public Personagem build() {
            if (personagem.nome == null || personagem.raca == null || personagem.classe == null) {
                throw new IllegalStateException("Nome, raça e classe são obrigatórios.");
            }
            return personagem;
        }
    }
}