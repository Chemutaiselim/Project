public class Hello {
    public static void main(String[] args){
        String str = "hello hello";
        int s = 0;
        int e = str.length() - 1;
        boolean isReverse = true;
        while (s < e) {
            if (str.charAt(e) != str.charAt(s)) {
                isReverse = false;
                break;
            }
            s++;
            e--;
        }
        if (isReverse) {
            System.out.println("string is reversable…");
        } else {
            System.out.println("string is not reversable…");
        }

    }
}
