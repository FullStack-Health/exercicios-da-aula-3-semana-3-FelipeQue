package src.repositorios;

import src.entidades.Jogador;

import java.util.ArrayList;
import java.util.List;

public class ListaJogadores {

    public static List<Jogador> jogadores = new ArrayList<>();

    public static void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

}
