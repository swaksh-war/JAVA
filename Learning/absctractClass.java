package Learning;

//Key difference between abstract class and inteface is- in interface all the items are abstract so you cant body in it but in abstract method you can add bpdy in a function ayou want

abstract class student{
    public abstract void name();
    public abstract void regNo();
}
class capti extends student{
    public void name(){
        System.out.println("my name is Capti!");
    }

    public void regNo(){
        int reg = 12016043;
        System.out.println(reg);
    }
}

class anky extends student{
    public void name(){
        System.out.println("my name is  anky!");
    }

    public void regNo(){
        int reg = 12019898;
        System.out.println(reg);
    }
}


public class absctractClass {

    public static void main(String[] args){
        capti c = new capti();
        c.name();
        c.regNo();

        anky a = new anky();
        a.name();
        a.regNo();
    }
    
}
