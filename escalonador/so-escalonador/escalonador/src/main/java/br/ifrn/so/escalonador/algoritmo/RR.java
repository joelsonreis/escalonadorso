package br.ifrn.so.escalonador.algoritmo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.model.Processo;
import br.ifrn.so.escalonador.model.thread.ProcessoThreadRR;

/**
 * Round Robin
 * 
 * @author joelsonreis
 */
public class RR extends Algoritmo implements ActionListener {

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
		
		Principal.processamento = new ProcessoThreadRR();
		Principal.processamento.start();
	}
}

