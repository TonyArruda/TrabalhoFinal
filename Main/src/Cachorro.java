//Classe criado por Dirceu Vaz Soares Cunha

//Classe herdar métodos e atributos da Classe Aminal

public class Cachorro extends Animal {
    private String raca;

    public String getRaca (){
        return raca;
    }

    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public void emitirSom(){
        System.out.println("Au au!!");
    }

    public String ficaSentado(){
        return getNome() + "Ele ficou sentado!!";
    }
}