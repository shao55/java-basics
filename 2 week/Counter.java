public class Counter {
    public static void main(String[] args) {
        // Массив из int
        int[] a = {
                22, 22, 16, 31, 28, 19, 36,
                18, 26, 15, 27, 32, 22, 31,
                25, 23, 27, 16, 28, 19, 27, 33
        };
        // Создаем массив из 37 пустых ячеек (Почему 37 ? Потому что счет идёт с 0 до 36.
        // 36 это максимальный возраст, 0 это 1, 1 это 2, 2 это 3 ... 36 это 37).
        int[] count = new int[37];
        // [0, 0, 0, 0, 0, 0, ..., 0] - нули в массиве.
        // [0, 2, 3, 2, 1, 5, 1]
        // count[0] -> 0
        // count[1] -> 2
        // count[6] -> 1

        // count[i] -> Сколько людей возраста i, Индекс массива это возраст.
        // count[25] -> Сколько 25 летних?
        // count[90] -> Сколько 90 летних?

        // Цикл для массива, с 0 до 36 - это возраста (Массив "а").
        for (int i = 0; i < a.length; i++) {
            // Создаем переменную age, где будем хранить возраст в зависимости от индекса i массива а.
            int age = a[i]; // age = 15, 16
            // В зависимости от возраста age, увеличиваем на 1 пустые ячейки в массиве count.
            count[age]++; // count[2]++
        }

        // Цикл для распечатки количества возрастов в массиве count (Сколько чисел в каждом индексе массива).
        for (int i = 0; i < 37; i++) {
            // Условие, чтобы скрыть пустые ячейки в массиве count.
            if (count[i] > 0)
                // Печатаем i - возраст + count[i] - количество возрастов в массиве, в зависимости от индекса.
                System.out.println(i + " " + count[i]);
        }
    }
}
