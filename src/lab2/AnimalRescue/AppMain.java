package lab2.AnimalRescue;

import javax.naming.InvalidNameException;

public class AppMain {
    public static void main(String[] args) {
       Cat alina = new Cat ();
       alina.name = "Viorica";
        System.out.println(alina.name);
        System.out.println(alina.breed);
        System.out.println(alina.gender);
        Dog catel= new Dog();

        catel.name ="dog";
        System.out.println(catel.name);



    }

}
