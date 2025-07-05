public class Substring {
    public static boolean findSubstring(String str1Raw,String str2Raw) {
        String str1 = str1Raw.toLowerCase();
        String str2 = str2Raw.toLowerCase();
        int len = str1.length();
        for (int i=0; i<len; i++) {
            if (str2.equals(str1.substring(0,i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "hello, how are you?";
        String str2 = "hello";
        if (findSubstring(str1,str2) == true) {
            System.out.println("The second string is a substring of the first string.");
        } else {
            System.out.println("The second string is not a substring of the first string.");
        }
}
}
