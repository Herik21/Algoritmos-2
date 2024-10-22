package Atividade-Carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List <ItemCarrinho> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equals(produto.getNome())) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public void removerProduto(String nomeProduto) {
        itens.removeIf(item -> item.getProduto().getNome().equals(nomeProduto));
    }

    public void atualizarQuantidade(String nomeProduto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().getNome().equals(nomeProduto)) {
                item.setQuantidade(quantidade);
                return;
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemCarrinho item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void mostrarCarrinho() {
        for (ItemCarrinho item : itens) {
            System.out.println(item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade() + " - Subtotal: " + item.getSubtotal());
        }
        System.out.println("Total: " + calcularTotal());
    }
}

