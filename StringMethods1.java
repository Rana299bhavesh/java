public class StringMethods1 {
    public static void main(String[] args){
        String s="Rana is a student of Accurate college";
        System.out.println(s);

       // 1. Length
       System.out.println(s.length());

       // 2. CharAt
       System.out.println(s.charAt(2));

       // 3. Contains
       System.out.println(s.contains("Student"));

       // 4. starts with
       System.out.println(s.startsWith("Ra"));

       System.out.println(s.startsWith("is",5 ));

       // 5. endsWith
       System.out.println(s.endsWith("ege"));

       // 6. indexOf
       System.out.println(s.indexOf("ege"));

       // 7. isempty
       System.out.println(s.isEmpty());
       String s1="";
       System.out.println(s1.isEmpty());

       // 8. replace()
       System.out.println(s.replace("Rana" , "Bhavesh"));

       // 9. substring()--> Returns string(from where u want to priunt ur string)
       System.out.println(s.substring(8));

       // 10. substring()--> From where to where u wnat to print
       System.out.println(s.substring(0,19));  

       // 11. to upercase and lowercasee
       System.out.println(s.toLowerCase());
       System.out.println(s.toUpperCase());

       // 12. trim
       String s3= "     STUDENT ACCURATE COLLEGE     ";
       System.out.println(s3);
       System.out.println(s3.trim());

       // 13. equals
       String s4="Rana";
       String s5="rana";
       System.out.println(s4.equals(s5));

       // 14. equalsignore--> Ignores the upper and lower case
       String s6="Rana";
       String s7="rana";
       System.out.println(s6.equalsIgnoreCase(s7));

       // 15. Cocatnet
       String s8= "Rana";
       String s9= "Bhavesh";

       System.out.println(s8.concat(s9));
       System.out.println(s8 + s9);

       // 16. compare to
       String s10= "Rana";
       String s11= "Anar";
       System.out.println(s10.compareTo(s11));







    
    
    
    }
    
}
