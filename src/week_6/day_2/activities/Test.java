package week_6.day_2.activities;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        var input = new Scanner(System.in);

        int[] nums = new int[3];

        int i = 0;
        while ( i <= nums.length-1 ) {
            System.out.print("input number " + (i+1)+": ");
            nums[i] = input.nextInt();
            i++;
        }

        System.out.print(Arrays.toString(nums) );
        
        System.out.println();
        
        for ( int number : nums ) {
            System.out.print( number + " " );
        }


    }

}
