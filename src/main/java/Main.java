import dom.DOMParser;
import flowerEntity.Flower;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        File xml = new File("/Users/oleh/Desktop/Work/Lecture15/src/main/resources/Flowers");
        File xsd = new File("/Users/oleh/Desktop/Work/Lecture15/src/main/resources/FlowersScheme.xsd");


        ArrayList<Flower> flowers = new ArrayList<>();

        flowers = DOMParser.getFlowerList(xml,xsd);
        Collections.sort(flowers, new FlowerComparator());
        for (Flower flower:flowers
             ) {
            LOGGER.info(flower);
        }


    }
}
