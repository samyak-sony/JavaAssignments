package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    /*
	    Question 1
	     */


//	    System.out.println("Enter your credits");
//	    int credits = sc.nextInt();
//
//	    if(credits >= 7500){
//            System.out.println("Tera leader");
//        }else if(credits >= 6000 && credits < 7500){
//            System.out.println("Gega leader");
//        }else if(credits >= 4500 && credits < 6000){
//            System.out.println("Mega leader");
//        }else{
//            System.out.println("Rising star");
//        }


        //====PSEUDOCODE=====
        /*
        Take input credits
        if credits >= 7500:
            print"Tera leader"
        end if

        else if credits >= 6000 and credits < 7500:
            print"Gega leader"
        end else if

        else if credits >= 4500 and credits < 6000:
            print"Mega leader"
        end else if

        else:
            print"Rising star"
        end else

         */





       // Question 2


//        System.out.println("Enter amount");
//        int amount = sc.nextInt();
//        System.out.println("Enter rate");
//        int rate = sc.nextInt();
//        System.out.println("Enter time");
//        int time = sc.nextInt();
//
//        double si;
//        si = (amount*rate*time)/100.0;
//        System.out.println("Simple interest = "+si);



        //====PSEUDOCODE====


        /*

        Take input amount
        Take input rate
        Take input time
        declare si
        si:= (amount*rate*time)/100.0
        print si

         */



        //Question 3
//
//        System.out.println("Enter first number");
//        int n1 = sc.nextInt();
//        System.out.println("Enter second number");
//        int n2 = sc.nextInt();
//
//        while(n1 != n2){
//
//            if(n2 > n1){
//                n2 = n2 - n1;
//            }else{
//                n1 = n1 - n2;
//            }
//        }
//
//        System.out.println("GCD is "+ n1);



    //=====PSEUDOCODE=====

    /*

    Take input first number
    Take input second number
    while n1 != n2:
        if n2 > n2:
            n2 := n2 - n1
        end if
        else:
            n1 := n1 - n2
        end else
    end while
    print gcd of the two numbers.


     */



    //QUESTION 4
//        System.out.println("Enter the number of terms ");
//        int terms = sc.nextInt();
//        int a = 2, i = 0;
//        while(i<terms) {
//            a = a + 4*i;
//            System.out.print(a+" ");
//            i++;
//        }


    //=====PSEUDOCODE=======

        /*
        Take input the number of terms
        int i := 0
        int a := 2
        while i < terms:
             a := a + i
             print value of a
             i++
        end while

         */

    // Question 5


//
//    int number = sc.nextInt();
//    int n = number;
//    int count = 0;
//    int last;
//
//    while(n != 0){
//        last = n % 10;
//        n = n / 10;
//        count++;
//    }
//        System.out.println(count);


     //Question 6

//     int number = sc.nextInt();
//     int n = number;
//     int rev = 0,last;
//
//     while(n != 0){
//         last = n % 10;
//         rev = 10 * rev + last;
//         n = n / 10;
//
//     }
//        System.out.println(rev);




        //Question 7.a

        /*


         *
         *   *
         *   *   *
         *   *   *   *
         *   *   *   *   *


         */


//        int n = 5;
//
//        int row = 0;
//        while(row < n){
//            int cols = 0;
//            while(cols  < row + 1 ){
//                System.out.print("*   ");
//                cols++;
//            }
//            System.out.println();
//            row++;
//        }


        //Question 7.b

        /*

        1
        1    2
        1    2    3
        1    2    3    4
        1    2    3    4    5

        */



//        int n = 5;
//        int row = 0;
//
//        while(row < n){
//            int cols = 0;
//            while(cols < row + 1){
//
//                System.out.print(1+cols+"    ");
//                cols++;
//
//            }
//            System.out.println();
//            row++;
//        }


        //Question 7.c

        /*
                       1
                    1  2  1
                 1  2  3  2  1
              1  2  3  4  3  2  1
           1  2  3  4  5  4  3  2  1

        */


