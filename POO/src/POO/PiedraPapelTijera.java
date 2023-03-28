package POO;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego {
    //Instanciar clase scanner
    Scanner teclado = new Scanner(System.in);

    //Atributos
    private String nombre;
    private int eleccion;
    private int EleccionComputador;

    public void iniciar() {
        System.out.println("Ingrese su nombre");
        nombre=teclado.next();
       
    }

    public void jugar() {
        System.out.println("El computadro ya escogió");
        System.out.println(nombre+", Realice su eleccion:\n1 = Piedra\n2 = Papel\n3 = Tijera");
        eleccion=teclado.nextInt();
        Random aleatorio = new Random();
        EleccionComputador=aleatorio.nextInt(3)+1;
        System.out.print("El computador ha escogido: ");

       
    }

    public void finalizar() {
        switch(EleccionComputador){
            case 1:
            System.out.println("Piedra");
            switch(eleccion){
                case 1: System.out.println("Es un empate");break;
                case 2: System.out.println("Ganaste");break;
                case 3: System.out.println("Perdiste");break;
            }break;

            case 2:
            System.out.println("Papel");
            switch(eleccion){
                case 1: System.out.println("Perdiste");break;
                case 2: System.out.println("Es un empate");break;
                case 3: System.out.println("Ganaste");break;
            }break;

            case 3:
            System.out.println("Tijera");
            switch(eleccion){
                case 1: System.out.println("Ganaste");break;
                case 2: System.out.println("Perdiste");break;
                case 3: System.out.println("Es un empate");break;
            }break;
        }
    }
    
}
