package SortIncludes;


import java.io.File;
import java.util.ArrayList;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 

public class ScoreParser {
	
	ArrayList<player> playerList = new ArrayList<player>();

    
	public ArrayList<player> scoreList(String fileName){
    try {

            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File(fileName));
            
            
            
            // normalize text representation
            doc.getDocumentElement ().normalize ();
            //System.out.println ("Root element : " + 
                 //doc.getDocumentElement().getNodeName());


            NodeList listOfPlayers = doc.getElementsByTagName("player");            
            //System.out.println("Total Players : " + listOfPlayers.getLength());

            for(int s=0; s<listOfPlayers.getLength() ; s++){


                Node firstPersonNode = listOfPlayers.item(s);
                if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){


                    Element firstPersonElement = (Element)firstPersonNode;

                    //-------
                    NodeList NameList = firstPersonElement.getElementsByTagName("name");
                    Element nameElement = (Element)NameList.item(0);

                    NodeList textFNList = nameElement.getChildNodes();
                    String name = (textFNList.item(0)).getNodeValue().trim();

                    //-------
                    NodeList scoreList = firstPersonElement.getElementsByTagName("score");
                    Element scoreElement = (Element)scoreList.item(0);

                    NodeList textLNList = scoreElement.getChildNodes();
                    float score = Float.parseFloat((textLNList.item(0)).getNodeValue().trim());                   
                    
                    
                    playerList.add(new player(name, score));    
                                    
                }//end of if clause

            }//end of for loop        
                      
        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        
	return playerList;

    }


}