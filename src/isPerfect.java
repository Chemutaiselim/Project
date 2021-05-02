public class isPerfect {
    public static boolean isPerfect(int n)
    {
        System.out.println("Inside isPerfect");
        if (Math.sqrt(n) == Math.floor(Math.sqrt(n)))
            return true;
        return false;
    }
    public static void main(String[] args) {
        int [] numbers = { 1, 3, 4, 6, 8, 9 };
        for (int i = 0; i< numbers.length; i++){
            if (isPerfect(numbers[i])==true)
                System.out.println(numbers[i]);
        }
    }

}
