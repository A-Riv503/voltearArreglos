import javax.swing.*;
import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args){
        String cadena=JOptionPane.showInputDialog("ingrese el numero a evaluar");
        int arregloGuardar[]=convertirNumaArray(cadena);
        if(evaluarCapicua(arregloGuardar)){
            System.out.println("el numero ingresaado es capicua: "+cadena);
        }else{
            System.out.println("el numero ingresado no es capicua: "+cadena);
        }




    }

    public static int[] convertirNumaArray(String convertir){
        int arreglo[]=new int[convertir.length()];
        for(int i=0;i<convertir.length(); i++){
            arreglo[i]=Character.getNumericValue(convertir.charAt(i));


        }
        return arreglo;

    }


    public static boolean evaluarCapicua(int[] num){
        boolean evaluar=false;
        int array[]=new int[num.length];

            /*for(int i=0 , j=1;j<=num.length; i++,j++){
                array[i]=num[num.length-j];

            }*/
        for(int i=num.length-1; i>=0; i--){
            array[i]=num[i];

        }



        if(Arrays.equals(num,array)){
            evaluar=true;
        }
        return evaluar;


    }
}
