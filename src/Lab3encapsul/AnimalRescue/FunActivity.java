package Lab3encapsul.AnimalRescue;

import java.security.PrivateKey;

public class FunActivity {

    private String Catel ;
   private String Pisica ;




    public void setName(String name) {
        this.Catel = name;
    }
    public String getCatel() {
        return Catel;
    }

    public void impreuna() {
        System.out.println("tup tup");
    }

    public void run() {
        System.out.println("Running");
    }

    public void sleeping() {
        System.out.println("zzzZZZZzzzzz");


    }
}
