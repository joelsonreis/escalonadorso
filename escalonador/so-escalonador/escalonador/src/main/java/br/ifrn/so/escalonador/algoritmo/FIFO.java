package br.ifrn.so.escalonador.algoritmo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.model.Processo;
import br.ifrn.so.escalonador.model.thread.ProcessoThreadFIFO;

/**
 * First In, First Out - FIFO
 * 
 * @author joelsonreis
 */
public class FIFO extends Algoritmo implements ActionListener {

	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if (Principal.processamento != null)
			Principal.processamento.stop();

		Principal.processosAptos = new ArrayList<Processo>();
		Principal.processosEmExecucao = new ArrayList<Processo>();
		criarProcessos();
		montarNucleos();
		montarProcessos();
		
		Principal.processamento = new ProcessoThreadFIFO();
		Principal.processamento.start();
	}
}