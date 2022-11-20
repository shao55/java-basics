public class BouncingBall {
    public static void main(String[] args) {
        double rx = .480, ry = .860; // Начальная позиция мяча
        double vx = .015, vy = .023; // Скорость мяча
        double radius = .05; // Радиус мяча
        StdDraw.setXscale(-1.0, +1.0); // Границы по оси X
        StdDraw.setYscale(-1.0, +1.0); // Границы по оси Y
        // Бесконечный цикл:
        // Рисуем серый фон -> Определяем новые позиции шарика (стартовые позиции описаны выше) -> Рисуем шарик -> Через .show отображаем все
        // -> Рисуем новый серый фон, который затирает старые позиции мяса -> ...
        while (true) {
            // Если мы перенесем 13, 14 позиции вне цикла, то старые позиции шарика не будут затираться, и будет рисоваться линия!
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY); // Цвет фона
            StdDraw.filledSquare(0.0, 0.0, 1.0); // Рисуем серый фон
            // Проверка условия соприкосновения шара с границей
            if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;
            if (Math.abs(ry + vy) + radius > 1.0) vy = -vy;
            // Каждое изменение позиции
            rx = rx + vx;
            ry = ry + vy;
            StdDraw.setPenColor(StdDraw.BLACK); // Цвет шарика
            // Рисуем шарик с аргументами начальных позиций и радиуса
            StdDraw.filledCircle(rx, ry, radius);
            // Отображение всего описанного на экране;
            // вызов этого метода означает, что экран БУДЕТ перерисован с частотой , которая в аргументе
            StdDraw.show(10);
        }
    }
}
