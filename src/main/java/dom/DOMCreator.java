package dom;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMCreator {
    private DocumentBuilder documentBuilder;
    private Document document;

    DOMCreator(File xmlFile){
        createBuilder();
        createDoc(xmlFile);
    }

    private void createBuilder(){
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

        try{
            documentBuilder = builderFactory.newDocumentBuilder();
        }
        catch (ParserConfigurationException e){
            e.printStackTrace();
        }
    }

    public void createDoc(File xmlFile){
        try{
            document = documentBuilder.parse(xmlFile);
        }
        catch (SAXException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    Document getDocument(){
        return document;
    }

}
