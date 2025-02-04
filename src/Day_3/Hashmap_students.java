package Day_3;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_students {
    public static void main(String[] args) {
        HashMap<Integer,String> details = new HashMap<>();
        details.put(001, "Riya");
        details.put(002, "Arun");
        details.put(003, "Anu");
        details.put(004, "Diya");
        details.put(005, "Ram");

        displayStudents(details);
        int roll = 002;

        if(details.containsKey(roll)){
            System.out.println("Student with roll number "+roll+" : " +details.get(roll));
        }else{
            System.out.println("No student found for the roll number "+roll);
        }

        System.out.println("Removing the Student with roll number "+roll+" "+ details.remove(roll));
        displayStudents(details);

        
    }
    private static void displayStudents(HashMap<Integer, String> details) {
          for(Map.Entry<Integer,String> entry : details.entrySet()){
            System.out.println("Roll Number "+entry.getKey() +", Name "+entry.getValue());
          }
    }

}
