package Linear_sreach.Find_no;

public class _EvenOrOdd {

    public static void main(String[] args) {

        int[] arr={10,20,2,3,223,2200,-22,0};

        System.out.println(evenodd(arr));

    }

    static int evenodd(int []arr)
    {
        int count=0;

            for(int j=0;j< arr.length;j++){
                if(even(arr[j])) {
                    count++;
                }
            }

        return count;
    }

  static boolean Even(int n) {
      int count=0;
        if(n<0){
            n=-1*n;
        }
        if(n==0){
           count-=1;
        }

        while(n>0){
            count++;
            n=n/10;
        }
        return count%2==0;
    }
    static boolean even(int n){
        if(n<0){
            n=-1*n;
        }
        String s=String.valueOf(n);

        return s.length()%2==0;
    }


}
