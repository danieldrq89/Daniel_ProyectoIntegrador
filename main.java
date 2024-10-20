import java.util.Scanner;
import java.awt.*;

public class main {

    /**
     * 
     */
    public static void jugar(){

        int jugador = 200;
        int maquina = 200;
        int turno = 2;
        

        Scanner s = new Scanner(System.in);

        

        int opt_player = 0;
        int opt_maquina = 0;

        while(jugador >= 0 || maquina >= 0){
            
        if(turno % 2 == 0){
            System.out.println("1 ATACAR 2 DEFENDER");
            while(true){
            opt_player = s.nextInt();
            
            if(opt_player == 1 && opt_maquina != 2){

                maquina = maquina - 50;
                System.out.println("[Jugador]: Daño reflejado [Maquina]Hp:" + maquina);
                break;
            }else {
                System.out.println("Daño reflejado");
                break;
            }
        }
        }else{
            while(true){
            opt_maquina = (Math.random() <= 0.5) ? 1 : 2;
            
            if(opt_maquina == 1 && opt_player != 2){
                jugador = jugador - 50;
                System.out.println("[Maquina]: Daño reflejado [Jugador]Hp:" + jugador);
                break;
            }else{
                System.out.println("Daño reflejado");
                break;
            }
        }

        }

    }

    if(jugador <= 0){
        System.out.println("[Jugador a perdido]");
    }else if(){
        System.out.println("[Maquina a perdido]");
    }
    }



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
                jugar();
                break;

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


