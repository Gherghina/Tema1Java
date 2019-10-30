package Lab3encapsul.AnimalRescue;

public class Food {

    private String numeleFirmei ;
    private String mancare2 ;
    private int stoc ;
    private String  disponibilitate ;
    private double pret2 ;

    public void setNumeleFirmei(String numeleFirmei) {
        this.numeleFirmei=numeleFirmei;
    }
    public String getNumeleFirmei(){
        return numeleFirmei;
    }


    public void degustare ()
    {
        System.out.println("miam miam");
    }

}
