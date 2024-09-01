package AAATRY;

import java.util.*;

class Solution11 {
    public int maxProfit(int[] prices) {
        int max=0;
        int buy=prices[0];
        int profit=0;
        for(int i=0; i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else{
                if(max<prices[i]-buy){
                max=prices[i]-buy;}
            }


        }
        return max;
    }
    public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> res = new HashSet<>();
    Arrays.sort(nums);


    for (int i = 0; i < nums.length - 2; i++) {
        int left=1+i;
        int right=nums.length-1;
        while(left<right){
            int result=nums[i]+ nums[left]+ nums[right];
            if(result==0){
                res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }
            else if(result<0){
                left++;
            }else{
                right--;
            }
        }

    }
    return new ArrayList<>(res);
    }
    public double findMaxAverage(int[] nums, int k) {
    int avg=0;

    Boolean b=true;
    for(int i=0;i<nums.length-k;i++){
        int sum=0;
        for(int j=i;j<i+k;j++){
            sum+=nums[j];
        };
        if(avg<(sum/k) || b){
            avg=sum/k;
            b=false;
        }
    }
    return avg;
    }

    public static int firstMissingPositive(int[] arr) {


        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(correct<arr.length&&correct>=0&& correct!=i){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }


    public static void main(String[] args) {
        int[]arr={3,4,1,-1,-1};
     ArrayList<Integer> list = new ArrayList<>();
     list.add(3);
     list.add(4);

     int temp= list.get(0);
     list.set(0,list.get(1));
     list.set(1, temp);


        System.out.println(list);
    }
}