public class JavaFor {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
        String[] names={"ashu","anky","silver","dingo"};
        String[] games={"CSGO","Fortnite","GTA V","Rust"};
        for(String i:games){
            System.out.println(i);
        }
        for(String j:names){
            System.out.println(j);
        }
    }
}
