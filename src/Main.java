package src;

import src.entidades.Jogador;
import src.repositorios.ListaJogadores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Criar 11 jogadores (vou colocar 2 para testar por enquanto):

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o id do jogador (int): ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o apelido do jogador: ");
            String apelido = scanner.nextLine();
            System.out.print("Digite a data de nascimento do jogador no formato DD/MM/AAAA: ");
            LocalDate dataNascimento = LocalDate.parse(scanner.next(), formatter);
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

            String condicao;

            jogador.setSuspenso(jogador.verificarCondicaoDeJogo());
            if (jogador.getSuspenso()) {
                condicao = "Condição: Suspenso.";
            } else {
                condicao = "Condição: Tá pra jogo!";
            }

            System.out.println(
                    jogador.getPosicao() + ": " +
                            jogador.getNumero() + " - " +
                            jogador.getNome() + " (" +
                            jogador.getApelido() + ") - " +
                            jogador.getDataNascimento().format(formatter) + ". " +
                            condicao);

        }
    }

}
