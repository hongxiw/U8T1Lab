import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        /*
        String[][] seatingChart = {
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
        };
        for(String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }
        seatingChart[1][2] = "Paul";
        for(String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }
        String tempStudent = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = tempStudent;
        for(String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }
        String[] tempRow = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempRow;
        for(String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        for(int[] row : arr1) {
            System.out.println(Arrays.toString(row));
        }
        for(int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;
        for(int[] row : arr1) {
            System.out.println(Arrays.toString(row));
        }
        for(int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }

        int[][] intArr1 = {
                {5, 2},
                {1, 3},
                {7, 9}
        };
        int[][] intArr2 = {
                {1, 2, 3},
                {6, 5, 4}
        };
        int[][] intArr3 = {
                {1, 2, 3, 4},
                {7, 8, 9, 10}
        };
        int[][] intArr4 = {
                {4, 5, 2},
                {1, 9, 7},
                {8, 10, 13}
        };
        int[][] intArr5 = {
                {4, 5, 2, 4, 1},
                {1, 9, 7, 8, 2},
                {8, 10, 13, 4, 3}
        };
        int[][] intArr6 = {
                {4, 5, 2, 4, 8, 9, 10},
                {1, 9, 7, 8, 6, 1, 2}
        };
        int[][] intArr7 = {{4},
                {7},
                {8},
                {2}};
        int[][] intArr8 = {{4}};
        int[][] intArr9 = {{}};
        System.out.println(FunWith2dArrays.totalElements(intArr1));
        System.out.println(FunWith2dArrays.totalElements(intArr2));
        System.out.println(FunWith2dArrays.totalElements(intArr3));
        System.out.println(FunWith2dArrays.totalElements(intArr4));
        System.out.println(FunWith2dArrays.totalElements(intArr5));
        System.out.println(FunWith2dArrays.totalElements(intArr6));
        System.out.println(FunWith2dArrays.totalElements(intArr7));
        System.out.println(FunWith2dArrays.totalElements(intArr8));
        System.out.println(FunWith2dArrays.totalElements(intArr9));
        */

        String[][] strArray1 = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        String[][] strArray2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        String[][] strArray3 = {
                {"phone", "mouse", "keyboard"}
        };
        String[][] strArray4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        String[][] strArray5 = {
                {"time"}
        };
        FunWith2dArrays.fourCorners(strArray1);
        FunWith2dArrays.fourCorners(strArray2);
        FunWith2dArrays.fourCorners(strArray3);
        FunWith2dArrays.fourCorners(strArray4);
        FunWith2dArrays.fourCorners(strArray5);
    }

}
