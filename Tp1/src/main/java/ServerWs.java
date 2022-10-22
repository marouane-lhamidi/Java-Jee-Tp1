import jakarta.xml.ws.Endpoint;
import ws.BnaqueService;

public class ServerWs {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BnaqueService());
        System.out.println("Web Service Deployed sur http://0.0.0.0:9191/");
    }
}
