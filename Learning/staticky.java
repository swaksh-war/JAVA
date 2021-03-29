package Learning;

public class staticky {
    static int a = 99;

    public static void main(String[] args){
        int b = 1;
        System.out.println(a+b);
    }
    // we need to use static keyword to use it in the main function and as the main function is static so if we dont add static to the global variable we dont be defined as a static(non-static).
}
