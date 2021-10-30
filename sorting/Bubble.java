package sorting;

public class Bubble {

    /*
     * input: 3,6,2,8,3,7
     * output: 2,3,3,,6,7,8
     * goal ascending order
     *
     * */
    public static void main(String... args) {
        /*
         * int - data type
         * Integer [I] = -negative ......0.....positive
         * eg: -infinity......-1000,-999......-3,-2,-1,0,1,2,3..........+infinity
         *
         *int[] - int array , [] subscripts
         *
         * int[]array = {1,2,3}
         * new -provides space
         *
         * int[size/length/quatity]
         * int[] array = new int[10];
         * */

        int[] array = {3, 6, 2, 8, 3, 7};

        //Bubble sort

            System.out.println("Before Sorting:-");
        for (int i = 0; i < 6; i++) {

            System.out.println(array[i]);

        }

        for (int j = 0; j <= 5; j++) {
            for (int i = 0; i < 5 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int extra;
                    extra = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = extra;

                }
            }//end

        }

            System.out.println("After sorting:-");
        for (int i = 0; i < 6; i++) {


            System.out.println(array[i]);


        }
    }
}


/*
        int i;
        if(array[i]>array[i+1])
        {
            int xtra;
            xtra= array[i+1];
            array[i+1] =array[i];
            array[i] =xtra;
        }
*/


