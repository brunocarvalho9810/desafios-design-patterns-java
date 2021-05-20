package br.com.design.patterns.factorymethod.log;

import java.io.IOException;
import java.time.LocalDateTime;

public abstract class Logger {
	
	private StringBuilder message = new StringBuilder();
	
	protected abstract LogPrinter createLogger();
	
	public Logger() {
		this.message.append(LocalDateTime.now())
		.append(" - ");

	}

	public void log(String message) throws IOException{
		createLogger().print(this.message.append(message));
	}
}
