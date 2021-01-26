package Learning;
public class TypeCast {
    public static void main(String[] args){
        double myDouble=764764;
        int myInt=(int) myDouble;
        System.out.println(myInt); 

        int myInt1=76857525;
        double myDouble1=myInt1;
        System.out.println(myDouble1);

    }
}

// Type Casting is of 2 types : Narrowing(manually) & Widening(automatic)
// from small to big -->
//byte->short->char->int->long->float->double
