
//An enum (short for enumeration) in Java is a special data type used to define a fixed set of constants.
//  It is a type-safe way to represent a group of related constants.
// The values() method returns an array of all enum constants.
// The ordinal() method returns the index of an enum constant.


public class enumexample {
       enum Week{
        monday,tuesday,wednesday,thirsday, friday,saturday,sunday
       }

       public static void main(String[] args) {
        
        Week today = Week.saturday;
        System.out.println("Today is "+today);
        
        for(Week day : Week.values()){
            System.out.println(day);
        }
       }
}
