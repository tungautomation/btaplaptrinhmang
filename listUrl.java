import java.net.HttpURLConnection;
import java.net.URL;

public class listUrl {
    public static void main(String[] args) {
        String[]websites = {
            "https://baomoi.com/",
            "https://grabcad.com/library?page=1&per_page=100&time=all_time&sort=recent&query=sbr12",
            "https://dantri.com.vn/"
        };
        for(String website : websites)
        {
            checkweb(website);
        }
    }
    public static void checkweb(String urlString)
    {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println(urlString+"trang web đang hoạt động ");
                }
            else
            {
                System.out.println(urlString+"trang web ko hoạt động "+responseCode);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
