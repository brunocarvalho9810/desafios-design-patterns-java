package br.com.design.patterns.factorymethod.maladireta.csv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import br.com.design.patterns.factorymethod.maladireta.contato.Contato;
import br.com.design.patterns.factorymethod.maladireta.contato.Contatos;

public class ContatosCSV implements Contatos {
	
	private String nomeArquivo;
	
	

	public ContatosCSV(String nomeArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
	}
	
	public List<Contato> todos() {
		List<Contato> contatos = new ArrayList<Contato>();
		CSVReader csvReader = null;
		
		try {
			URI uri = this.getClass().getResource("/" + nomeArquivo).toURI();
			File arquivoCsv = new File(uri);
			FileReader fileReader = new FileReader(arquivoCsv);
			csvReader = new CSVReader(fileReader);
			String [] nextLine;
			
			while((nextLine = csvReader.readNext()) != null) {
				contatos.add(new Contato(nextLine[0].trim(), nextLine[1].trim()));
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro lendo arquivo csv", e);
		}finally {
			try {
				csvReader.close();
			}catch(IOException e) {}
		}
		return contatos;
	}

}
