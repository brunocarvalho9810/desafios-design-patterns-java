package br.com.design.patterns.factorymethod.log.xml;

import br.com.design.patterns.factorymethod.log.LogPrinter;
import br.com.design.patterns.factorymethod.log.Logger;

public class XmlLogCreator extends Logger {

	private StringBuilder message;

	public XmlLogCreator() {
		super();
	}

	@Override
	protected LogPrinter createLogger() {
		return new XmlLogPrinter(message);
	}

}
