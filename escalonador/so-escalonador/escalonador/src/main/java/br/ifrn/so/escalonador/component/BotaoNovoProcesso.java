package br.ifrn.so.escalonador.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.ifrn.so.escalonador.Principal;
import br.ifrn.so.escalonador.algoritmo.FIFO;
import br.ifrn.so.escalonador.algoritmo.SJF;
import br.ifrn.so.escalonador.model.Processo;

public class BotaoNovoProcesso implements ActionListener {

	@Override
	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent e) {
		switch (Principal.algoritmoENUM.getId()) {
		case 1:
			FIFO fifo = new FIFO();
			fifo.criarProcessos();
			fifo.montarProcessos();
			break;
		case 2:
			SJF sjf = new SJF();
			sjf.criarProcessos();
			sjf.montarProcessos();
			break;
		
		}
	}
}