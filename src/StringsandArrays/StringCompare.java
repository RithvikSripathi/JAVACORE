package StringsandArrays;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "Mike Royko";
        String str4 = "stephen edwin king";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str4));


    }
}
