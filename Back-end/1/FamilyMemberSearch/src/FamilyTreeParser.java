import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FamilyTreeParser {
	
	private static String getValue(String tag, Element element) {
		
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		
		return node.getNodeValue();
	}
	
	public ArrayList<Person> buildPersonList(File xmlFile)
	{
		try {

			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			ArrayList<Person> personList = new ArrayList<Person>();

			//System.out.println("root of xml file" + doc.getDocumentElement().getNodeName());
			NodeList nodes = doc.getElementsByTagName("person");
			

			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					Person person = new Person();
					person.setInfo(getValue("name", element), getValue("gender", element), getValue("father", element), getValue("mother", element), getValue("spouse", element));
					
					personList.add(i, person);					
					
				}
			}
			
			return personList;
			
		} catch (Exception ex) {
		ex.printStackTrace();
		}
		return null;
		
	}	

	
}


