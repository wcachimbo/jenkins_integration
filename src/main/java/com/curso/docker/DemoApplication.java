package com.curso.docker;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        int[] myarray = {1, 2, 9, 2, 5, 3, 5, 1, 5};
        int sumaMenor = 1000;
        String resp = "";

        for (int i = 0; i < 3; i++) {
            int val1 = myarray[i * 3 + 0];

            for (int j = 0; j < 3; j++) {
                if (j == i || j == i + 1 || j == i - 1) {
                    int val2 = myarray[j * 3 + 1];

                    for (int k = 0; k < 3; k++) {
                        if (k == j || k == j + 1 || k == j - 1) {
                            int val3 = myarray[k * 3 + 2];


                            int sumActual = val1 + val2 + val3;
                            if (sumActual < sumaMenor) {
                                sumaMenor = sumActual;
                                resp = val1 + " " + val2 + " " + val3;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(resp);


    }

    /** EJERCICIO 3

     int[] myArray = {1, 3, 2, 5, 6, 7, 5};

     for (int i = 0; i < myArray.length; i++) {
     for (int j = i + 1; j < myArray.length; j++) {
     if (myArray[i] + myArray[j] == 10) {
     System.out.println("" + myArray[i] + " " + myArray[j]);
     return;
     }

     }


     }
     System.out.println("No hay ningún par que sume " + 10);


     }*/

        /* EJERCICIO 2
        int[] myArray = {1, 2, 9,
                2, 5, 3,
                5, 1, 5};

        int menorSuma = 999999;
        String mejorCamino = "";

        for (int i = 0; i < 3; i++) {
            int val1 = myArray[i * 3 + 0];
            for (int j = 0; j < 3; j++) {

                if (j == i || j == i + 1 || j == i - 1) {
                    int val2 = myArray[j * 3 + 1];
                    for (int k = 0; k < 3; k++) {
                        if (k == j || k == j + 1 || k == j - 1) {
                            int val3 = myArray[k * 3 + 2]; // Valor en columna 2
                            System.out.println("secuencia:: " + val1 + val2 + val3);
                            int sumaActual = val1 + val2 + val3;

                            if (sumaActual < menorSuma) {
                                menorSuma = sumaActual;
                                mejorCamino = val1 + " " + val2 + " " + val3;
                            }
                        }
                    }
                }
            }
        }

        // 7. Imprimimos el resultado final ordenado por espacios
        System.out.println(mejorCamino);
    }



/* EJERCICIO 1
        int[] myArray = {1, 2, 3, 4, 5, 5, 2, 2, 2, 2};
        int save = 0;
        int conteoNum = 1;
        //int saveNum = 0;
        int saveNum = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            //conteoNum = 0;

            //for (int j = 0; j < myArray.length; j++) {

                if (myArray[i] == myArray[i - 1]) {
                conteoNum++;

            } else {
                conteoNum = 1;
            }

            if (conteoNum > save) {
                save = conteoNum;
                saveNum = myArray[i];
            }

        }

        System.out.println("conteo::: " + conteoNum + " numero :: " + saveNum);

 */
}



