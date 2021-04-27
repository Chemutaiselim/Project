public class Question {
    public static boolean mystery(int n) {
    System.out.println("Inside mystery (" + n + ")");
    return Math.sqrt(n) == Math.floor(Math.sqrt(n));
}

    public static boolean secret(int n) {
        System.out.println("Inside secret (" + n + ")");
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 9, 16, 20, 25};
        boolean res1, res2;
        for (int i = 0; i < numbers.length; i++) {
            res1 = secret(numbers[i]);
            res2 = mystery(numbers[i]);
            if ( res1 && res2) {
                System.out.println(numbers[i]);
            }
        }
    }

}
