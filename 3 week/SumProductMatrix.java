public class SumProductMatrix {
    public static void main(String[] args) {
        // Входящие данные для определения размера матрицы arr1 и arr2
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // Создаем 2 матрицы
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];

        // Заполняем первую матрицу рандомными числами
        System.out.println("First 2D Array:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = (int) (Math.random() * 10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Заполняем вторую матрицу рандомными числами
        System.out.println("Second 2D Array");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr2[i][j] = (int) (Math.random() * 10);
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Суммируем первую и вторую матрицу и печатаем результат в третью
        System.out.println("Sum of two 2D Array");
        int[][] sum = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Умножаем первую и вторую матрицу и печатаем результат в четвертую
        System.out.println("Dot product of two 2D Array");
        int[][] dot = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                dot[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print(dot[i][j] + " ");
            }
            System.out.println();
        }
    }
}
