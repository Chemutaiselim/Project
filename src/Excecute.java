public class Excecute {
    public static void changeArray(int[] data)
    {
        for (int k = data.length - 1; k > 0; k--)
            data[k - 1] = data[k] + data[k - 1];
    }
    public static void main(String[] args) {
        int[] d = {1, 6, 12};
        changeArray(d);
      for (int element:d){
          System.out.println(element);
      }
    }

}
