import java.util.Scanner;
public class areaofarectangle{
    public static double setDim(double x,double y){
        return x*y;
    } 
    public static double getArea(double x,double y){
        System.out.println("the area of the given rectangle is "+ setDim(x,y));
        return 0;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = s.nextInt();
        System.out.println("Enter breadth: ");
        int b = s.nextInt();
        getArea(l,b);
    }
}