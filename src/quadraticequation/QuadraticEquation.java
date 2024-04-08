package quadraticequation;

public class QuadraticEquation {
    public double a;
    public double b;
    public double c;

    public QuadraticEquation(double a, double b, double c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return  this.c;
    }
    public double getDiscriminant(){
        return (this.getB()*this.getB() - 4*this.getA()*this.getC());
    }
    public double getRoot1(){
        return (-this.getB()+Math.sqrt(this.getDiscriminant())) / 2*this.getA();
    }
    public double getRoot2(){
        return (-this.getB()-Math.sqrt(this.getDiscriminant())) / 2*this.getA();
    }





}
