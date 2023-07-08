public class Main {
    public static void main(String[] args) {
       /*dado un array de 5 numeros, que los siguientes valores es 1,2,3,4,5, guardar los valores, de este array a otro array pero con valores invertidos*/

       /*rellnar un array de numeros que debe de ser entero, usando metodo fill*/

        /*crea una aplicacion que pida numeros por teclado y despues comprobar si el numero introducido es capicua, es decir que se lee igual sin importar
        * la direccion, (ejemplo: si introsuco 30,303, es capicua). Piensa como darle la vuelta al numero. una forma de pasar un numero a un array
        * Character.getNumericValue(cadena.charAt(posicion))*/

        int serieDeNums[]={1,2,3,4,5};
        int serieInvertida[]=new int[5];

        /*for(int i=serieDeNums.length;i >=serieDeNums.length ; i--){

            for(int j=serieDeNums.length ;j>=serieDeNums.length; j--){
                serieInvertida[j]=i;
                System.out.println(serieInvertida[j]);
                //System.out.println(j);



            }
             System.out.println("hola: "+i);

        }*/

        for(int i=serieDeNums.length-1; i>=0; i--){
            serieInvertida[i]=serieDeNums[i];
            System.out.println(serieInvertida[i]);
        }





    }

}