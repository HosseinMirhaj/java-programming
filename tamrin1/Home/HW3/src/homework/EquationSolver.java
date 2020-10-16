package homework;

public class EquationSolver {
    public float a,b,c,d,e,f,x,y;
    public String check;
    public void javabe_x() {
        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        check = String.valueOf((a * d) - (b * c));
        if (check == "0") {
            System.out.println("cant be calculate");
            System.exit(0);
        } else
            System.out.println("X = " + x);

    }
    public void javabe_y () {
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        check = String.valueOf(y);
        if (check == "0") {
            System.out.println("cant be calculate");
            System.exit(0);
        } else
            System.out.println("Y = " + y);
    }
}
