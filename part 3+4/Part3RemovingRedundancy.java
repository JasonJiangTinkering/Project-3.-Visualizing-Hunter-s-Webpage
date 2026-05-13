// Source: e ListLinks.java sample code from jsoup is
// https://github.com/jhy/jsoup/blob/master/src/main/java/org/jsoup/examples/ListLinks.java

/*
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
*/
import java.util.HashMap;

public class Part3RemovingRedundancy {
    HashMap<String, Integer> urlHashMap = new HashMap<>();
    int nodeIndex = 0;

    public void insertLink(String url) {
        if (!urlHashMap.containsKey(url)) {
            urlHashMap.put(url, nodeIndex);
            nodeIndex++;
        }
    }

    public Integer getIndex(String url) {
        return urlHashMap.get(url);
    }

    public static void main(String[] args) {
        
    }
}
