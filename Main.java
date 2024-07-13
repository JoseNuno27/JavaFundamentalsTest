public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Gatito", "Rafeiro", "Amarelo", 8, 5);
        Cao cao1 = new Cao("bolinhas", "Rafeiro", "Branco", 5, 9);

        System.out.print("o " + gato1.nome + " faz ");
        gato1.miar();

        System.out.print("o " + cao1.nome + "faz ");
        cao1.ladrar();
    }
}
