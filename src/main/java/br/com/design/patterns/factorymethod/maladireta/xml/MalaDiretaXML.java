package br.com.design.patterns.factorymethod.maladireta.xml;

import br.com.design.patterns.factorymethod.maladireta.MalaDireta;
import br.com.design.patterns.factorymethod.maladireta.contato.Contatos;

public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosXML(nomeArquivo);
	}

}
