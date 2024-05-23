package src;

import src.entidades.Jogador;
import src.repositorios.ListaJogadores;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar 11 jogadores (vou colocar 2 para testar por enquanto):

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o id do jogador (int): ");
            int id = scanner.nextInt();
            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.next();
            System.out.print("Digite o apelido do jogador: ");
            String apelido = scanner.next();
            System.out.print("Digite a data de nascimento do jogador no formato AAAA-MM-DD: ");
            LocalDate dataNascimento = LocalDate.parse(scanner.next());
            System.out.print("Digite o número do jogador: ");
            int numero = scanner.nextInt();
            System.out.print("Digite a posição do jogador: ");
            String posicao = scanner.next();
            System.out.print("Digite a qualidade do jogador (int): ");
            int qualidade = scanner.nextInt();
            System.out.print("Digite a quantidade de cartões do jogador: ");
            int cartoes = scanner.nextInt();
            Boolean suspenso = false;

            Jogador jogador = new Jogador(id, nome, apelido, dataNascimento, numero, posicao, qualidade, cartoes, suspenso);

            ListaJogadores.adicionarJogador(jogador);
            System.out.println("Jogador " + apelido + " cadastrado!");
            System.out.println(" ");

        }

        // Exibir o time (é aqui que estou validando suspensão ou não):

        System.out.println("--------------------");
        System.out.println("JOGADORES CADASTRADOS");
        System.out.println(" ");

        for (Jogador jogador : ListaJogadores.jogadores) {
            System.out.println("ID: " + jogador.getId());
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Apelido: " + jogador.getApelido());
            System.out.println("Data de nascimento: " + jogador.getDataNascimento());
            System.out.println("Número: " + jogador.getNumero());
            System.out.println("Posição: " + jogador.getPosicao());
            System.out.println("Qualidade: " + jogador.getQualidade());
            System.out.println("Cartões: " + jogador.getCartoes());

            jogador.setSuspenso(jogador.verificarCondicaoDeJogo());
            if (jogador.getSuspenso()) {
                System.out.println("Condição: Suspenso.");
            } else {
                System.out.println("Condição: Tá pra jogo!");
            }
            System.out.println("---");

        }
    }

}
