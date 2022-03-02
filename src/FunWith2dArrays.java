public class FunWith2dArrays {

    public static int totalElements(int[][] twoDArray) {
        return twoDArray.length * twoDArray[0].length;
    }

    public static void fourCorners(String[][] twoDArray) {
        System.out.println(twoDArray[0][0]);
        System.out.println(twoDArray[0][twoDArray[0].length - 1]);
        System.out.println(twoDArray[twoDArray.length - 1][0]);
        System.out.println(twoDArray[twoDArray.length - 1][twoDArray[twoDArray.length - 1].length - 1]);
    }

}
