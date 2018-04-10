package ua.kpi.tef.model;


import java.awt.*;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Photos{
    private Map<String, Image> photosLayout = new HashMap();

    private List<String> imagesByName = new ArrayList(photosLayout.keySet());

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
