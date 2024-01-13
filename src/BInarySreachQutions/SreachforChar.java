package BInarySreachQutions;

public class SreachforChar {

    static char ceiling(char[]letters,char target){

        int start=0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

          if (letters[mid]<target) {
                start=mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return letters[start%letters.length];
        }



    public static void main(String[] args) {
     char[] arr={'c','f','j'};

        System.out.println( ceiling(arr,'k'));
    }
}
