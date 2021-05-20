package br.com.design.patterns.factorymethod.log.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.design.patterns.factorymethod.log.LogPrinter;

public class TxtLogPrinter implements LogPrinter {

	@SuppressWarnings("unused")
	private StringBuilder message;

	public TxtLogPrinter(StringBuilder message) {
		this.message = message;
	}

	@Override
	public void print(StringBuilder message) throws IOException{

		FileWriter arq = new FileWriter("C:\\Users\\Public\\Documents\\calculo.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);

	    gravarArq.println(message);
	    arq.close();
	}

}
