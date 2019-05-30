public class Program {
    public static void main(String[] args) {
        Point pt1 = new Point(1,1);
        Point pt2 = new Point(3,2);
        Point pt3 = new Point(2,1);
        Point pt4 = new Point(2,2);
        Quadrilateral q1 = new Quadrilateral(pt1, pt2, pt3, pt4);
        System.out.println(Functions.perimeter(q1));
        System.out.println(Functions.square(q1));

    }
}
