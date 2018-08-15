package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {
	
	private double total;
	private Produto[] produtos;
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: "+produto);
		this.produtos[1] = produto;
		total += produto.getValor();
	}
	
	public double getTotal() {
		return total;
	}
	
}
