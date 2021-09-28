
package sptv20zadanije4arturstassenko;

import java.util.Arrays;
import java.util.Random;

public class SPTV20Zadanije4ArturStassenko {

    public static void main(String[] args) {
        Random random=new Random();
        int[] nums;
        nums=new int[10];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2; j++) {
            int rand=random.nextInt(100);
            if(rand%2==0){
                nums[i]=rand;
                j++;
            }else{
                j-=1;
            }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int min=nums[i];
            int place=i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<min){
                    min=nums[j];
                    place=j;
                }
            }
                if (i != place) {
                    int tmp = nums[i];
                    nums[i] = nums[place];
                    nums[place] = tmp;
                }
        }
        double sum=0;
        double avg=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            
            
        }
        avg=sum/nums.length;
        System.out.println("nums = "+Arrays.toString(nums));
        System.out.printf("nums average = %.2f%n",avg);
    }
    
}
