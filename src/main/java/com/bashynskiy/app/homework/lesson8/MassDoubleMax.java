package com.bashynskiy.app.homework.lesson8;


/**
 * Created by admin on 02.04.2017.
 */
public class MassDoubleMax {
    //*** Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
    // Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива
    // (его индекс не имеет значения).
    public void massDouble() {
        int max = 0;
        int[][] mathSecond = new int[5][8]; // объявили двухмерный массив
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                    mathSecond[i][j] = (int)((Math.random()*199)-99);
                if (i == 0 & j == 0) {
                    max = mathSecond[i][j];
                }
                if (max < mathSecond[i][j]) {
                    max = mathSecond[i][j];
                }
                    System.out.print(mathSecond[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Max element = " + max);
    }

}
