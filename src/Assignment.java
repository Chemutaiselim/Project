import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Assignment {
    public static void main(String[] args) {
        /*int a []={0,2,4,6,8,10,12,14,16,18,20};
       System.out.println(a[a.length%2]);*/

      /*int a =3;
      int b=15;
      while (a<b){
          System.out.println("Hello");
          a=a+2;
          b=b-2;
          }*/

      /*  int i, sum = 0;
        for (i = 0; i < 10; i += 2);{
        sum = sum + i;
        }
        System.out.println("i="+i);*/

     /*String str="Java";
      for (int i=0;i<str.length();i++){
          char x=str.charAt(i);
          int y=1;
          for (int j=0; j<str.length();j++){
              if(str.charAt(j)==x&&i!=j){
                  y++;
              }
          }
          System.out.println(x+"->"+y);
      }*/

        String[][] Info = {{"Ahmed", "Ali"}, {"Noura", "Fatima"}};
        String name = Info[1][1];
        System.out.println(name);
    }
}
