package POO;

public class Circulo extends Figura {

    //Atributos
    private float radio;

    public Circulo(float radio){
        this.radio=radio;
    }


    public float getRadio() {
        return radio;
    }


    public void setRadio(float radio) {
        this.radio = radio;
    }


    public void calcularArea() {
        double area = 3.1416 * (radio * radio);
        System.out.println("El radio del circulo es: "+radio+" "+"y su area es de: "+area);

    }
    
}
