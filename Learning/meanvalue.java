package Learning;

import java.util.Scanner;

public class meanvalue {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int inputNum = sc.nextInt();
        int nums[] = new int[inputNum];
        for(int i=0; i<inputNum;i++){
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j=0;j<inputNum;j++){
            sum = sum + nums[j];
        }

        int result = sum/(nums.length);

        System.out.println(result);
    }
    
}
