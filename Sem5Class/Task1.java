// Шахматную доску размером 5x5 обойти конём так, чтобы фигура в каждой клетке была строго один раз.

package Sem5Class;

public class Task1 {
    public static void main(String[] args) {
        int[][] field = new int[5][5];

        Go(1, field, 2, 2);

    }

    private static void Go(int number, int[][] field, int x, int y) {
        if (x < 0 || y < 0 || x >= field[0].length || y >= field.length) {
            return;
        }
        if (field[y][x] != 0) {
            return;
        }
        if (number == field[0].length * field.length) {
            Print(field);
            System.exit(0);
        }
        field[y][x] = number;
        Go(number + 1, field, x + 1, y + 2);
        Go(number + 1, field, x - 1, y + 2);
        Go(number + 1, field, x + 1, y - 2);
        Go(number + 1, field, x - 1, y - 2);
        Go(number + 1, field, x + 2, y - 1);
        Go(number + 1, field, x - 2, y - 1);
        Go(number + 1, field, x - 2, y + 1);
        Go(number + 1, field, x + 2, y + 1);

        field[y][x] = 0;

    }

    private static void Print(int[][] field) {
        for (int[] array : field) {
            for (int cell : array) {
                System.out.printf("%2d  ", cell);
            }
            System.out.println();
        }
    }

}
