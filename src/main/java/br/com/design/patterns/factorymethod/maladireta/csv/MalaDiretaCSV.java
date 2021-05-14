package br.com.design.patterns.factorymethod.maladireta.csv;

import br.com.design.patterns.factorymethod.maladireta.MalaDireta;
import br.com.design.patterns.factorymethod.maladireta.contato.Contatos;

public class MalaDiretaCSV extends MalaDireta{
	
	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}

	
}
