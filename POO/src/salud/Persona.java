package salud;

import java.util.Scanner;

public class Persona {
    Scanner teclado = new Scanner(System.in);

    //Atributos
    public String tipoDoc, sexo;
    public int documento;
    public double peso, estatura, imc;
    int edad;
    public String nombre, apellido;

    //Método para registrarse
    public void registro(){
        System.out.println("Ingrese su nombre");
        nombre = teclado.next();
        System.out.println("Ingrese su apellido");
        apellido = teclado.next();
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        System.out.println("Ingrese su tipo de documento");
        tipoDoc = teclado.next();
        System.out.println("Ingrese su documento");
        documento = teclado.nextInt();
        System.out.println("Ingrese su peso");
        peso=teclado.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=teclado.nextDouble();
        System.out.println("Ingrese su sexo");
        sexo = teclado.next();
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    //Método de mostrar el registro
    public void mostrarRegistro(){
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Tiene: "+edad+" "+"años");
        System.out.println("Tiene: "+tipoDoc);
        System.out.println("número: "+documento);
        System.out.println("Pesa: "+getPeso()+"kg");
        System.out.println("Mide: "+getEstatura()+" "+"metros");
        System.out.println("Y es del sexo: "+sexo);
    }

    //Método con retorno para calcular el indice de masa corporal del usuario
    public double imc(double peso,  double estatura){
        imc = peso / (estatura*estatura);
        return imc;
    }

    //Método para determinar si el usuario es mayor de edad o no
    public void calcularEdad(){
        //Operación para comparar la edad
        if(edad>=18){
            System.out.println("El usuario es mayor de edad");
        }else if(edad<18){
            System.out.println("El usuario es menor de edad");
        }
    }

    //Constructor lleno de la subClase Empleado
    public Persona(String string, String string2, int i, int i2){
    }
}
