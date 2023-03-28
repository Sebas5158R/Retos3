package principal;

import java.util.Scanner;

import salud.Empleado;
import salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //Instacio clase Scanner
        Scanner teclado = new Scanner(System.in);

        //Variables
        double peso, estatura, resultado;
        int opcion;

        //Instancio la clase Persona y lo llamo usuario
        Persona usuario = new Persona(null, null, 0, 0);
      
        System.out.println("1 = Persona\n2. = Empleado");
        opcion=teclado.nextInt();

        //Acá puse el switch para separar lo de Persona y lo de empleado
        switch (opcion) {
            case 1:
              //LLamo el método usuario registro(para registrar datos)
                usuario.registro();
                //LLamo el método mostrarRegistrot(Para mostrar los datos ingresados)
                usuario.mostrarRegistro();
                //LLamo el método calcularEdad(Este método calcula si es o no es mayor de edad el usuario)
                usuario.calcularEdad();

                //Solicito datos para calcular su IMC
                System.out.println("Vuelva a ingresar su peso, para calcular su IMC");
                peso=teclado.nextDouble();
                System.out.println("Y vuelva a ingresar su estatura, para calcular su IMC");
                estatura=teclado.nextDouble();

                //Digo que la variable resultados es igual a usuario.imc(Invoco usuario.imc)
                resultado=usuario.imc(peso, estatura);
                
                //Muestro en pantalla los resultados
                System.out.println("Pesa: "+usuario.getPeso()+"kg");
                System.out.println("Mide: "+usuario.getEstatura()+" "+"Metros");
                System.out.println("Su IMC esta en: "+resultado);
                //Operación para saber el IMC del usuario
                if(resultado<20){
                    System.out.println("PESO BAJO");
                }else if(resultado>=20 && resultado<=25){
                    System.out.println("PESO IDEAL");
                }else if(resultado>25){
                    System.out.println("SOBREPESO");
                }                
                break;

                case 2:
                Empleado user = new Empleado(null, null, 0, 0, null, null, 0, 0);

                user.registroEmpleado();
                user.mostrarRegistroEmpleado();
                }

        //Limpiar buffer
        teclado.close();
    }
}
