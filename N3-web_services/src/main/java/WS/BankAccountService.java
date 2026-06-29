package WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "BankWS")
public class BankAccountService {

    // 🔸 Conversion Euro -> DH
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(double montant) {
        return montant * 10.5; // taux exemple
    }

    // 🔸 Consulter un compte
    @WebMethod
    public Account getAccount(int code) {
        return new Account(code, Math.random() * 10000);
    }

    // 🔸 Liste des comptes
    @WebMethod
    public List<Account> listAccounts() {
        List<Account> comptes = new ArrayList<>();

        comptes.add(new Account(1, 5000));
        comptes.add(new Account(2, 9000));
        comptes.add(new Account(3, 12000));

        return comptes;
    }
}