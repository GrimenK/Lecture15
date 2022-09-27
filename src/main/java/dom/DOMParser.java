package dom;

import flowerEntity.Flower;
import org.w3c.dom.Document;

import java.io.File;
import java.util.ArrayList;

public class DOMParser {

    public static ArrayList<Flower> getFlowerList(File xmlFile, File xsd){

        DOMCreator creator = new DOMCreator(xmlFile);
        Document doc = creator.getDocument();

        DOMReader reader = new DOMReader();
        return reader.readDoc(doc);
    }
}
