import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //NullPointerException 
    try{
        String str = null;
        System.out.println("String length is "+str.length());
    }catch(NullPointerException e){
        System.out.println("The String is null"+ e.getMessage());

    }finally{
        System.out.println("The Program is done with ExceptionHandling");
    }

    //ArrayIndex Out Of bound Exception
    try{
        int[] arr = {2,4,8};
        System.out.println("Array index 3 has "+arr[3]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexoutofBoundException"+ e.getMessage());
    }finally{
        System.out.println("The ArrayIndexoutofBoundException code done!");
    }
}

}
