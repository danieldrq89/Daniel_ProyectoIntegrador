import java.util.Scanner;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        
        
        
        


        
        while(true) {
            

            Scanner opt = new Scanner(System.in);

            System.out.println("1º JUGAR");
            System.out.println("2º REGLAS DEL JUEGO");
            System.out.println("3º INFORMACION");
            System.out.println("4º APARTADO ABIERTO");
            System.out.println("0º EXIT");
            System.out.print("Choose a option :");
    
            int option = opt.nextInt();
            
            
            if(option == 1){
                System.out.println("Comienza el juego");    
            }else if (option == 2) {
                System.out.println("Juego de multiplataformas con vidas infinitas");
            }else if (option == 3) {
                System.out.println("-Version : 1.0");
                System.out.println("-Contacto (danieldrq89@educastur.es)");
                System.out.println("-Autor : Daniel de la Rosa Quintana");
            }else if (option == 4) {
                System.out.println("Proximamente");
            }else if (option == 0) {
                break;
            }else {
                System.out.println("Opcion incorrecta");
            }


        }

    }
 }


