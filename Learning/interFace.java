package Learning;

interface Waterbottle{
    String color = "Blue";

    void fillUp();
    void pourOut();
}

public class interFace implements Waterbottle{

    public static void main(String[] args){
        interFace w = new interFace();
        w.fillUp();
        w.pourOut();

    }

    @Override
    public void fillUp() {
        System.out.println("Filled out");
        
    }

    @Override
    public void pourOut() {
        System.out.println("Poured out");
        
    }
    
}
