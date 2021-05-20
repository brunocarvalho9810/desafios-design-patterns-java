package br.com.design.patterns.factorymethod.log.console;

import br.com.design.patterns.factorymethod.log.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {

	@SuppressWarnings("unused")
	private StringBuilder message;

	public ConsoleLogPrinter(StringBuilder message) {
		this.message = message;
	}

	public void print(StringBuilder message) {
		System.out.println(message);
	}

}
