package Enums;

enum name{
    Capti,Dingo,Silver,Anky;
}

public class LetsDoEnum {
    public static void  main(String[] args){
        name n = name.Dingo;
        switch(n){
            case Capti:
            System.out.println("Chal Capti");
            break;
            case Dingo:
            System.out.println("Dangerous Dingo!");
            break;
            case Silver:
            System.out.println("Savage Silver!");
            break;
            case Anky:
            System.out.println("Avenger Anky");
            break;
        }
    }
    
}
