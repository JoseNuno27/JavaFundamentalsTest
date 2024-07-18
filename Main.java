public class Main {

    public static void main(String[] args) {
        Gato gato1 = new Gato("Gatito", "Rafeiro", "Amarelo", 8, 5);
        Cao cao1 = new Cao("bolinhas", "Rafeiro", "Branco", 5, 9);
        Cao cao2 = new Cao("bolao", "Rafeiro", "Branco", 5, 9);
        Comida racao1 = new Comida("Friskies", 5,1);

        Animal[] animais = {gato1, cao1, cao2};

        Animal maiorNome = animais[0];
        for (Animal animal : animais) {
            if (animal.nome.length() > maiorNome.nome.length()) {
                maiorNome = animal;
            }
        }

        Animal maiorPeso = animais[0];
        for (Animal animal : animais) {
            if (animal.peso > maiorPeso.peso) {
                maiorPeso = animal;
            }
        }

        Animal maiorIdade = animais[0];
        for (Animal animal : animais) {
            if (animal.idade > maiorIdade.idade) {
                maiorIdade = animal;
            }
        }
        System.out.println("O animal com o maior nome é " + maiorNome.nome);
        System.out.println("O animal com a maior idade é " + maiorIdade.idade);
        System.out.println("Os animais com o maior peso são:");
        for (Animal animal : animais) {
            if (animal.peso == maiorPeso.peso) {
                System.out.println(animal.nome + " - Peso: " + animal.peso);
            }
        }

        System.out.print("o " + gato1.nome + " faz ");
        gato1.miar();
        gato1.comer(racao1);
        System.out.println(gato1.nome + " - Expectativa de vida: " + gato1.calculaExpectativaVida() + " anos");
        System.out.println("O peso atual do " + gato1.nome + " é: " + gato1.comer);

        System.out.print("o " + cao1.nome + " faz ");
        cao1.ladrar();
        System.out.println(cao1.nome + " - Expectativa de vida: " + cao1.calculaExpectativaVida() + " anos");

        System.out.print("o " + cao2.nome + " faz ");
        cao2.ladrar();
        System.out.println(cao2.nome + " - Expectativa de vida: " + cao2.calculaExpectativaVida() + " anos");
    }
}
