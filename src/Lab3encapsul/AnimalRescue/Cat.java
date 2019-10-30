package Lab3encapsul.AnimalRescue;

public class Cat {
   String name = "Alina";
    char gender = 'f';
    int sanatate = 8;
    int foame = 6;
    int spirit = 10;
    String mancare = "Royal Canin";
    String recreere = "Somn si iarasi somn";
    String colour = "verde";
    String breed = "British Shorthair";
    float weight = 5.6f;
    float age = 1.2f;

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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }




   public void meawing ()
   {
       System.out.println("meaw");
   }
   public void run ()
    {
        System.out.println("Running");
    }
   public void sleeping ()
    {System.out.println("zzzZZZZzzzzz");
    }


}
