package br.ifrn.so.escalonador.model;

import java.awt.Color;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.algoritmo.constant.AlgoritmoENUM;

public class Processo implements Comparator<Processo>, Serializable {

	private static final long serialVersionUID = 1038124241569745320L;

	private Integer codigo;
	private Integer tempoInicial;
	private Integer tempoFinal;

	private Integer tempoAindaQueFalta;
	private Integer prioridade;

	public Processo() {
		Random r = new Random();
		Principal.codigo++;
		this.codigo = Principal.codigo;
		this.tempoInicial = 0;
		this.tempoFinal = r.nextInt(30);
	}

	public JLabel montarDesenhoDoProcesso() {
		StringBuilder sb = new StringBuilder();
		JLabel label = new JLabel();
		sb.append("<html>Id: " + this.codigo + "<br>");
		sb.append("TI: " + this.tempoInicial + "<br>");
		sb.append("TF: " + this.tempoFinal + "<br></html>");
		label.setText(sb.toString());
		label.setForeground(Color.BLUE);
		label.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		return label;
	}

	public JLabel montarDesenhoDoProcessoComPrioridade() {
		StringBuilder sb = new StringBuilder();
		JLabel label = new JLabel();
		sb.append("<html>Id: " + this.codigo + "<br>");
		sb.append("TI: " + this.tempoInicial + "<br>");
		sb.append("TF: " + this.tempoFinal + "<br>");
		sb.append("Pr: " + this.prioridade + "<br></html>");
		label.setText(sb.toString());
		label.setForeground(Color.BLUE);
		label.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		return label;
	}

	public void processamento() {
		if (tempoInicial < tempoFinal)
			tempoInicial++;
	}

	public boolean checarSeOTempoZerou() {
		if (tempoInicial >= tempoFinal)
			return true;
		else
			return false;
	}

	public void calculaTempoAindaDeExecucao() {
		this.tempoAindaQueFalta = tempoFinal - tempoInicial;
	}

	public void gerarPrioridade() {
		Random r = new Random();
		this.prioridade = r.nextInt(5);
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getTempoInicial() {
		return tempoInicial;
	}

	public void setTempoInicial(Integer tempoInicial) {
		this.tempoInicial = tempoInicial;
	}

	public Integer getTempoFinal() {
		return tempoFinal;
	}

	public void setTempoFinal(Integer tempoFinal) {
		this.tempoFinal = tempoFinal;
	}

	public Integer getTempoAindaQueFalta() {
		return tempoAindaQueFalta;
	}

	public void setTempoAindaQueFalta(Integer tempoAindaQueFalta) {
		this.tempoAindaQueFalta = tempoAindaQueFalta;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public int compare(Processo o1, Processo o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}