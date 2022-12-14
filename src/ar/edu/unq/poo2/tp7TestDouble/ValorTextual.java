package ar.edu.unq.poo2.tp7TestDouble;

public enum ValorTextual  implements Valor{
	ACE(14), KING(13), QUEEN(12), JOKER(11);
	
	private Integer valorNumerico;
	
	private ValorTextual(Integer valorNumerico) {
		this.valorNumerico = valorNumerico;
	}
	
	@Override
	public Boolean esMayor(Valor valor) {
		return this.getValorNumerico() > valor.getValorNumerico();
	} 
	
	@Override
	public Integer getValorNumerico() {
		return valorNumerico;
	}
	
}
