public class Strings2 {
    public static void main(String[] args) {
        // compare two strings 
        String name1 = "Utkrisht";
        String name2 = "Coding";

        //1 s1 > s2 : +ve value 
        //2 s1 == s2 : 0 
        //3 s1 < s2  : -ve value 

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        } 
        else {
            System.out.println("Strings are not equal"); 
        }
        }
     }


