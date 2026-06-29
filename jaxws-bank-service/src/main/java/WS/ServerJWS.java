package Server;

import jakarta.xml.ws.Endpoint;
import WS.BankAccountService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:9191/";
        Endpoint.publish(url, new BankAccountService());
        System.out.println("Web Service deployé sur : " + url);
    }
}
