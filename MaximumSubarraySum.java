/*

https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java

The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.

*/

//Solution




class Max {
    public static int sequence(int[] arr) {

        //First case: Empty array
        if(arr.length == 0) return 0;


        //Second case: All negative
        boolean allNegative = true;
        for(int number : arr){
            if(number > 0){
                allNegative = false;
                break;
            }
        }

        if(allNegative) return 0;


        //Third case: All positive
        boolean allPositive = true;
        int sumAllpositive = 0;
        for(int number : arr){
            if(number < 0){
                allPositive = false;
                break;
            }
            sumAllpositive += number;
        }

        if(allPositive) return sumAllpositive;


        //Fourth case: Mixed array
        int sum =0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <arr.length; i++){
            sum += arr[i];
            if(max < sum) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}