public class JavaSwitch {
    public static void main(String[] args){
        int day=7;
        String x="Non Sunday";
        switch(day){
            case 1:
            System.out.println(x);
            break;
            
            case 2:
            System.out.println(x);
            break;

            case 3:
            System.out.println(x);
            break;

            case 4:
            System.out.println(x);
            break;

            case 5:
            System.out.println(x);
            break;

            case 6:
            System.out.println("Almost Sunday");
            break;

            case 7:
            System.out.println("Its Sunday Blyat");
            break;

            default:
            System.out.println("There is only 7 days in a week!!");
        }
    }
    
}
