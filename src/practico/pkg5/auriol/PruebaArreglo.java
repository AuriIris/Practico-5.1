/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg5.auriol;

/**
 *
 * @author PC-Romina
 */
public class PruebaArreglo {
    
    public static void main(String[] args) {
        System.out.println("Usamos sumarLista");
        int [] num1=new int[5];
        for (int i = 0; i < 5; i++) {{
                num1[i]=(int)(Math.random()*9);
            }
        }
        Arreglo.sumarLista(num1);
         System.out.println("Usamos buscarMayor");
        int [][] num=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j]=(int)(Math.random()*9);
            }
        }
        Arreglo.buscarMayor(num);
        String palabra="Promocionemos la materia";
        Arreglo.cuentaVocales(palabra);
        System.out.println("la cantidad de vocales de:"+palabra+" "+ Arreglo.cuentaVocales(palabra));
        System.out.println();
        Arreglo.cuentaCaracter(palabra, 'a');
        System.out.println("la cantidad de veces que se presenta a en "+palabra+" es:" + Arreglo.cuentaCaracter(palabra, 'a'));
    }
}
