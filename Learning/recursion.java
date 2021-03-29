package Learning;
public class recursion {
    public static void main(String[] args){
        countDown(5);
    }
    public static void countDown(int n){
        if(n ==0){
            System.out.println("Done!");
        }else{
            System.out.println(n);
            n--;
            countDown(n);
        }
    }
    
}
