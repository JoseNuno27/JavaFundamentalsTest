public abstract class Animal {
    public String comer;
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

    public void comer(Comida comida){
        int peso_comido = (int) (comida.quantidade + peso);
        System.out.println(this.nome + " comeu " + comida.nome + " que pesa " + comida.quantidade + " kg");
        System.out.println("Peso atual: " + peso_comido);

    }

    public abstract double calculaExpectativaVida();
}

class Gato extends Animal {
    

    public Gato(String nome, String raca, String cor, int idade, double peso) {
        super(nome, raca, cor, idade, peso);
    }

    public double calculaExpectativaVida() {
        // Example calculation specific for cats
        double expectativa;

        if (idade < 5) {
            expectativa = 18 + peso * 0.3; // Example calculation formula for cats

        } else {
            expectativa = 12 + peso * 0.2; // Another example calculation formula for cats

        }

        return expectativa;
    }
}

class Cao extends Animal {
    public Cao(String nome, String raca, String cor, int idade, double peso) {
        super(nome, raca, cor, idade, peso);
    }



public double calculaExpectativaVida() {
    // Example calculation specific for cats
    double expectativa;

    if (idade < 5) {
        expectativa = 18 + peso * 0.3; // Example calculation formula for cats
    } else {
        expectativa = 12 + peso * 0.2; // Another example calculation formula for cats
    }

    return expectativa;
}


}