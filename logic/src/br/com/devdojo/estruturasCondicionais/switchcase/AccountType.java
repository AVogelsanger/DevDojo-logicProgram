package br.com.devdojo.estruturasCondicionais.switchcase;

public class AccountType {
    public static void main(String[] args) {

        String account = "Conta InVeStImEntO";

        switch (account.toUpperCase()){
            case "CONTA POUPANÇA":
                System.out.println("0.05%");
                break;
            case "CONTA CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("Tipp de conta não existente.");
        }

    }
}
