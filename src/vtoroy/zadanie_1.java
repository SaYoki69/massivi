/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtoroy;

/**
 *
 * @author Student 3
 */
public class zadanie_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Заменить положительные элементы двумерного массива на 1, а\n" +
"отрицательные на 0.");
        int[][] array = new int[3][3];
    for (int i = 0; i < array.length; i++){
        for (int j = 0; j < array.length; j++){
            array[i][j] = (int) (Math.random() * 20 - 10);
            System.out.print(array[i][j] + "\t");
        }
        System.out.println("");
    }
    for (int i = 0; i < array.length; i++){
        for (int j = 0; j < array.length; j++){
            if (array[i][j] < 0){
                array[i][j] = 0;
            
        }else if (array[i][j] > 0) { 
                array[i][j] = 1;        
            
              
        }
    }
}
        
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
        
            }   
        System.out.println("");
        }
        
        }
    }

