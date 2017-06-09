package br.ifrn.so.escalonador.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.algoritmo.constant.AlgoritmoENUM;

public class ComboBoxSelecao implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// Zera o código do ID quando troca.
		Principal.codigo = 0;
		switch (Principal.cbAlgoritmo.getSelectedItem().toString()) {
		case "Selecione":
			Principal.tfQuantum.setEditable(false);
			break;
		case "FIFO":
			Principal.algoritmoENUM = AlgoritmoENUM.FIFO;
			break;
		case "SJF - Shortest Job First":
			Principal.algoritmoENUM = AlgoritmoENUM.SJF;
			Principal.tfQuantum.setEditable(false);
			break;
		
		}
	}
}