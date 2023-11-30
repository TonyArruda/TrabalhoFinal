public class Animal {
    private String nome;
    private Int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    get int getIdade(){
        return idade;
    }

    public void emitirSom(){
        System.out.print("Emitir som");    
    }

    public String correr(){
        return nome + " está correndo!!!";
    }
    
}
