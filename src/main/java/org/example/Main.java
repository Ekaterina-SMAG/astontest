package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Первое задание
        printThreeWords();

        //Второе задание
        checkSumSign();

        //Третье задание
        printColor();

        //Четвертое задание
        compareNumbers();

        //Пятое задание
        System.out.println(value(5,8));

        //Шестое задание
        System.out.println(number(-5));

        //Седьмое задание
        System.out.println(printValue(-4589));

        //Восьмое задание
        repeatString (4);

        //Девятое задание
        System.out.println(yearLeap());

        //Десятое задание
        replaceValues();

        //Одиннадцатое задание
        fillArray();

        //Двенадцатое задание
        changeNumberArray();

        //Тринадцатое задание
        fillDiagonal();

        //Четырнадцатое задание
        meshLength(4,5);


    }

//Первое задание
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }



//Второе задание
    public static void checkSumSign() {
        int a,b,sum ;
        a = 5;
        b = 6;
        sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }


//Третье задание
    public static void printColor() {
        int value ;
        value = 156;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }

    }


//Четвертое задание
    public static void compareNumbers() {
        int a,b ;
        a = 5648;
        b = 9387;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

//Пятое задание
     public static boolean value(int a, int b) {

        int s = a + b;
        if ( (10 <= s) && (s <= 20)) {
            return true;
        }

         return false;
     }


//Шестое задание
     public static int number(int a) {

        if (a >= 0 ) {
            System.out.println(a + " положительное чмсло");
        } else {
            System.out.println(a + " отрицательное чмсло");
        }

         return a;
     }



//Седьмое задание
     public static boolean printValue(int a) {
         return a < 0;
     }



//Восьмое задание
    public static void repeatString (int a) {

        for (int i = 0; i < a; i++) {
            System.out.println("Hello");
        }
    }


//Девятое задание
    public static boolean yearLeap() {
        int a = 2025 ;

        if (a % 4 == 0) {
            return true;
        } else if (a % 100 != 0) {
            return false;
        } else if (a % 400 != 0) {
            return false;
        } else {
            return true;
        }


    }


//Десятое задание
    public static void replaceValues() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array [i] == 0) {
                array[i] = 1;
            }
            System.out.print(array [i] + " ");
        }
        System.out.println();
    }


//Одиннадцатое задание
     public static void fillArray() {
          int[] array = new int[8];
           int counter = -3;
          for (int i = 0; i < array.length; i++) {
          counter = counter + 3;
          System.out.print(counter + " ");
          }
         System.out.println();
    }


//Двенадцатое задание
    public static void changeNumberArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }



//Тринадцатое задание
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }




//Четырнадцатое задание
    public static void meshLength(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }



}










