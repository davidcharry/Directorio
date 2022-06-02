/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorio;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mono-
 */
public class Directorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, String> directorio = new HashMap();
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());
        String[] input2;
        for (int i = 0; i < input; i++) {
            input2 = sc.nextLine().split("&");
            switch (input2[0]) {
                case "+":
                    directorio.put(input2[1], arreglar(input2));
                    break;
                case "c":
                    if (!directorio.containsKey(input2[1])) {
                        System.out.println("Contacto " + input2[1] + " no encontrado");
                    } else {
                        System.out.println("Contacto " + input2[1] + ":" + directorio.get(input2[1]));
                    }

                    break;
                case "e":
                    if (!directorio.containsKey(input2[1])) {
                        directorio.put(input2[1], arreglar(input2));
                    } else {
                        directorio.remove(input2[1]);
                        directorio.put(input2[1], arreglar(input2));
                    }
                    break;
            }
        }
    }

    public static String arreglar(String[] array) {
        String aux = "";
        for (int i = 2; i < array.length; i++) {
            aux += "\n" + array[i];
        }
        return aux;
    }
}
