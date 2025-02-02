class CustomException1 extends Exception{
    public CustomException1(String name){
        super(name);
    }
}

class user{
    private String name;
    public user(String name) throws CustomException1 {
        if(name.length() < 5){
            throw new CustomException1("username must be atleast 5 character long");
        }
        this.name = name;
        System.out.println("Successfully created username");
    }
}

public class CustomException {
   public static void main(String[] args) {
      try{
        user name = new user("shobana");
      }catch(CustomException1 e){
        System.out.println("exception caught "+e.getMessage() );
      }
      try{
        user name = new user("riya");
      }catch(CustomException1 e){
        System.out.println("Exception caught "+e.getMessage());
      }
   }
}

