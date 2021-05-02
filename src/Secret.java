public class Secret {
    public static int secret(int w){
        while (w % 10 != 2) {
            w += 4 ;
        }
        return w;
    }
    public static void main(){
        int b = 4;
        System.out.print(secret(b-b));
    }

}
