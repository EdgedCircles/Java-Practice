public class Strings {
    public static void main(String[] args) {
        char[] ch = {'a','b'};
        String a = ch[0] + "" + ch[1];
        String b = ch[1] + "" + ch[0];
        System.out.println(a + ", " + b);
    }
}