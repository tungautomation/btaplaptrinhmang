import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ketnoiUrl {
    public static void main(String[] args) {
        try {
            String urlString = "https://baomoi.com/";
            URL url = new URL(urlString);
            InputStreamReader is = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(is);
            String line;
            while ((line = br.readLine())!=null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            
        }
    }
}
