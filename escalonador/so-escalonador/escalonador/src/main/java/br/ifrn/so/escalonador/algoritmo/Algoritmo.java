package br.ifrn.so.escalonador.algoritmo;

import javax.swing.JPanel;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.model.Processo;

public abstract class Algoritmo {

	public void criarProcessos() {
		for (int i = 0; i < Integer.parseInt(Principal.tfProcessos.getText()); i++) {
			Processo processo = new Processo();
			Principal.processosAptos.add(processo);
		}
	}
	
	public static void montarNucleos() {
		JPanel panel = new JPanel();
		Principal.paProcessando.removeAll();
		for (int i = 0; i < Integer.parseInt(Principal.tfNucleos.getText()); i++) {
			Principal.processosEmExecucao.add(Principal.processosAptos.get(i));
			panel.add(Principal.processosEmExecucao.get(i).montarDesenhoDoProcesso());
		}
		Principal.reorganizarProcessandoClasse(panel);
	}
	
	public static void montarProcessos() {
		JPanel panel = new JPanel();
		Principal.paAProcessar.removeAll();
		for (int i = 0; i < Principal.processosAptos.size(); i++) {
			panel.add(Principal.processosAptos.get(i).montarDesenhoDoProcesso());
		}
		Principal.reorganizarAProcessar(panel);
	}
}