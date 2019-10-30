package lab4.Mostenirea.AnimalRescue;

public class Animal {
    private String name ;
    private char gender ;
    private int sanatate ;
    private int foame ;
    private int spirit ;
    private String mancare = "Royal Canin";
    private String recreere = "mingea";


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