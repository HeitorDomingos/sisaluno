package br.com.apisys.sisaluno.modelo.entidades;

public enum Status {
	MATRICULADO, TRANCADO, JUBILADO;
	
	private String descricao;	
	
	/**
	 * Retorna a descrição do status	 
	 */
	public String getDescrição() {
		return descricao;
	}

	

	
	
}
