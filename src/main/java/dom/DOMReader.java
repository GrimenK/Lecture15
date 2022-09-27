package dom;


import flowerEntity.Flower;
import flowerEntity.GrowingTips;
import flowerEntity.VisualParams;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class DOMReader {

    ArrayList<Flower> readDoc(Document doc){
        doc.getDocumentElement().normalize();
        ArrayList<Flower> flowers = new ArrayList<>();
        NodeList nodeList = doc.getElementsByTagName("Flower");
        for (int i = 0; i < nodeList.getLength() ; i++) {
            Flower flower = new Flower();
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                flower.setSoil(element.getElementsByTagName("Soil").item(0).getTextContent());
                flower.setMultiplying( element.getElementsByTagName("Multiplying").item(0).getTextContent());
                flower.setName( element.getAttributes().getNamedItem("name").getNodeValue());
                flower.setOrigin(element.getAttributes().getNamedItem("origin").getNodeValue());
                flower.setGrowingTips(getGrowingTips(element.getElementsByTagName("GrowingTips")));
                flower.setVisualParams(getVisualParams(element.getElementsByTagName("VisualParams")));
                flowers.add(flower);
            }
        }
        return flowers;
    }


    public GrowingTips getGrowingTips(NodeList nodeList){
        GrowingTips growingTips = new GrowingTips();
        if(nodeList.item(0).getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) nodeList.item(0);
            growingTips.setLight(Boolean.parseBoolean(element.getElementsByTagName("Light").item(0).getTextContent()));
            growingTips.setTemp(element.getElementsByTagName("Temp").item(0).getTextContent());
        }
        return growingTips;
    }

    public VisualParams getVisualParams(NodeList nodeList){
        VisualParams visualParams = new VisualParams();
        if(nodeList.item(0).getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) nodeList.item(0);
            visualParams.setColor(element.getElementsByTagName("Color").item(0).getTextContent());
            visualParams.setLeafColor(element.getElementsByTagName("LeafColor").item(0).getTextContent());
            visualParams.setSize(element.getElementsByTagName("Size").item(0).getTextContent());
        }
        return visualParams;
    }
}
