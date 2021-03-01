/*
 UNIVERSIDAD AUTÓNOMA DE CAMPECHE
 Facultad de Ingeniería
 Ingeniería en Sistemas Computacionales
 */
package numletras66659;
import java.util.Scanner;

/**
 *
 * @author Johnny Reveles
 */
public class NumLetras66659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PROGRAMA QUE CONVIERTE NÚMEROS A LETRAS DEL 0 AL 99
        
        int num = 0;
        int decenas = 0;
        int unidades = 0;
        
        Scanner miConsola = new Scanner(System.in);
        
        System.out.println("Escriba un número del 1 al 99");
        num = miConsola.nextInt();
        
        decenas = num/10;
        unidades = num%10;
        
        String[] unidades_Letras = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
        String[] decenas_Letras = {"Dieci", "Veinti", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
        
        
        String[] primera_Decena = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciseis"};
        String[] segunda_Decenas = {"Veinte", "Veintiuno", "Veintidos", "Veintitres", "Veinticuatro", "Veinticinco", "Veintiseis"};
        
              if (decenas == 0) {
                System.out.println(unidades_Letras[unidades]);
            } else {
                if (decenas == 1 & unidades <= 6) {
                    System.out.println(primera_Decena[unidades]);
                } else if (decenas == 2 & unidades <= 6) {
                    System.out.println(segunda_Decenas[unidades]);
                } else if (unidades == 0) {
                    System.out.println(decenas_Letras[decenas -1]);
                } else if (decenas == 1) {
                    System.out.println(decenas_Letras[decenas -1] + unidades_Letras[unidades]);
                } else if (decenas == 2) {
                    System.out.println(decenas_Letras[decenas -1] + unidades_Letras[unidades]);
                } else if (num < 0 || num > 99) {
                    System.out.println("Indeterminado");
                } else {
                    System.out.println(decenas_Letras[decenas -1] + " y " + unidades_Letras[unidades]);
                                                                  
          }       
        }                      
      }      
    }   

