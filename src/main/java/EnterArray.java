public class EnterArray {
    public static void enterArray(int a, int b, int c, int d, int e, int f, int g, int h){
        int[] numArray = {a, b, c, d, e, f, g, h};
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i]%3 == 0){
                System.out.println(numArray[i]);
            }
        }
    }
}