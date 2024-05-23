package entidades;

import java.util.Date;

public class Jogador {

    // Atributos
    private int id;
    private String nome;
    private String apelido;
    private Date dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private Boolean suspenso;

    // Construtor

    public Jogador Jogador(){}; // Construtor vazio

    public Jogador Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade, int cartoes, Boolean suspenso){
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
        if (cartoes >= 3){
            suspenso = true;
        }
    }

}
