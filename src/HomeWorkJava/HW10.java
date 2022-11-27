package HomeWorkJava;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {
        // Создайте массив размером 100 символов, заполните все ячейки значением 10.
        // 1 и 99 ячейки заполните значениями, равными 0
        int[] array = new int[100];
        array[0] = 0;
        array[98] = 0;
        for (int i = 1; i < array.length; i++) {
            if (i == 98) {
                continue;
            }
            array[i] = 10;
        }
        System.out.println(Arrays.toString(array));

        // Создайте массив размером 100 символов, заполните все ячейки согласно такому правилу:
        // 1 ячейка - 111, 2ая - 222, 3ая - 333,….  11ая - 111, 12ая - 222, 13ая - 333.
        // Найдите сумму значений всех ячеек
        int[] arrayNew = new int[100];
        arrayNew[0] = 111;

        for (int j = 1; j < arrayNew.length; j++) {
            arrayNew[11] = arrayNew[11 - 1] + 111;
            if (j % 10 == 0) {
                arrayNew[j] = 111;
            }
        }
        System.out.println(Arrays.toString(arrayNew));

        int sum = 0;
        for (int m = 0; m < array.length; m++) {
            sum += arrayNew[m];
        }
        System.out.println(sum);
    }
}




