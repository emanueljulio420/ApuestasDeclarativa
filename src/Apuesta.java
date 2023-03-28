import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Apuesta {


    public static void ApuestaFot(){
        Main main= new Main();
        ArrayList<Equipos> equiposFut= Main.equiposFut;
        Random random = new Random();
        int aleatorio = random.nextInt(equiposFut.size());
        int aleatorio2 = random.nextInt(equiposFut.size());
        while (aleatorio==aleatorio2){
            aleatorio2 = random.nextInt(equiposFut.size());
        }
        int aleatorio3 = random.nextInt(equiposFut.size());
        int aleatorio4 = random.nextInt(equiposFut.size());
        while (aleatorio3 == aleatorio4){
            aleatorio4 = random.nextInt(equiposFut.size());
        }
        String aleatorios1 = equiposFut.get(aleatorio).getNombre();
        String aleatorios2 = equiposFut.get(aleatorio2).getNombre();
        String aleatorios3 = equiposFut.get(aleatorio3).getNombre();
        String aleatorios4 = equiposFut.get(aleatorio4).getNombre();
        System.out.println("Partido 1: " + aleatorios1 + " VS " + aleatorios2);
        System.out.println("Partido 2: " + aleatorios3 + " VS " + aleatorios4);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero del partido al que vas a apostar");
        int eleccion = 0;
        while (eleccion != 1 && eleccion !=2){
            eleccion = scanner.nextInt();
            if (eleccion != 1 && eleccion !=2){
                System.out.println("Seleccione un partido correcto: ");
            }
        }
        System.out.println("Ingrese el equipo al que quieres apostarle: ");
        int eleccion2 = 0;
        if (eleccion == 1){
            while (eleccion2 != 1 && eleccion2!=2){
                System.out.println("1: " + aleatorios1 + " 2: "+ aleatorios2);
                eleccion2 =  scanner.nextInt();
                if (eleccion2 != 1 && eleccion2!=2){
                    System.out.println("Ingreso incorrecto");
                    System.out.println("Ingrese el equipo al que quieres apostarle: ");
                }
            }
        }
        else {
            while (eleccion2 != 1 && eleccion2!=2){
                System.out.println("1: " + aleatorios3 + " 2: "+ aleatorios4);
                eleccion2 =  scanner.nextInt();
                if (eleccion2 != 1 && eleccion2!=2){
                    System.out.println("Ingreso incorrecto");
                    System.out.println("Ingrese el equipo al que quieres apostarle: \n(Igual como aparece en el la muestra)");
                }
            }
        }
        double apuesta = 0;
        int correcto = 0;
        System.out.println("Ingrese la cantidad a apostar (Centavos separados por un punto)");
        while (correcto == 0){
            apuesta = scanner.nextDouble();
            if (apuesta == 0){
                System.out.println("No puedes apostar $0");
            }
            else if(apuesta<0){
                System.out.println("No puedes apostar valores inferiores a $0");
            }
            else if(apuesta>Main.Plata){
                System.out.println("No tienes suficiente dinero para esta apuesta");
                System.out.println("Tienes $"+Main.Plata);
            }
            else{
                Main.Plata -= apuesta;
                System.out.println("Apuesta realizada, espera el resultado!");
                correcto = 1;
            }
        }
        int ganador = random.nextInt(2)+1;
        if (eleccion == 1){
            if (ganador == 1){
                System.out.println("El equipo ganador es: "+aleatorios1);
                int ant = equiposFut.get(aleatorio).getVictorias();
                int der = equiposFut.get(aleatorio2).getDerrotas();
                equiposFut.get(aleatorio).setVictorias(ant + 1);
                equiposFut.get(aleatorio2).setDerrotas(der+1);
            }
            else {
                System.out.println("El equipo ganador es: "+aleatorios2);
                int ant = equiposFut.get(aleatorio2).getVictorias();
                int der = equiposFut.get(aleatorio).getDerrotas();
                equiposFut.get(aleatorio2).setVictorias(ant + 1);
                equiposFut.get(aleatorio).setDerrotas(der+1);
            }
            if (eleccion2==ganador){
                apuesta = apuesta * 2;
                Main.Plata += apuesta;
                System.out.println("Ganaste $"+ apuesta);
            }
            else{
                System.out.println("Lo siento, perdiste");
            }
        }
        else{
            if (ganador == 1){
                System.out.println("El equipo ganador es: "+aleatorios3);
                int ant = equiposFut.get(aleatorio3).getVictorias();
                int der = equiposFut.get(aleatorio4).getDerrotas();
                equiposFut.get(aleatorio3).setVictorias(ant + 1);
                equiposFut.get(aleatorio4).setDerrotas(der+1);
            }
            else {
                System.out.println("El equipo ganador es: "+aleatorios4);
                int ant = equiposFut.get(aleatorio4).getVictorias();
                int der = equiposFut.get(aleatorio3).getDerrotas();
                equiposFut.get(aleatorio4).setVictorias(ant + 1);
                equiposFut.get(aleatorio3).setDerrotas(der+1);
            }
            if (eleccion2==ganador){
                apuesta = apuesta * 2;
                Main.Plata += apuesta;
                System.out.println("Ganaste $"+ apuesta);
            }
            else{
                System.out.println("Lo siento, perdiste");
            }
        }
        System.out.println("Volviendo la menu principal ");
        Main.menuInicio();
    }
    public static void ApuestaBask(){
        Main main= new Main();
        ArrayList<Equipos> equiposBas= Main.equiposBas;
        Random random = new Random();
        int aleatorio = random.nextInt(equiposBas.size());
        int aleatorio2 = random.nextInt(equiposBas.size());
        while (aleatorio==aleatorio2){
            aleatorio2 = random.nextInt(equiposBas.size());
        }
        int aleatorio3 = random.nextInt(equiposBas.size());
        int aleatorio4 = random.nextInt(equiposBas.size());
        while (aleatorio3 == aleatorio4){
            aleatorio4 = random.nextInt(equiposBas.size());
        }
        String aleatorios1 = equiposBas.get(aleatorio).getNombre();
        String aleatorios2 = equiposBas.get(aleatorio2).getNombre();
        String aleatorios3 = equiposBas.get(aleatorio3).getNombre();
        String aleatorios4 = equiposBas.get(aleatorio4).getNombre();
        System.out.println("Partido 1: " + aleatorios1 + " VS " + aleatorios2);
        System.out.println("Partido 2: " + aleatorios3 + " VS " + aleatorios4);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero del partido al que vas a apostar");
        int eleccion = 0;
        while (eleccion != 1 && eleccion !=2){
            eleccion = scanner.nextInt();
            if (eleccion != 1 && eleccion !=2){
                System.out.println("Seleccione un partido correcto: ");
            }
        }
        System.out.println("Ingrese el equipo al que quieres apostarle: ");
        int eleccion2 = 0;
        if (eleccion == 1){
            while (eleccion2 != 1 && eleccion2!=2){
                System.out.println("1: " + aleatorios1 + " 2: "+ aleatorios2);
                eleccion2 =  scanner.nextInt();
                if (eleccion2 != 1 && eleccion2!=2){
                    System.out.println("Ingreso incorrecto");
                    System.out.println("Ingrese el equipo al que quieres apostarle: ");
                }
            }
        }
        else {
            while (eleccion2 != 1 && eleccion2!=2){
                System.out.println("1: " + aleatorios3 + " 2: "+ aleatorios4);
                eleccion2 =  scanner.nextInt();
                if (eleccion2 != 1 && eleccion2!=2){
                    System.out.println("Ingreso incorrecto");
                    System.out.println("Ingrese el equipo al que quieres apostarle: \n(Igual como aparece en el la muestra)");
                }
            }
        }
        double apuesta = 0;
        int correcto = 0;
        System.out.println("Ingrese la cantidad a apostar (Centavos separados por un punto)");
        while (correcto == 0){
            apuesta = scanner.nextDouble();
            if (apuesta == 0){
                System.out.println("No puedes apostar $0");
            }
            else if(apuesta<0){
                System.out.println("No puedes apostar valores inferiores a $0");
            }
            else if(apuesta>Main.Plata){
                System.out.println("No tienes suficiente dinero para esta apuesta");
                System.out.println("Tienes $"+Main.Plata);
            }
            else{
                Main.Plata -= apuesta;
                System.out.println("Apuesta realizada, espera el resultado!");
                correcto = 1;
            }
        }
        int ganador = random.nextInt(2)+1;
        if (eleccion == 1){
            if (ganador == 1){
                System.out.println("El equipo ganador es: "+aleatorios1);
                int ant = equiposBas.get(aleatorio).getVictorias();
                int der = equiposBas.get(aleatorio2).getDerrotas();
                equiposBas.get(aleatorio).setVictorias(ant + 1);
                equiposBas.get(aleatorio2).setDerrotas(der+1);
            }
            else {
                System.out.println("El equipo ganador es: "+aleatorios2);
                int ant = equiposBas.get(aleatorio2).getVictorias();
                int der = equiposBas.get(aleatorio).getDerrotas();
                equiposBas.get(aleatorio2).setVictorias(ant + 1);
                equiposBas.get(aleatorio).setDerrotas(der+1);
            }
            if (eleccion2==ganador){
                apuesta = apuesta * 2;
                Main.Plata += apuesta;
                System.out.println("Ganaste $"+ apuesta);
            }
            else{
                System.out.println("Lo siento, perdiste");
            }
        }
        else{
            if (ganador == 1){
                System.out.println("El equipo ganador es: "+aleatorios3);
                int ant = equiposBas.get(aleatorio3).getVictorias();
                int der = equiposBas.get(aleatorio4).getDerrotas();
                equiposBas.get(aleatorio3).setVictorias(ant + 1);
                equiposBas.get(aleatorio4).setDerrotas(der+1);
            }
            else {
                System.out.println("El equipo ganador es: "+aleatorios4);
                int ant = equiposBas.get(aleatorio4).getVictorias();
                int der = equiposBas.get(aleatorio3).getDerrotas();
                equiposBas.get(aleatorio4).setVictorias(ant + 1);
                equiposBas.get(aleatorio3).setDerrotas(der+1);
            }
            if (eleccion2==ganador){
                apuesta = apuesta * 2;
                Main.Plata += apuesta;
                System.out.println("Ganaste $"+ apuesta);
            }
            else{
                System.out.println("Lo siento, perdiste");
            }
        }
        System.out.println("Volviendo la menu principal ");
        Main.menuInicio();
    }
    public static void ApuestaBolei(){
        Main main= new Main();
        ArrayList<Equipos> equiposVol= Main.equiposVol;
        Random random = new Random();
        int aleatorio = random.nextInt(equiposVol.size());
        int aleatorio2 = random.nextInt(equiposVol.size());
        while (aleatorio==aleatorio2){
            aleatorio2 = random.nextInt(equiposVol.size());
        }
        int aleatorio3 = random.nextInt(equiposVol.size());
        int aleatorio4 = random.nextInt(equiposVol.size());
        while (aleatorio3 == aleatorio4){
            aleatorio4 = random.nextInt(equiposVol.size());
        }
        String aleatorios1 = equiposVol.get(aleatorio).getNombre();
        String aleatorios2 = equiposVol.get(aleatorio2).getNombre();
        String aleatorios3 = equiposVol.get(aleatorio3).getNombre();
        String aleatorios4 = equiposVol.get(aleatorio4).getNombre();
        System.out.println("Partido 1: " + aleatorios1 + " VS " + aleatorios2);
        System.out.println("Partido 2: " + aleatorios3 + " VS " + aleatorios4);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero del partido al que vas a apostar");
        int eleccion = 0;
        while (eleccion != 1 && eleccion !=2){
            eleccion = scanner.nextInt();
            if (eleccion != 1 && eleccion !=2){
                System.out.println("Seleccione un partido correcto: ");
            }
        }
        System.out.println("Ingrese el equipo al que quieres apostarle: ");
        int eleccion2 = 0;
        if (eleccion == 1){
            while (eleccion2 != 1 && eleccion2!=2){
                System.out.println("1: " + aleatorios1 + " 2: "+ aleatorios2);
                eleccion2 =  scanner.nextInt();
                if (eleccion2 != 1 && eleccion2!=2){
                    System.out.println("Ingreso incorrecto");
                    System.out.println("Ingrese el equipo al que quieres apostarle: ");
                }
            }
        }
        else {
            while (eleccion2 != 1 && eleccion2!=2){
                System.out.println("1: " + aleatorios3 + " 2: "+ aleatorios4);
                eleccion2 =  scanner.nextInt();
                if (eleccion2 != 1 && eleccion2!=2){
                    System.out.println("Ingreso incorrecto");
                    System.out.println("Ingrese el equipo al que quieres apostarle: ");
                }
            }
        }
        double apuesta = 0;
        int correcto = 0;
        System.out.println("Ingrese la cantidad a apostar (Centavos separados por un punto)");
        while (correcto == 0){
            apuesta = scanner.nextDouble();
            if (apuesta == 0){
                System.out.println("No puedes apostar $0");
            }
            else if(apuesta<0){
                System.out.println("No puedes apostar valores inferiores a $0");
            }
            else if(apuesta>Main.Plata){
                System.out.println("No tienes suficiente dinero para esta apuesta");
                System.out.println("Tienes $"+Main.Plata);
            }
            else{
                Main.Plata -= apuesta;
                System.out.println("Apuesta realizada, espera el resultado!");
                correcto = 1;
            }
        }
        int ganador = random.nextInt(2)+1;
        if (eleccion == 1){
            if (ganador == 1){
                System.out.println("El equipo ganador es: "+aleatorios1);
                int ant = equiposVol.get(aleatorio).getVictorias();
                int der = equiposVol.get(aleatorio2).getDerrotas();
                equiposVol.get(aleatorio).setVictorias(ant + 1);
                equiposVol.get(aleatorio2).setDerrotas(der+1);
            }
            else {
                System.out.println("El equipo ganador es: "+aleatorios2);
                int ant = equiposVol.get(aleatorio2).getVictorias();
                int der = equiposVol.get(aleatorio).getDerrotas();
                equiposVol.get(aleatorio2).setVictorias(ant + 1);
                equiposVol.get(aleatorio).setDerrotas(der+1);
            }
            if (eleccion2==ganador){
                apuesta = apuesta * 2;
                Main.Plata += apuesta;
                System.out.println("Ganaste $"+ apuesta);
            }
            else{
                System.out.println("Lo siento, perdiste");
            }
        }
        else{
            if (ganador == 1){
                System.out.println("El equipo ganador es: "+aleatorios3);
                int ant = equiposVol.get(aleatorio3).getVictorias();
                int der = equiposVol.get(aleatorio4).getDerrotas();
                equiposVol.get(aleatorio3).setVictorias(ant + 1);
                equiposVol.get(aleatorio4).setDerrotas(der+1);
            }
            else {
                System.out.println("El equipo ganador es: "+aleatorios4);
                int ant = equiposVol.get(aleatorio4).getVictorias();
                int der = equiposVol.get(aleatorio3).getDerrotas();
                equiposVol.get(aleatorio4).setVictorias(ant + 1);
                equiposVol.get(aleatorio3).setDerrotas(der+1);
            }
            if (eleccion2==ganador){
                apuesta = apuesta * 2;
                Main.Plata += apuesta;
                System.out.println("Ganaste $"+ apuesta);
            }
            else{
                System.out.println("Lo siento, perdiste");
            }
        }
        System.out.println("Volviendo la menu principal ");
        Main.menuInicio();
    }
}
