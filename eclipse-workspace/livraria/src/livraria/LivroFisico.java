package livraria;

public class LivroFisico extends Livro {
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}

}
