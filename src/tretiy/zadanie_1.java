/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tretiy;

/**
 *
 * @author Student 3
 */
import java.util.Scanner;

public class zadanie_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Зашифровать введенную с клавиатуры строку, поменяв местами первый\n"
                + "символ с третьим, второй с четвертым и т. д. Провести дешифровку.");
        System.out.println("");
        String str1 = sc.nextLine();
        //System.out.println(str1);
        char[] chArray = str1.toCharArray();
        String str="";
        for (int i = 0; i < chArray.length-2; i++) {
            char tmp=chArray[i];
            chArray[i]=chArray[i+2];
            chArray[i+2]=tmp;
            
            System.out.print(chArray[i]);
        }
    }
}
