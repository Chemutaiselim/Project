public class select {
    public static char[] select(char[] array) {
        int j = 0;
        char[] v = new char[array.length];
        for (int i = 0; i < v.length; i++) {
            v[i] = '*';
        }
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    v[j] = array[i];
                    j++;
                    break;
            }
        }// end for
        return v;
    }
    public static void main(String[] args) {
        char[] word = {'P', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 'n', 'g'};
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
        System.out.println();
        char[] x = select(word);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

}
