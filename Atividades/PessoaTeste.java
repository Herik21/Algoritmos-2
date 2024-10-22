package Atividades;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome ("Nome: Joao");
        pessoa1.setIdade(25);
        System.out.println(pessoa1.getNome());
        
        pessoa1.cumprimentar();
    }
}

