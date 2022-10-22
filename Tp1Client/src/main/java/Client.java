import proxy.BanqueWS;
import proxy.BnaqueService;

public class Client {
    public static void main(String[] args) {
        BnaqueService bnq = new BanqueWS().getBnaqueServicePort();
        System.out.println(bnq.convert(12541));
    }
}
