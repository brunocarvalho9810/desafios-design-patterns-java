/*
 * Autor: Bruno Carvalho
 * Git: https://github.com/brunocarvalho9810
 */
package br.com.design.patterns.factorymethod.maladireta;

import javax.swing.JOptionPane;

import br.com.design.patterns.factorymethod.maladireta.xml.MalaDiretaXML;

public class RelacionamentoCliente {
	
	public static void main(String[] args) {
//		MalaDireta maladireta = new MalaDiretaCSV("contatos.csv");
		MalaDireta maladireta = new MalaDiretaXML("contatos.xml");
		String mensagem = JOptionPane.showInputDialog(null, "Digite sua mensagem do e-mail:");
		
		boolean status = maladireta.enviarEmail(mensagem);
		
		JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
	}

}
