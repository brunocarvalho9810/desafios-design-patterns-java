package br.com.design.patterns.factorymethod.log.console;

import br.com.design.patterns.factorymethod.log.LogPrinter;
import br.com.design.patterns.factorymethod.log.Logger;

public class ConsoleLogCreator extends Logger {
	
	private StringBuilder message;

	public ConsoleLogCreator() {
		super();
	}

	@Override
	protected LogPrinter createLogger() {
		return new ConsoleLogPrinter(message);
	}
}
