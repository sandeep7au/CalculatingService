package com.xml.sandeep;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Drivers {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		File f=new File("sandeep.xml");
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder= factory.newDocumentBuilder();
		Document document=builder.parse(f);
		//for rxml parsing
		document.getDocumentElement().normalize();
		XmlParserMethod.handleChannelTag(document);
		
		//end of application

	}

}
