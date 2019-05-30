public class Functions {

    public static double square(Quadrilateral q){
            q.square = Math.pow(q.pt1.x - q.pt2.x, 2);
        return q.square;
    }
    public static double perimeter (Quadrilateral q){
        q.perimeter = Math.abs((q.pt1.x-q.pt2.x) * 4);
        return q.perimeter;
    }
}