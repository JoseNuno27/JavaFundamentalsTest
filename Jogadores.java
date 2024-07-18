

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jogadores {

    public static void main(String[] args) {
       String nomeEquipa;
       List <String> jogadores = new ArrayList();
       List<String> posicoes = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira o nome da equipa");
        nomeEquipa = scanner.nextLine();

       System.out.println("Insira o nome do 1o jogador");
       jogadores.add(scanner.nextLine());

       System.out.println("Insira o nome do 2o jogador");
       jogadores.add(scanner.nextLine());

       System.out.println("Insira o nome do 3o jogador");
       jogadores.add(scanner.nextLine());

       for (int i = 0; i < jogadores.size(); i++) {
           System.out.println("Insira uma posição para cada jogador");
           posicoes.add(scanner.nextLine());
       }
        System.out.println("Equipa " + nomeEquipa + " e os seus jogadores são:");
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println(STR."\{jogadores.get(i)} - Posição: \{posicoes.get(i)}");



    }}}

