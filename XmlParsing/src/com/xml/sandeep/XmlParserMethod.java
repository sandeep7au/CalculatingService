package com.xml.sandeep;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParserMethod {
	
	public static void handleChannelTag(Document document)
	{
	
		System.out.println("<"+ document.getDocumentElement().getNodeName()+">");
	    System.out.println("<name>"+document.getElementsByTagName("name").item(0).getTextContent()+"</name>");
	    System.out.println("<age>"+document.getElementsByTagName("age").item(0).getTextContent()+"</age>");
	    NodeList list=document.getElementsByTagName("topic");
	    handleTopicTag(list);
		System.out.println("</"+ document.getDocumentElement().getNodeName()+">");
	}
	
	public static void handleTopicTag(NodeList list)
	{
		for (int i=0;i<=list.getLength();i++)
		{
			
			Node node=list.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE)
			{
				System.out.println("<topic>");
				Element element=(Element)node;
				System.out.println("<name>"+element.getElementsByTagName("name").item(0).getTextContent()+"</name>");
				System.out.println("<tutorial>"+element.getElementsByTagName("tutorial").item(0).getTextContent()+"</tutorial>");
				System.out.println("</topic>");
			}
			
		}
		
	}
	

}
