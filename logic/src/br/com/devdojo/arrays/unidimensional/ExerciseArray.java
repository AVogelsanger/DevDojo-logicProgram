package br.com.devdojo.arrays.unidimensional;

public class ExerciseArray {
    public static void main(String[] args) {

        int[] v1 = {1,2,3,4,5,6,7,8,0};
        int[] v2 = {2,3,4,5,6,7,8,9,0};
        int[] vr = new int[9];

        String resultArray = " ";
        for (int i = 0; i < 9; i++) {
            vr[i] = v1[i] * v2[i];
            resultArray += vr[i] + " ";
        }

        System.out.println(resultArray);

    }
}
