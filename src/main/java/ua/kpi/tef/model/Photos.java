package ua.kpi.tef.model;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class Photos{
    private Map<String, BufferedImage> photosLayout = new HashMap();
    private List<String> imagesByName;
    private List<BufferedImage> images;

    public Photos() throws IOException {
        photosLayout.put("Photo", ImageIO.read(new File("C:/Flash/p.jpg")));
        photosLayout.put("Igor", ImageIO.read(new File("C:/Flash/p.jpg")));
        photosLayout.put("Petya", ImageIO.read(new File("C:/Flash/p.jpg")));
        photosLayout.put("Vasya", ImageIO.read(new File("C:/Flash/p.jpg")));
        photosLayout.put("Some image", ImageIO.read(new File("C:/Flash/p.jpg")));

        imagesByName = new ArrayList(photosLayout.keySet());
        images = new ArrayList(photosLayout.values());
        //TODO put photos into the Map
    }

    public Entry<String, BufferedImage> getFirstEntry() {
        if (photosLayout.entrySet().iterator().hasNext())
            return (Entry<String, BufferedImage>) photosLayout.entrySet().iterator().next();
        else
            return (Entry<String, BufferedImage>) photosLayout.entrySet().iterator();
    }



    public  Map<String, BufferedImage> getPhotosLayout() {
        return photosLayout;
    }

    public List<String> getImagesByName() {
        Collections.sort(imagesByName);
        return imagesByName;
    }

    public List<BufferedImage> getImages() {
        return images;
    }




    public void sortImages(){
        Collections.sort(imagesByName);
       /* Collections.sort(this.imagesByName, new Comparator<Map.Entry<String, Image>>(){
            @Override
            public int compare(Map.Entry e1, Map.Entry e2) {
                return e1.getKey().toString().compareTo(e2.getKey().toString());
            }
        });*/
    }
}
