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
public class Arreglo {
    public void Arreglo(){}
    public static void sumarLista(int[] a){
        int p=0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            p=a[i]+p;
        }
        System.out.println();
        System.out.println("el total es: "+p);
        System.out.println("el el promedio es: "+p/a.length);
        System.out.println();

    }
    public static void buscarMayor(int[][] b){
        
       int may=0; 
       int cont=0;
        for (int[] fila:b) {
            for (int j = 0; j < b.length; j++) {
               System.out.print(b[cont][j]);
               if(b[cont][j]>may)
                   may=b[cont][j];
            }
            System.out.println();
            cont++;
        }   
        System.out.println("El numero mayor es:" + may);
        System.out.println();
        
    }
     public static int cuentaVocales(String palabra){
         char caracteres[] = palabra.toCharArray();
         int contVocal=0;
         for (int i = 0; i < palabra.length(); i++) {
             if(caracteres[i]=='a'||caracteres[i]=='e'||caracteres[i]=='i'||caracteres[i]=='o'||caracteres[i]=='u')
                 contVocal++;
         }
       return contVocal;  
     }
     public static int cuentaCaracter(String palabra, char a){
         char caracteres[] = palabra.toCharArray();
         int contVocal=0;
         for (int i = 0; i < palabra.length(); i++) {
             if(caracteres[i]==a )
                 contVocal++;
         }
       return contVocal;  
     }
}  
