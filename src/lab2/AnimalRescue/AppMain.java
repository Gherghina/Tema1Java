package lab2.AnimalRescue;

import javax.naming.InvalidNameException;

public class AppMain {
    public static void main(String[] args) {
       Cat alina = new Cat ();
        System.out.println("Noua pisica nu se mai numeste Alina, ci:");
       alina.name = "Viorica";
        System.out.println(alina.name);
        System.out.println("Rasa este: "+ alina.breed);
        System.out.println("Gender:  " + alina.gender);

        Dog catel= new Dog();
        catel.name ="\nDog";
        System.out.println(catel.name);
        System.out.println("Catelul meu latra asa: ");
        catel.barking();
        System.out.println("Catelului ii este foame de nota: " + catel.foame);

        Food mancare = new Food ();
        mancare.numeleFirmei ="food";
        mancare.numeleFirmei ="Mancarea cainelui este:";
        System.out.println(mancare.numeleFirmei);
        System.out.println(mancare.mancare2);

        Owner proprietar = new Owner();
        System.out.println("\nProprietarul AnimalRescue este: " + proprietar.name);
        System.out.println("Hobby proprietar: ");
        proprietar.bucatareste();

        Vet doctorul = new Vet();
        System.out.println("\nNoul veterinar este: " + doctorul.nume);
        System.out.println("Are studii la: " +doctorul.studii);
        System.out.println("Veterinarul e pasionat de dansul: ");
        doctorul.Promotia();

        //cand lipseste Veterinarul este inlocuit de: nou obiect cu aceleasi proprietasti dar numele e diferit

        Vet Doctorita = new Vet();
        Doctorita.nume = "Doctorita Plushica";
        System.out.println("cand lipseste Veterinarul este inlocuit de: " + Doctorita.nume);

    }

}
