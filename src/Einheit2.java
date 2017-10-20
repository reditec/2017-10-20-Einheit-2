import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Einheit2 {

    public static void main(String[] args) {
        String s = "Der Wilde im Walde!";

        System.out.println(s.substring(4, 8));
        System.out.println(s.substring(10, 12));
        System.out.println(s.substring(13, 17));

        System.out.println("------");

        s = open_url("http://beans.itcarlow.ie/prices.html");

        System.out.println(s.substring(230,234));

        System.out.println("------");

        int pos = s.indexOf(">$");

        System.out.println(s.substring(pos + 2, pos+6));

        System.out.println("------");

        s = "Ich liebe Design";

        String a = s.toUpperCase();
        String b = s.toLowerCase();
        String c = s.replace("liebe", "hasse");
        String d = c.replace("Design", "Informatik");
        boolean e = b.startsWith("Ich");
        boolean f = a.endsWith("GN");
        int g = s.indexOf("liebe");
        int h = d.indexOf("Design");
        boolean i = b.contains("liebe");

    }

    private static String open_url(String u ) {
        System.out.println("Connecting to website...");
        String result = "";
        String line = null;

        try {
            URL url = new URL(u);
            InputStream stream = url.openConnection().getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

            while((line = reader.readLine()) != null) {
                result += line;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Connection error!");
        }

        return result;

    }
}
