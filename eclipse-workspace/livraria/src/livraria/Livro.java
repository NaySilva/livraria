package livraria;

public class Livro {

	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	
	public Livro() {
		System.out.println("Novo livro criado!");
	}
	
	
	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro ";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetahes();
		}
		
		System.out.println("--");
	}
	
	public void aplicaDescontoDe(double porcentagem) {
		this.valor -= this.valor * porcentagem;
	}
	
	
	boolean temAutor() {
		return this.autor != null;
	}
	
}
