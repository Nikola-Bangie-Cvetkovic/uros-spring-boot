package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        int[] n = {2, 1, 3, 4, 5, 6, 6, -100, 8, 10, 347, 2, 2, 6, 1};

        int[][] matrix2D = {
                {8, 1, 1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3, 3, 9}
        };

        //zamena prvog lementa prvog niza i poslednjeg elemenata poslenjeg niza
        int t = matrix2D[0][0];
        matrix2D[0][0] = matrix2D[matrix2D.length-1][matrix2D[matrix2D.length-1].length-1];
        matrix2D[matrix2D.length-1][matrix2D[matrix2D.length-1].length-1] = t;
        //ZAMENA PRVOG I POSLEDNJEG NIZA U 2D NIZU
//        int[] prvi = matrix2D[0];
//        int[] poslednji = matrix2D[matrix2D.length-1];
//
//        matrix2D[0] = poslednji;
//        matrix2D[matrix2D.length-1] = prvi;

//        for (int i = 0; i < matrix2D.length; i++) {
//            for (int j = 0; j < matrix2D[i].length; j++) {
//
//            }
//        }

//PROLAZ KROZ MATRICU
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                System.out.print(matrix2D[i][j]);
            }
        }
//        //MIN
//        int min = n[0];
//        for (int i = 1; i < n.length; i++){
//            if (n[i] < min){
//                min = n[i];
//            }
//        }
//        System.out.println("REZ MIN: " + min);
//        //MAX
//        int max = n[0];
//        for (int i = 1; i < n.length; i++){
//            if (n[i] > max){
//                max = n[i];
//            }
//        }
//        System.out.println("REZ MAX: " + max);
//        //SORTED ASC
//        System.out.println("ASC");
//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n.length; j++){
//                if (n[i] < n[j]){
//                    int t = n[i];
//                    n[i] = n[j];
//                    n[j] = t;
//                }
//            }
//        }
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(i + " : " + n[i]);
//        }
//        //SORTED DESC
//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n.length; j++){
//                if (n[i] > n[j]){
//                    int t = n[i];
//                    n[i] = n[j];
//                    n[j] = t;
//                }
//            }
//        }
//        System.out.println("DESC");
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(i + " : " + n[i]);
//        }
//        //DOUBLES CLEAR
//        HashMap<Integer, Integer> n1 = new HashMap<>();
//        n1.put(n[0], 1);
//        for (int i = 1; i < n.length; i++) {
//            if (!n1.containsKey(n[i])) {
//                n1.put(n[i], 1);
//            } else {
//                n1.put(n[i], n1.get(n[i]) + 1);
//            }
//        }
//        System.out.println("CLEAR");
//        n1.forEach((key, value) -> {
//            System.out.println(key + " : " + value);
//        });
        //
    }
}
