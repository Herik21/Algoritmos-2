package Atividade-Carrinho;

public class CarrinhoTeste {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        Produto produto1 = new Produto("Camiseta", 29.90);
        Produto produto2 = new Produto("Calça", 59.90);
        
        carrinho.adicionarProduto(produto1, 2); // 2 camisetas
        carrinho.adicionarProduto(produto2, 1); // 1 calça
        
        carrinho.mostrarCarrinho();

        carrinho.removerProduto("Camiseta");
        
        carrinho.atualizarQuantidade("Calça", 2); // Atualiza para 2 calças

        carrinho.mostrarCarrinho();
    }
}
