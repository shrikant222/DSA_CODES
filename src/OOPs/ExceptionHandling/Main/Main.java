package OOPs.ExceptionHandling.Main;

public class Main {
    public static void main(String[] args)  {
        int a=10,b=0;
        try{
            String s= "shrikant";
            if(s.equals("shrikant")){
                throw new CustomException("name is shrikant");
            }

        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done");
        }
    }
   static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
