package br.ifrn.so.escalonador.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.algoritmo.FIFO;
import br.ifrn.so.escalonador.algoritmo.SJF;

public class BotaoIniciar implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Principal.algoritmoENUM.getId()) {
		case 0:
			JOptionPane.showMessageDialog(null, "Selecione um Algoritmo.");
			break;
		case 1:
			Principal.tfQuantum.setEditable(false);
			Principal.btnIniciar.addActionListener(new FIFO());
			break;
		case 2:
			Principal.tfQuantum.setEditable(false);
			Principal.btnIniciar.addActionListener(new SJF());
			break;
		
		}
	}
}