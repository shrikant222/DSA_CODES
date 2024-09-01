package AAATRY;

import java.util.*;

class CCC{
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i=0; i<nums.length; i++){
             pq.add(nums[i]);

             if (pq.size() > k) {
                 pq.poll();
             }
         }
         return pq.peek();

    }
    public static void A(int[] nums, int k){
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            deque.add(nums[i]);
        }
        int max=0;
        for(int i=0; i<nums.length; i++){
            if (!deque.isEmpty() && max < deque.peek()) {
                max = deque.peek();
            }

        }
    }



    public static void rot(int[] nums, int k){
        int s=k;
        int e = nums.length-1;
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            e--;s++;
        }

    }
    public static int str(){
        String in="ababbbccd";
        HashMap<Character,Integer> hm= new HashMap<>();

        for(int i=0;i<in.length();i++){
            char ch=in.charAt(i);
        int temp=hm.getOrDefault(ch,0);
        hm.put(ch,temp+1);
        }
        for(int i=0;i<in.length();i++){
            char ch=in.charAt(i);
            if(hm.get(ch)==1)return i;
        }

        return -1;


    }
    public static int anagram(String str, String str2){
        str=str.toLowerCase();
        str2=str2.toLowerCase();

        str=str.replaceAll(" ", "");
        str2=str2.replaceAll(" ", "");
        int []arr=new int[26];
        for(int i=0;i<str.length();i++){
          arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0)return i;
        }
        return 11;
    }


        public static void main(String []args){
            int[][]arr={
                    {0,1},
                    {1,2},
                    {2,3},
            };
           max(arr);
            System.out.println(Arrays.deepToString(arr));
        }

        public static void max(int[][]arr){
        boolean firstrow=false; boolean firstcol=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                if(i==0)firstrow=true;
                if(j==0)firstcol=true;
                arr[0][j]=0;
                arr[i][0]=0;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][0]==0||arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        if(firstcol){
        for(int i=1;i<arr.length;i++){
          arr[i][0]=0;
        }}
        if(firstrow){
            for(int i=1;i<arr[0].length;i++){
                arr[0][i]=0;
            }
        }



        }





}