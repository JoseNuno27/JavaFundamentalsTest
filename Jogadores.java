

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jogadores {

    public static void main(String[] args) {
       String nomeEquipa;
       int numJogadores = 0;
       List <String> jogadores = new ArrayList();
       List<String> posicoes = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira o nome da equipa");
        nomeEquipa = scanner.nextLine();

       System.out.println("Insira o num jogadores que pretende inserir:");
       numJogadores = Integer.parseInt(scanner.nextLine());

       for (int i=0; i < numJogadores; i++) {
           System.out.println("Insira o nome do jogador");
           jogadores.add(scanner.nextLine());

       }
       for (int i = 0; i < jogadores.size(); i++) {
           System.out.println("Insira uma posição para cada jogador");
           posicoes.add(scanner.nextLine());
       }
        System.out.println("Equipa " + nomeEquipa + " e os seus jogadores são:");
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println(STR."\{jogadores.get(i)} - Posição: \{posicoes.get(i)}");

    }}}

