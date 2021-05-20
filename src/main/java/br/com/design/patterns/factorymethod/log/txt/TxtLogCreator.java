package br.com.design.patterns.factorymethod.log.txt;

import br.com.design.patterns.factorymethod.log.LogPrinter;
import br.com.design.patterns.factorymethod.log.Logger;

public class TxtLogCreator extends Logger {

	private StringBuilder message;
	
	public TxtLogCreator() {
		super();
	}

	@Override
	protected LogPrinter createLogger() {
		return new TxtLogPrinter(message);
	}

}
