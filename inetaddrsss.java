import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetaddrsss {
    public static void main(String[] args) throws UnknownHostException {
        String domain ="www.google.com";
        try {
            InetAddress address = InetAddress.getByName(domain);
        System.out.println("Tên miền" + domain);
        System.out.println("IP"+address.getHostAddress());

        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("Tên miền"+localhost.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
