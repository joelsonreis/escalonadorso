package br.ifrn.so.escalonador.algoritmo.constant;

public enum AlgoritmoENUM {

	SELECIONE (0, "Selecione"),
	FIFO (1, "FIFO"),
	SJF (2, "SJF - Shortest Job First");
	
	private int id;
	private String descricao;
	
	private AlgoritmoENUM(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}