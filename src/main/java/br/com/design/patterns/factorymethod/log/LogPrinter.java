package br.com.design.patterns.factorymethod.log;

import java.io.IOException;

public interface LogPrinter {

	void print(StringBuilder message) throws IOException;
}
