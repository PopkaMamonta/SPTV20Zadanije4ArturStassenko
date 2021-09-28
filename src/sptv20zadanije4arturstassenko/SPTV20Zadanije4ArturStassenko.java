
package sptv20zadanije4arturstassenko;

import java.util.Arrays;
import java.util.Random;

public class SPTV20Zadanije4ArturStassenko {

    public static void main(String[] args) {
        Random random=new Random();
        int[] nums;
        nums=new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=random.nextInt(100);
        }
        System.out.println("nums = "+Arrays.toString(nums));
    }
    
}
