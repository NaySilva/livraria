package br.com.casadocodigo.livraria.produtos;

public class Revista implements Produto, Promocional {

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Produto outro) {
		if (this.getValor() < outro.getValor()) {
			return -1;
		}
		if (this.getValor() > outro.getValor()){
			return 1;
		}
		return 0;
	}

}
