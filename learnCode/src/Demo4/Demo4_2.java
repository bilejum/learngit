package Demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;

public class Demo4_2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.diyifanwen.com/tool/baijiaxing/");

        URLConnection urlConnection = url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String line;

        for (int i = 0; i < 1000; i++) {
            String s = reader.readLine();
            System.out.println(s);
        }
    }
}
