package POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Instanciar clase Scanner
        Scanner teclado = new Scanner(System.in);
        
        float base, altura, radio;
        int opcion;

        System.out.println("1 = Triangulo\n2 = Rectángulo\n3 = Circulo\n4 = Juego: Piedra, Papel o Tijera");
        opcion=teclado.nextInt();

        switch(opcion){
            case 1:
            System.out.println("Ingrese la base del triangulo");
            base=teclado.nextFloat();
            System.out.println("Ingrese la altura del triangulo");
            altura=teclado.nextFloat();

            //Objeto de la subClase Triangulo
            Triangulo t1 = new Triangulo(base, altura);
            t1.calcularArea();
            break;

            case 2:
            System.out.println("Ingrese la base del rectángulo");
            base=teclado.nextFloat();
            System.out.println("Ingrese la altura del rectángulo");
            altura=teclado.nextFloat();

            //Objeto de la subClase Rectángulo
            Rectangulo r1 = new Rectangulo(base, altura);
            r1.calcularArea();
            break;

            case 3:
            System.out.println("Ingrese el radio del circulo");
            radio=teclado.nextFloat();

            //Objeto de la subClase Circulo
            Circulo c1 = new Circulo(radio);
            c1.calcularArea();
            break;

            case 4:
            PiedraPapelTijera juego1 = new PiedraPapelTijera();
            juego1.iniciar();
            juego1.jugar();
            juego1.finalizar();
            break;

            default:
            System.out.println("El número ingresado no es valido");
        }

        teclado.close();
    }
}
