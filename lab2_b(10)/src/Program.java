import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Circle> lIstOfCircles = new ArrayList<>();
        lIstOfCircles.add(new Circle(3, 0, 0));
        lIstOfCircles.add(new Circle(2, 1, 1));
        lIstOfCircles.add(new Circle(3, 2, 2));
        lIstOfCircles.add(new Circle(3, -4, -8));

       for(int i=0; i<lIstOfCircles.size(); i++){
            Functions.perimeter(lIstOfCircles.get(i));
            Functions.square(lIstOfCircles.get(i));
       }
       Functions.isOnLine(lIstOfCircles);
    }
}