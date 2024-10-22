package Atividades;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade =  idade;
        System.out.println("Idade: " +idade);
    }

    public void cumprimentar(){
       System.out.println("Ola meu nome e "+nome+" tudo bem usuario :)");

    }
}

