public class Animal {
    String nome;
    String raca;
    String cor;
    int idade;
    double peso;

    public Animal(String nome, String raca, String cor, int idade, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
    }

    public void ladrar()
    {
        System.out.println("au au");
    }

    public void miar()
    {
        System.out.println("miau");
    }

}
class Gato extends Animal {
    public Gato(String nome, String raca, String cor, int idade, double peso) {
        super(nome, raca, cor, idade, peso);
    }
}

class Cao extends Animal {
    public Cao(String nome, String raca, String cor, int idade, double peso) {
        super(nome, raca, cor, idade, peso);
    }
}