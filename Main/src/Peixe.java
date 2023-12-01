//Classe desenvolvida para animais aquáticos: Neste caso o Peixe by: Elizaberth
//Classe Peixe herda métodos e atributos da classe Animal.

public class Peixe extends Animal {
    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    public String nadar() {
        return getNome() + " está nadando na água!!!";

    public String respirar() {
        return getNome() + " respirando fora da água"  
    }

    public String respirarDebaixoDagua() {
        return getNome() + " está respirando debaixo d'água!!!";
    }
}