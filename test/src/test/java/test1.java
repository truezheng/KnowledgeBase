import java.io.*;

/**
 * @Auther: zheng
 * @Date: 2019/10/24
 * @Description:
 */


public class test1 {
    public static void main(String[] args) throws IOException {
        int[][] chessArray = new int[11][11];//棋盘二维数组
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;

//        System.out.println("=====原始二维数组=====");
//        for (int[] array : chessArray) {
//            for (int item : array) {
//                System.out.printf("%d\t",item);
//            }
//            System.out.println();
//        }

        int sum = 0;
        int row = chessArray.length;
        int columun = chessArray[1].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columun; j++) {
                if (chessArray[i][j] != 0) sum++;
            }
        }
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = row;
        sparseArray[0][1] = columun;
        sparseArray[0][2] = sum;
        int r = 0;  //记录是第几个非零数据
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columun; j++) {
                if (chessArray[i][j] != 0) {
                    r++;
                    sparseArray[r][0] = i;
                    sparseArray[r][1] = j;
                    sparseArray[r][2] = chessArray[i][j];
                }
            }
        }
        System.out.println("=====稀疏二维数组=====");
        //FileWriter fileWriter = new FileWriter("C:\\Users\\zheng\\Desktop\\test.txt");
        //FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\zheng\\Desktop\\test.txt");
        for (int[] array : sparseArray) {
            for (int item : array) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
        //FileInputStream fileInputStream = new FileInputStream("C:\\Users\\zheng\\Desktop\\test.txt");


//        int[][] chessArray1 = new int[sparseArray[0][0]][sparseArray[0][1]];
//        for (int i = 1; i < sparseArray.length; i++) {
//            chessArray1[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
//        }
//        System.out.println("=====还原二维数组=====");
//        for (int[] array : chessArray1) {
//            for (int item : array) {
//                System.out.printf("%d\t", item);
//            }
//            System.out.println();
//        }

    }
}
