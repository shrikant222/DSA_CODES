//import java.util.Scanner;
//class AAA{
//    char[][] arr={
//            {'A','A','A'},
//            {'A','A','A'},
//            {'A','A','A'},
//    };
//    boolean flag=true;
//
//    public boolean check(int one, int two){
//    if(arr[one][two]=='A'){
//        return true;
//    }else{
//        return false;
//    }
//    }
//    public void over(){
//        if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]){
//            flag=false;
//        }
//        else if (arr[0][0]==arr[0][1]&&arr[0][1]==arr[0][2]) {
//            flag=false;
//        } else if (arr[0][0]==arr[1][0]&&arr[1][0]==arr[2][0]) {
//            flag=false;
//        }
//        else if (arr[1][0]==arr[1][1]&&arr[1][1]==arr[1][2]) {
//            flag=false;
//        }
//        else if (arr[2][0]==arr[2][1]&&arr[2][1]==arr[2][2]) {
//            flag=false;
//        }
//        else if (arr[0][1]==arr[1][1]&&arr[1][1]==arr[2][1]) {
//            flag=false;
//        }
//        else if (arr[0][2]==arr[1][2]&&arr[1][2]==arr[2][2]) {
//            flag=false;
//        }
//    }
//
//
//    public void playing(){
//       while(flag){
//           Scanner sc = new Scanner(System.in);
//           player1(sc);
//           player2(sc);
//       }       }
//    }
//
//    public void player1(Scanner sc){
//        int one=sc.nextInt();
//        int two=sc.nextInt();
//        if(check(one,two)){
//            arr[one][two]='o';
//        }{
//            System.out.println("Error play again");
//        }
//
//    }
//    public void player2(Scanner sc){
//        int one=sc.nextInt();
//        int two=sc.nextInt();
//        if(check(one,two)){
//            arr[one][two]='x';
//        }{
//            System.out.println("Error play again");
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//}