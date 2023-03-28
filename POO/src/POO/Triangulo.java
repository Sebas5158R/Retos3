package POO;

public class Triangulo extends Figura {

    //Atributos
    private float base;
    private float altura;

    public Triangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        float area = 0;
        area = (base*altura)/2;
        
        System.out.println("La base del Triangulo es: "+base+" "+"su altura es: "+altura+" "+"y el area es: "+area);

    }
    
}
