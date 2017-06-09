package br.ifrn.so.escalonador.algoritmo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.model.Processo;
import br.ifrn.so.escalonador.model.thread.ProcessoThreadSJF;

/**
 * Shortest Job First - SJF
 * 
 * @author joelsonreis
 */
public class SJF extends Algoritmo implements ActionListener {

	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if (Principal.processamento != null)
			Principal.processamento.stop();

		Principal.processosAptos = new ArrayList<Processo>();
		Principal.processosEmExecucao = new ArrayList<Processo>();
		this.criarProcessos();
		montarNucleos();
		montarProcessos();
		
		Principal.processamento = new ProcessoThreadSJF();
		Principal.processamento.start();
	}

	@Override
	public void criarProcessos() {
		super.criarProcessos();
		Collections.sort(Principal.processosAptos, new Processo());
	}
}