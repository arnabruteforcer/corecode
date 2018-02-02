package com.arnab.core.permute;

public class Permutation {
        /**
         *
         * @param k      last index of the array you want to make combos
         * @param a      the array which will store all the combination
         * @param length used to keep the track of the original length of the array used for printing
         *              here i will generate combos of numbers ranging from 1 to 3
         *              eg for k=2 the generated items will be {11,22,33,12,21,13,31,23,32} 3 x 3 = 9 combos
         *              we will display each of of these
         */
        public void generatePermutations(int k,int a[],int length) {
            /**
             * the base case will print the array when all the values have been filled
             * up upto to the least index
             * we start by filling up from the last index
             * recursing base case for generating various combos.....
             */

            if(k<0) {

                for (int i = 0; i < length; i++) {
                    System.out.print(a[i]);
                }
                System.out.println();
            }                   // end of if

            else {
                for( int j=1; j<=3; j++) {

                    a[k] = j;
                    generatePermutations(k-1,a,length);
                }


            }       // end of else

        }   // end of function

}           // end of class
