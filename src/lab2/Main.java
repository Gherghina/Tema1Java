package lab2;

public class Main {
    public static void main(String[] args) {
        int x=5;
       int y=3;
        int result = sum (x,y);
        int result2 = substract(x,y);
        float result3 = division(x,y);
        int result4 = multiplication(x,y);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
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


}
