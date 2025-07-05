public class Substring2 {
    public static int findSubCount(String str1Raw,String str2Raw) {
        String str1 = str1Raw.toLowerCase();
        String str2 = str2Raw.toLowerCase();
        int len = str1.length();
        int subCount = 0;
        for (int i=0; i<len; i++) {
            for (int x=i+1; x<len+1; x++) {
                if (str2.equals(str1.substring(i,x))) {
                    subCount++;
                }
            }
        }
        return subCount;
    }
    public static void main(String[] args) {
        String str1 = "ajsdlkfj23r09ruhello8r23jrfjhello2r3jrlkfsdhelloaslkdfj23rjrlkajsdfhello9u32jrlk23jrlaksjdhello23rjrlkfj23lkjhelloasdflk23rjlaksdfhello23rjrlkajsdhello23rjlkajsdfhello23rjrlkajsdfhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhello23rjrlkajsdhellor";
        String str2 = "hello";
        System.out.println("String two appears in string one "+findSubCount(str1, str2)+" times.");
}
}