//        int n =5;
//        int row =0;
//        while(row < 5){
//            int cols = 0;
//            int colMirror = 0;
//            while(colMirror < 2 * n -1){
//                if(cols + row  < n - 1){
//                    System.out.print("   ");
//                }else{
//                    System.out.print(cols+row-3+"  ");
//                }
//                if(colMirror < n -1){
//                    cols++;
//                }else{
//                    cols--;
//                }
//                colMirror++;
//            }
//            System.out.println();
//            row++;
//
//        }



        //Question 7.d

            /*
                    1
                 2  3  2
              3  4  5  4  3
           4  5  6  7  6  5  4
        5  6  7  8  9  8  7  6  5

            */


//        int n =5;
//        int row =0;
//        while(row < 5){
//            int cols = 0;
//            int colMirror = 0;
//            while(colMirror < 2 * n -1){
//                if(cols + row  < n - 1){
//                    System.out.print("   ");
//                }else{
//                    System.out.print(cols+2*row-3+"  ");
//                }
//                if(colMirror < n -1){
//                    cols++;
//                }else{
//                    cols--;
//                }
//                colMirror++;
//            }
//            System.out.println();
//            row++;
//        }




        //Question 7.e WASN"T ABLE TO PRINT THE NUMBER PATTERN

        //QUESTION 7.f

        /*
                      *
                   *  *  *
                *  *  *  *  *
            *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
            *  *  *  *  *  *  *
               *  *  *  *  *
                  *  *  *
                     *


         */


//        int n =5;
//        int row =0;
//        int rowMirror = 0;
//        while(rowMirror < 2*n-1){
//            int cols = 0;
//            int colMirror = 0;
//            while(colMirror < 2 * n -1){
//                if(cols + row  < n - 1){
//                    System.out.print("   ");
//                }else{
//                    System.out.print("*  ");
//                }
//                if(colMirror < n -1){
//                    cols++;
//                }else{
//                    cols--;
//                }
//                colMirror++;
//            }
//            System.out.println();
//            if(rowMirror < n-1){
//                row++;
//            }else{
//                row--;
//            }
//            rowMirror++;
//
//        }


        //Question 7.g



        /*

         *                       *
         *  *                 *  *
         *  *  *           *  *  *
         *  *  *  *     *  *  *  *
         *  *  *           *  *  *
         *  *                 *  *
         *                       *


         */


//            int n = 5;
//            int rowMirror = 0;
//            int row = 0;
//            while(rowMirror < 2*n-1){
//                int cols = 0;
//                int colsMirror = 0;
//                while(colsMirror < 2 * n - 1 ){
//                    if(cols < row){
//                        System.out.print(" * ");
//                    }else{
//                        System.out.print("   ");
//                    }
//                    if(colsMirror < n -1){
//                        cols++;
//                    }else{
//                        cols--;
//                    }
//                    colsMirror++;
//                }
//                System.out.println();
//                if(rowMirror < n - 1){
//                    row++;
//                }else{
//                    row--;
//                }
//                rowMirror++;
//            }
//


        //Question 7.h

        /*


         * * * * * * * * *
         * * * *   * * * *
         * * *       * * *
         * *           * *
         *               *
         * *           * *
         * * *       * * *
         * * * *   * * * *
         * * * * * * * * *


         */



//        int n =5;
//        int rowMirror = 0;
//        int row = 0;
//        while(rowMirror < 2 * n -1){
//            int colMirror = 0;
//            int cols = 0;
//            while(colMirror < 2 * n - 1){
//                if((row+cols) < n ){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//                if(colMirror < n -1 ){
//                    cols++;
//                }else{
//                    cols--;
//                }
//                colMirror++;
//            }
//            System.out.println();
//            if(rowMirror  < n - 1){
//                row++;
//            }else{
//                row--;
//            }
//            rowMirror++;
//        }



        //Question 7.i // NOT ABLE TO PRINT THE NUMBER VALUES

//        int n = 5;
//        int row  = 0;
//        int rowMirror = 0;
//        while(rowMirror < 2 * n -1){
//            int cols = 0;
//            int colMirror = 0;
//            while(colMirror < 2 * n -1){
//                if(row   < n - 4 ){
//                    System.out.print(n-row+" ");
//                }else{
//                    System.out.print(n-cols+" ");
//                }
//                if(colMirror < n - 1){
//                    cols++;
//                }else{
//                    cols--;
//                }
//                colMirror++;
//            }
//            System.out.println();
//            if(rowMirror  < n -1){
//                row++;
//            }else{
//                row--;
//            }
//            rowMirror++;
//        }







    }

}



