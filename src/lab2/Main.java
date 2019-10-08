package lab2;

public class Main {
    public static void main(String[] args) {

        int x=5;
        int y=3;
        int z=4;

        int result = sum (x,y);
        int result2 = substract(x,y);
        float result3 = division(x,y);
        int result4 = multiplication(x,y);
        int result5 = average(x,y,z);

        media (8,9,3);

        System.out.println("\n1.  Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main.");
        printMyName();

        System.out.println("\n2. Scrieti cate o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.");
        System.out.println( "Rezultatul adunarii este: " + result);
        System.out.println("Rezultatul scaderii este: " + result2);
        System.out.println( "Rezultatul impartirii este: " + result3);
        System.out.println("Rezultatul inmultirii este: " + result4);

        System.out.println("\n3. Scrieti o metoda Java, care sa afiseze urmatorul model:");

            System.out.println("   J    a   v     v  a ");
            System.out.println("   J   a a   v   v  a a");
            System.out.println("J  J  aaaaa   V V  aaaaa");
            System.out.println(" JJ  a     a   V  a     a");

        System.out.println("\n4. o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor:");
        System.out.println("Rezultatul mediei este: " + result5);


       // System.out.println("\n6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere");
      // System.out.println("Restul este:" + result6);
        }

    public static int sum(int first, int second)
    {
        int sum= first + second;
        return sum;

    }


    public static int substract(int first, int second)
    {
        int substract= first-second;
        return substract;
    }
    public static float division(int first, float second)
    {
        float division= first/second;
        return division;
    }
    public static int multiplication(int first, int second)
    {
       int multiplication = first*second;
        return multiplication;
    }

    public static void printMyName(){

        System.out.println("Hello! \n Maria Spulber");
    }

    public static int average(int first, int second, int third)
    {
        int average = (first+second+third)/3;
        return average;
    }

    public static void media (int first, int second, int third)
            // sa imi arate Cosmin de ce nu vrea sa afiseze ...
    {
        int media = (first+second+third)/3;
        System.out.println(media);
    }


}









