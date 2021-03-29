package Learning;

public class recursion1 {
    
    static int boom(int n){
        if(n==0 || n==1)
        {
            return 1;
        } 
        else
        {
            return (n * boom(n-1));
        }
    }
    public static void main(String[] args){
       int res = boom(4);
       System.out.println(res);
    }
}
