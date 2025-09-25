
import java.util.Scanner;

public class Hola {

    public static void main(String[] args) {
        
        String cadena;
        String nombre;
        Scanner sc = new Scanner(System.in);
        boolean vacio = true;

        do {

            System.out.println("Dime tu nombre:");
            nombre = sc.nextLine();

            if(nombre.isEmpty()){

               System.out.println("No puede estar vacio");

            }
        }
        while (nombre.isEmpty()); 
        

        System.out.println("Salu2 " + nombre);

        


    }
}