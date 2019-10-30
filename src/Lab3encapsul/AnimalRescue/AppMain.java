package Lab3encapsul.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        //Encapsularea saraciei

     Cat Anemona= new Cat();
     Anemona.setBreed("Anemona");
     System.out.println(Anemona.getName());
     System.out.println(Anemona.getSanatate());

     Dog cutulache = new Dog();
     cutulache.setName("cutulache");
     System.out.println(cutulache.getName());

     Food Mancare = new Food();
     Mancare.setNumeleFirmei ("Dis");
        System.out.println(Mancare.getNumeleFirmei());
        Mancare.degustare();

        FunActivity tenis= new FunActivity();
      tenis.setName ("Si-am zis una ");
        System.out.println(tenis.getCatel());

        Owner sef = new Owner();
        sef.setName("Noul nume");
        System.out.println(sef.getName());

        Vet doctor= new Vet();
        doctor.setNume("Cum il cheama");
        System.out.println(doctor.getNume());









    }

}
