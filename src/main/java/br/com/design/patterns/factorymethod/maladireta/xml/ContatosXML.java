package br.com.design.patterns.factorymethod.maladireta.xml;

import java.net.URL;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import br.com.design.patterns.factorymethod.maladireta.contato.Contato;
import br.com.design.patterns.factorymethod.maladireta.contato.Contatos;

public class ContatosXML implements Contatos {
	
	private String nomeArquivo;
	
	public ContatosXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@SuppressWarnings("unchecked")
	public List<Contato> todos() {
		XStream xstream = new XStream();
		xstream.alias("contatos", List.class);
		xstream.alias("contato", Contato.class);
		
		URL arquivo = this.getClass().getResource("/" + nomeArquivo);
		List<Contato> fromXML = (List<Contato>) xstream.fromXML(arquivo);
		return fromXML;
	}

}
