/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perviy;

/**
 *
 * @author Student 3
 */
public class zadanie_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[15];
        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Сформировать массив из 15 целых чисел, выбранных случайным образом из\n"
                + "интервала [-10, 30]. Найти среднее арифметическое положительных элементов.");
        System.out.println("исходный массив: ");

        for (int i1 = 0; i1 < array1.length; i1++) {
            array1[i1] = (int) (Math.random() * 40 - 10);
            System.out.print(array1[i1] + " ");
        }
        System.out.println("");
        int sum_pol = 0;
            int pol = 0;
        for (int i1 = 0; i1 < array1.length; i1++) {
            

            if (array1[i1] > 0) {
                sum_pol = sum_pol + array1[i1];
                pol++;
            }
           
            
        }
        int sr_pol = sum_pol / pol;
            System.out.println("среднее положительных: " + sr_pol);

    }
}
