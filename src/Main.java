import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static double Plata = 500;
    static ArrayList<Equipos> equiposFut = new ArrayList<Equipos>(4);
    static ArrayList<Equipos> equiposBas = new ArrayList<Equipos>(3);
    static ArrayList<Equipos> equiposVol = new ArrayList<Equipos>(3);


    public static void main(String[] args) {
        Equipos equipo1 = new Equipos(1,"Colombia","Football",3,4);
        Equipos equipo2 = new Equipos(2,"Argentina","Football",5,2);
        Equipos equipo3 = new Equipos(3,"Brazil","Football",4,4);
        Equipos equipo4 = new Equipos(4,"Mexico","Football",2,6);
        Equipos equipo5 = new Equipos(5,"Australia","Basketball",6,4);
        Equipos equipo6 = new Equipos(6,"Arabia Saudita","Basketball",5,7);
        Equipos equipo7 = new Equipos(7,"EE.UU","Basketball",2,6);
        Equipos equipo8 = new Equipos(8,"Londres","Voleyball",5,5);
        Equipos equipo9 = new Equipos(9,"Egypto","Voleyball",8,2);
        Equipos equipo10 = new Equipos(10,"Ukrania","Voleyball",4,7);
        equiposFut.add(equipo1);
        equiposFut.add(equipo2);
        equiposFut.add(equipo3);
        equiposFut.add(equipo4);
        equiposBas.add(equipo5);
        equiposBas.add(equipo6);
        equiposBas.add(equipo7);
        equiposVol.add(equipo8);
        equiposVol.add(equipo9);
        equiposVol.add(equipo10);
        System.out.println("Bienvenido a nuestra aplicacion de apuestas");
        menuInicio();
    }
    public static void menuInicio(){
        int opcion = 0;
        System.out.println("Tu balance es de: $"+Plata);
        while(opcion != 1 && opcion !=2 && opcion != 3) {
            System.out.println("¿Que desea hacer? \n1. Apostar\n2. Ver estadisticas \n3. Salir " +
                    "\n(Escriba el numero de la opcion que quiere realizar)");
            Scanner scanner = new Scanner(System.in);
            try{
                opcion = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("NO SE PUEDEN INGRESAR LETRAS");
            }
            if (opcion == 1) {
                apuesta();
            } else if (opcion == 2) {
                estadisticas();
            } else if (opcion == 3) {
                System.out.println("Muchas gracias por ingresar \nQue tengas un lindo dia!");
            } else {
                System.out.println("No se selecciono una opcion valida");
            }
        }
    }

    public static void apuesta(){
        System.out.println("Apuestas");
        int opcion = 0;
        while(opcion != 1 && opcion !=2 && opcion != 3 && opcion != 4 ){
            System.out.println("¿A que deporte deseas apostar? \n1. Futbol \n2. Basketball \n3. Voleyball " +
                    "\n4. Regresar al menu anterior \n(Cualquier opcion distinta a las anteriores sera invalida)");
            Scanner scanner = new Scanner(System.in);
            try{
                opcion = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("NO SE PUEDEN INGRESAR LETRAS");
            }
            if(opcion == 1){
                Apuesta.ApuestaFot();
            }
            else  if(opcion==2){
                Apuesta.ApuestaBask();
            }
            else  if(opcion==3){
                Apuesta.ApuestaBolei();
            }
            else  if(opcion==4){
                menuInicio();
            }
            else{
                System.out.println("No seleccionaste una opcion valida");
            }
        }
    }
    public static void estadisticas(){
        int opcion =0;
        Scanner scanner = new Scanner(System.in);
        while(opcion != 1 && opcion!=2 && opcion != 3 && opcion!= 4){
            System.out.println("Seleccione el deporte del cual quiere ver estadisticas" +
                    "\n1. Futbol \n2. Basketball \n3. Voleyball \n4. Volver al menu principal. ");
            opcion = scanner.nextInt();
            if (opcion == 1){
                System.out.println("Mostrando estadisticas de Futbol");
                for (Equipos equipo : equiposFut){
                    System.out.println("Equipo: "+equipo.getNombre());
                    System.out.println("Cantidad de Victorias: "+equipo.getVictorias());
                    System.out.println("Cantidad de derrotas: "+equipo.getDerrotas());
                    System.out.println("----------------------------------------------------------");
                }
            }
            else if(opcion == 2){
                System.out.println("Mostrando estadisticas de Basketball");
                for (Equipos equipo : equiposBas){
                    System.out.println("Equipo: "+equipo.getNombre());
                    System.out.println("Cantidad de Victorias: "+equipo.getVictorias());
                    System.out.println("Cantidad de derrotas: "+equipo.getDerrotas());
                    System.out.println("----------------------------------------------------------");
                }
            }
            else if (opcion == 3) {
                System.out.println("Mostrando estadisticas de Voleyball");
                for (Equipos equipo : equiposVol){
                    System.out.println("Equipo: "+equipo.getNombre());
                    System.out.println("Cantidad de Victorias: "+equipo.getVictorias());
                    System.out.println("Cantidad de derrotas: "+equipo.getDerrotas());
                    System.out.println("----------------------------------------------------------");
                }
            }
            else if (opcion == 4){
                menuInicio();
            }
            else {
                System.out.println("Seleccione una opcion correcta");
            }
        }
        menuInicio();
    }
}

//1.Crear Plata ------------X
//2.Crear deportes------------X
//3.Crear Equipos-----------X
//4.Crear sistema de partidos-----------------X
//5.Seleccionar equipo para apostar-----------------X
//6.Definir apuesta-----------------------X
//7.Definidir ganador------------------X
//8.Cantidad de plata ganada o perdida---------------X
//9.Volver al inicio con la plata actualizada-----------X
//10. Mostrar estadisticas de cada equipo-----------------X
