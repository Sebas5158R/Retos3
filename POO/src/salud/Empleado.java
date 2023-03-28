package salud;

public class Empleado extends Persona {
    //Atributos propios de la subClase empleado
    public String cargo, departamento;
    public  int horasTrabajadas;
    public double valorHora;

    //Método constructor de la subClase con atributos de la Super Clase(Persona)
    public Empleado(String nombre, String apellido, int edad, int documento, String cargo, String departamento, int valorHora, int horasTrabajadas){
        super(nombre, apellido, edad, documento);
        this.cargo=cargo;
        this.departamento=departamento;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
    }

    //Método propio de la subClase
    public void registroEmpleado(){
        System.out.println("Ingrese su nombre");
        nombre=teclado.next();
        System.out.println("Ingrese su apellido");
        apellido=teclado.next();
        System.out.println("Ingrese su edad");
        edad=teclado.nextInt();
        System.out.println("Ingrese su número de documento");
        documento=teclado.nextInt();
        System.out.println("Ingrese su cargo");
        cargo=teclado.next();
        System.out.println("En que departamento trabaja");
        departamento=teclado.next();
        System.out.println("Ingrese cuanto gana por hora");
        valorHora=teclado.nextDouble();
        System.out.println("Ingrese cuantas horas trabaja al dia");
        horasTrabajadas=teclado.nextInt();
    }

    public void mostrarRegistroEmpleado(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Número de documento: "+documento);
        System.out.println("Su cargo es: "+cargo);
        System.out.println("Trabaja en: "+departamento);
        System.out.println("Gana: "+valorHora+" "+"por hora");
        System.out.println("Trabaja: "+horasTrabajadas+" "+"horas al dia");
        //Operación
        valorHora=valorHora/horasTrabajadas-0.966;
        System.out.println("Debe pagar impuestos de: "+valorHora);
        }
    
}
