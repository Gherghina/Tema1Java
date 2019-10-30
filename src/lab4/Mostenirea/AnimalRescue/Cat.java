package lab4.Mostenirea.AnimalRescue;


public class Cat extends Animal{

    String colour = "verde";
    String breed = "British Shorthair";
    float weight = 5.6f;
    float age = 1.2f;



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
