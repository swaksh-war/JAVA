public class JavaArray {
    public static void main(String[] args) {
        String[] names={"ashu","anky","silver","dingo"};
        int[] myNum={10,20,30,40};

        System.out.println(names[2]);
        System.out.println(myNum[3]);
        
        myNum[3]=69;
        System.out.println(myNum[3]);

        System.out.println(myNum.length);
        
        for(int k=0;k<myNum.length;k++){
            System.out.println(myNum[k]);
        }

        for(String j: names){
            System.out.println(j);
        }

        //multidimentional array
        String[][] game={
            {"Csgo","Fortnite","GtaV","Rust"},
            {"GODLY","TATTI GAYYYY","THIKTHAK","MALUM NA OP"}
        };
        for(int i=0;i<4;i++){
            String z=game[0][i];
            String x=game[1][i];
            System.out.println(z+" is a "+x+" game");
        }
    }   
}
