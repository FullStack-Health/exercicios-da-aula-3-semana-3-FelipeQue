package src;

import src.entidades.Jogador;
import src.repositorios.ListaJogadores;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar 11 jogadores (vou colocar 2 pra testar por enquanto)
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o id do jogador: ");
            int id = scanner.nextInt();
            System.out.println("Digite o nome do jogador: ");
            String nome = scanner.next();
            System.out.println("Digite o apelido do jogador: ");
            String apelido = scanner.next();
            System.out.println("Digite a data de nascimento do jogador: ");
            LocalDate dataNascimento = LocalDate.parse(scanner.next());
            System.out.println("Digite o número do jogador: ");
            int numero = scanner.nextInt();
            System.out.println("Digite a posição do jogador: ");
            String posicao = scanner.next();
            System.out.println("Digite a qualidade do jogador: ");
            int qualidade = scanner.nextInt();
            System.out.println("Digite a quantidade de cartões do jogador: ");
            int cartoes = scanner.nextInt();
            Boolean suspenso = false;

            Jogador jogador = new Jogador(id, nome, apelido, dataNascimento, numero, posicao, qualidade, cartoes, suspenso);

            ListaJogadores.adicionarJogador(jogador);

        }

        // Exibir o time:

        System.out.println("--------------------");
        System.out.println("JOGADORES CADASTRADOS");




    }
}
