package leet.arrys;

import java.util.ArrayList;
import java.util.Arrays;

public class SquaresofASortedArray {


   static int nums[] = {-4, -1, 0, 13, 1, 21};


    public static void main(String[] args) {
        System.out.println(sortedSquares(nums));
    }

    public static int[] sortedSquares(int[] nums) {
      int start =0;
      int end = nums.length-1;
      int res[] = new int[nums.length];
      for(int i=nums.length-1; i>=0; --i){
          if(Math.abs(nums[start])< Math.abs(nums[end])){
              res[i] = (int) Math.pow(nums[end],2);
              end--;
          }
          else{
              res[i] = (int)Math.pow(nums[start],2);
              start++;
          }
      }
        return res;
    }

}


/*
 for(int i=0; i<nums.length;i++)
        nums[i] = (int) Math.pow(nums[i],2);
        Arrays.sort(nums);
        return nums;*/
