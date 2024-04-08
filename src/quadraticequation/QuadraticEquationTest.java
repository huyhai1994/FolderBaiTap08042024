package quadraticequation;

public class QuadraticEquationTest {

    public static void main(String[] args) {
        QuadraticEquation result = new QuadraticEquation(4.0,-3.0,-1.0);
        double discriminant = result.getDiscriminant();
        System.out.println(discriminant);
        System.out.println("Discriminent of function is: " + discriminant);
        double root1 = result.getRoot1();
        System.out.println("root1 is: " + root1);
        double root2 = result.getRoot2();
        System.out.println("root2 is: " + root2);
    }
}
