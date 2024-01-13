package Arrays.kk;//package Arrays.kk;
//
//
//
//class Two {
//    // reverse the number
//
//   protected int rev(int num)
//   {
//        int revnum = 0;
//        while(num>0) {
//
//            int n = num % 10;
//            revnum=revnum*10+n;
//            num/=10;
//        }
//        return  revnum;
//    }
//}
//public class OOPs {
//
//        public static void main(String[] args) {
//        Two t = new Two();
//        System.out.println(t.rev(123));
//
//
//
//  }
//}








class One{
    protected static int rev(int num)
    {
        int revnum=0;
        while (num>0 ){
            int n=num%10;
            revnum=revnum*10+n;
            num =num/10;
        }

       return revnum;
    }

    public static void main(String[] args) {
        System.out.println(rev(123123));
    }
}

