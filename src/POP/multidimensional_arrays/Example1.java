package POP.multidimensional_arrays;

public class Example1 {
    public static void main(String[] args) {


        String[][] workers = { {"1 WORKER", "2 WORKER", "3 WORKER"},{"4 WORKER", "5 WORKER", "6 WORKER"}};


        int[][][][] myNumbers = { //1D

                { //2D
                        { //3D
                                {1, 2, 3, 4},
                                {13, 14, 15, 16}
                        },

                        { //3D
                                {1, 2, 3, 4},
                                {13, 14, 15, 16}
                        }
                },

                { //2D
                        { //3D
                                {5, 6, 7, 8},
                                {13, 14, 15, 16}
                        },

                        { //3D
                                {5, 6, 7, 8},
                                {13, 14, 15, 16}
                        }
                },

                { //2D
                        { //3D
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}
                        },

                        { //3D
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}
                        }
                },

                { //2D
                        { //3D
                        {13, 14, 15, 16},
                        {13, 14, 15, 16}
                        },

                        { //3D
                                {13, 14, 15, 16},
                                {13, 14, 15, 16}
                        }
                }
        };

        myNumbers[2][0][1][2] = 13;

        System.out.println(myNumbers [2][0][1][2]);



    }
}
