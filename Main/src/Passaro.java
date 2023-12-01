//Classe para Pássaros
//Esta Classe contém 2 métodos e atributos para o passáro fazer algo. by: Maria Leciene.

public class Passaro extends Animal {
    public Passaro (String nome, int idade) {
        super(nome, idade);
    }

    public String voar() {
        return getNome() + " está voando!!!";
    }

    public String cacarejar() {
        return getNome() + " está cantando!!!";
    }
}