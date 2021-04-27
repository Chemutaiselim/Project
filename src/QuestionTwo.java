public class QuestionTwo {
    public static void main(String[] args) {
        String str = "Java";
        for (int i=0;i<str.length();i++) {
            char x = str.charAt(i);
            int y = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == x && i != j) {
                    y++;
                }
            }//end of for loop (inner)
            System.out.println(x + "->" + y);
        }//end of for loop (outer)
    }
}
