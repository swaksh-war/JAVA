package Learning;
public class JavaBreakContinue {
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            if(i==3){
                System.out.println("Code ends here");
                break;
            }
        }
        for(int j=0;j<7;j++){
            if(j==2){
                continue;
            }
            System.out.println(j+" abra ka dabra");
        }
    }
}
