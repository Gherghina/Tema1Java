package Lab3encapsul.AnimalRescue;

public class Dog {
    String name = "Labus";
    char gender = 'm';
    int sanatate = 8;
    int foame = 9;
    int spirit = 10;
    String mancare = "Royal Canin";
    String recreere = "mingea";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSanatate() {
        return sanatate;
    }

    public void setSanatate(int sanatate) {
        this.sanatate = sanatate;
    }

    public int getFoame() {
        return foame;
    }

    public void setFoame(int foame) {
        this.foame = foame;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public String getMancare() {
        return mancare;
    }

    public void setMancare(String mancare) {
        this.mancare = mancare;
    }

    public String getRecreere() {
        return recreere;
    }

    public void setRecreere(String recreere) {
        this.recreere = recreere;
    }

    String colour = "maro";
    String breed = "Corcitura";
    float weight = 8.6f;
    float age = 10.2f;

    public void barking() {
        System.out.println("ham ham");
    }

    public void run() {
        System.out.println("Running");
    }

    public void sleeping() {
        System.out.println("zzzZZZZzzzzz");

    }
}
