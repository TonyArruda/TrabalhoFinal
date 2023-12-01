
//Classe criado por Armando Yuri de Souza Oliveira

//Classe herdar métodos e atributos da Classe Animal

public class Gato extends Animal {
    private String tamanho;

    public String getTamanho(){
        return tamanho;
    }

    public Gato(String nome, int idade, String raca, String tamanho){
        super(nome, idade, tamanho);
	this.tamanho = tamanho;
    }

    public void andar(){
        System.out.println("Está andando!!");
    }

    public String comer(){
        return getNome() + "Está comendo!!";
    }

    public String pular(){
        return getNome() + "Está pulando!!";
    }

}
