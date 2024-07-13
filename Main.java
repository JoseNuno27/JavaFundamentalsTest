public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Gatito", "Rafeiro", "Amarelo", 8, 5);
        Cao cao1 = new Cao("bolinhas", "Rafeiro", "Branco", 5, 9);
        Cao cao2 = new Cao("bolao", "Rafeiro", "Branco", 5, 9);

        System.out.print("o " + gato1.nome + " faz " );
        gato1.miar();
        System.out.println(gato1.nome + " - Expectativa de vida: " + gato1.calculaExpectativaVida() + " anos");

        System.out.print("o " + cao1.nome + " faz ");
        cao1.ladrar();
        cao1.calculaExpectativaVida();


        System.out.print("o " + cao2.nome + " faz ");
        cao2.ladrar();
        cao2.calculaExpectativaVida();
    }

}


