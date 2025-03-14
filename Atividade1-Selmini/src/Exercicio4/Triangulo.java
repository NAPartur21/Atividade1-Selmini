package Exercicio4;

public class Triangulo {
    double a, b, c;
    
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

     public double perimetro() {
        return a + b + c;
    }

    private double calcularSemiperimetro() {
        return (a + b + c) / 2;
    }

    public double area() {
        double p = calcularSemiperimetro();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double calcularcosseno() {
        return (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
    }

    public double x() {
        double lambda = calcularcosseno();
        return (a * lambda + b) / 3;
    }

    public double y() {
        double cosseno = calcularcosseno();
        return (a / 3) * Math.sqrt(1 - Math.pow(cosseno, 2));
    }
    
    public void mostrar() {
        System.out.println("    área --> " + area());
        System.out.println("    lados --> " + a + ", " + b + ", " + c);    
        System.out.println("    perimetro --> " + perimetro());
        System.out.println("    centroide -->  (" + x() + ", " + y() + ")");

    }
}
