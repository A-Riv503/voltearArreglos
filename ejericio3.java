import javax.swing.*;

public class ejericio3 {
    public static void main(String[] args){
          int num=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
          if(invertir(num)!=num){
             System.out.println("el numero no es capicua: "+invertir(num));
          }else{
              System.out.println("el numero es capicua: "+invertir(num));
          }



    }

    public static int invertir(int numero){
        int res=0;
        while(numero>0){
            int digito=numero%10;
            res=(res*10)+digito;
            numero=numero/10;

        }
        return res;
    }
}
