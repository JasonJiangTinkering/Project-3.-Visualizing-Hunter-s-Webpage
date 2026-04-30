// Source: e ListLinks.java sample code from jsoup is
// https://github.com/jhy/jsoup/blob/master/src/main/java/org/jsoup/examples/ListLinks.java

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 Example program to list links from a URL.
 <p>To invoke from the command line, assuming you've downloaded the jsoup-examples
 jar to your current directory:</p>
 <p><code>java -cp jsoup-examples.jar org.jsoup.examples.ListLinks url</code></p>
 where <i>url</i> is the URL to fetch.
 */
public class Part2RefinedUrls {
    public static void main(String[] args) throws IOException {
        Validate.isTrue(args.length == 1, "usage: supply url to fetch");
        String url = args[0];
        print("Fetching %s...", url);

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]");


        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            String linkUrl = link.attr("abs:href");
            String [] allowedPrefixes = {
                    "https://www.hunter.cuny.edu",
                    "https://www2.hunter.cuny.edu",

                    "http://www.hunter.cuny.edu",
                    "https://www2.hunter.cuny.edu",

                    "https://www.hunter.cuny.edu",
                    "https://www.hunter.cuny.edu",
                    "https://www.hunter.cuny.edu",
                    "https://www.hunter.cuny.edu",
            };
            // These urls dont have a lot of deviance, so a simple startsWith check is sufficient to filter out the bad urls
            boolean allowed = false;
            for (String prefix : allowedPrefixes) {
                if (linkUrl.startsWith(prefix)) {
                    allowed = true;
                    break;
                }
            }

            if (!allowed) {
                // System.out.println("Bad url: " + linkUrl);
                continue;
            }
            print("%s", "./" + linkUrl.substring(linkUrl.indexOf(".edu") + 4), "");
            // print("%s", linkUrl,"");
        }
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }
}
