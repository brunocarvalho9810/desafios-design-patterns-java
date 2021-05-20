package br.com.design.patterns.factorymethod.log.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import br.com.design.patterns.factorymethod.log.LogPrinter;

public class XmlLogPrinter implements LogPrinter{

	@SuppressWarnings("unused")
	private StringBuilder message;
	
	public XmlLogPrinter(StringBuilder message) {
		this.message = message;
	}

	@Override
	public void print(StringBuilder message) {
		
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		
		Document docXML = documentBuilder.newDocument();
		
		Element msg = docXML.createElement("messages");
		
		
		Element messagexml = docXML.createElement("message");
		messagexml.appendChild(docXML.createTextNode(message.toString()));
		
		msg.appendChild(messagexml);
		docXML.appendChild(msg);
		
		TransformerFactory transf = TransformerFactory.newInstance();
		Transformer transformer = transf.newTransformer();
		
		DOMSource documenoFonte = new DOMSource(docXML);
		
		StreamResult documentoFinal = new StreamResult(new File("C:\\Users\\Public\\Documents\\calculo.xml"));
		
		transformer.transform(documenoFonte, documentoFinal);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		
	}

}
