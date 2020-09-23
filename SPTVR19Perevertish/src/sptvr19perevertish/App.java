/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19perevertish;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("== Перевертыш ==");
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chStr = str.toCharArray();
        char[] rChStr = new char[str.length()];
        for (int i = 0; i < rChStr.length; i++) {
            rChStr[i] = chStr[(chStr.length -1) - i];
        }
        String rStr = new String(rChStr);
        System.out.println("Перевертыш: "+rStr);
        StringBuilder sbStr = new StringBuilder(str);
        System.out.println("Перевертыш 2:" +sbStr.reverse().toString());
        
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" ", firstSpace+1);
        if(firstSpace < 0) {
            System.out.println("Второго слова нет");
        }else if(secondSpace < 0){
            System.out.println("Второе слово: " + str.substring(firstSpace));
        }else{
            System.out.println("Второе слово: " + str.substring(firstSpace+1,secondSpace));
        }
        //второй способ решения
        System.out.println("Второй способ решения:");
        String[] arrWords = str.split(" ");
        if(arrWords.length > 1 && arrWords[1] != null){
            System.out.println("Второе слово: " + arrWords[1]);
        }else{
            System.out.println("Нет второго слова");
        }
    }
}
