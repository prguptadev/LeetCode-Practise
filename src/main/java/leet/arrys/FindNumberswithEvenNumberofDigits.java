package leet.arrys;


//Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//
//        Example 1:
//
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.

public class FindNumberswithEvenNumberofDigits {
    private static int digit =0;
    public static void main(String[] args) {
        int nums[] = {234, 34, 234, 231, 1, 12343};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
            int res =0;
        for (int num : nums) {
            if(numberDigits(num)%2 ==0 )
                res++;
          //  res = Math.max(res,numberDigits(num));
            digit=0;
        }
        return res;
    }

    public static int numberDigits(int num) {
      //  int digit =0;
        if(num > 0){
            num = num/10;
            digit++;
              numberDigits(num);
        }

        return digit;
    }


//    public int getDigitCount(int n)
//    {
//        int count=0;
//        while(n!=0)
//        {
//            n/=10;
//            count++;
//        }
//        return count;
//    }
}
