package src.entidades;

import java.time.LocalDate;
import java.util.Date;

public class Jogador {

    // Atributos
    private int id;
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private Boolean suspenso;

    // Construtor
    public Jogador(){}; // Construtor vazio

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoes, Boolean suspenso){
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }

    public Boolean verificarCondicaoDeJogo(){
        return this.cartoes >= 3;
    }

}
