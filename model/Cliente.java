package model;

public class Cliente implements Cloneable{

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Cliente clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Cliente) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
