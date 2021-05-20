package br.com.design.patterns.factorymethod.log;

import java.io.IOException;
import java.util.Scanner;

import br.com.design.patterns.factorymethod.log.console.ConsoleLogCreator;
//import br.com.design.patterns.factorymethod.log.txt.TxtLogCreator;
//import br.com.design.patterns.factorymethod.log.xml.XmlLogCreator;

public class CalculadoraDeImpostos {
	
	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		double valor = entrada.nextDouble();
		entrada.close();
		//regras de negocio
		
		Logger logger = new ConsoleLogCreator();
//		Logger logger = new TxtLogCreator();
//		Logger logger = new XmlLogCreator();
		logger.log("Valor total dos impostos: " + valor);
		
	}
}
