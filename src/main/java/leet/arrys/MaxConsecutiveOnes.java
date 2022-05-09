package leet.arrys;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//   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
//
//        Example 1:
//
//        Input: nums = [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public   static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }
}


//   if(nums[i]== 1){
//                 count+=1;
//                 res = Math.max(res,count);
//             }

//             else {
//                 count=0;

//             }


//         }