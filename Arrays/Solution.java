package Arrays;

class Solution {
    public int maxSubArray(int[] arr) {
        int sum = 0 , max = arr[0];
        for (int i = 0; i <arr.length; i++) {
            sum= sum + arr[i];
            if ( sum > max ){
                max = sum;
            }
            if( sum < 0 ){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] x){
        int maximum;
        Solution obj = new Solution();
        int[] nums ={-2,-1,-3};
        maximum = obj.maxSubArray(nums);
        System.out.print("The largest sum of the subarray is : "+ maximum);
    }
}