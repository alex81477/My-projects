import java.util.ArrayList;

public class Functions {
    public static Circle square(Circle cr){
        cr.square = 3.14 * Math.pow(cr.diameter*2, 2);
        System.out.println("square = " + cr.square);
        return cr;
    }
    public static Circle perimeter (Circle cr){
        cr.perimeter = 2 * 3.14 * cr.diameter * 2;
        System.out.println("perimeter = " + cr.perimeter);
        return cr;
    }
    public static void isOnLine(ArrayList<Circle> listOfCircles){

        for(int i=0;  i<listOfCircles.size();  i++){
            System.out.print("" + i);
            for(int j=1; j<listOfCircles.size();  j++){
                System.out.print("" + i + j);
                for(int g=2; g<listOfCircles.size(); g++) {
                    if((listOfCircles.get(i).x - listOfCircles.get(g).x) / (listOfCircles.get(j).x - listOfCircles.get(g).x)==(listOfCircles.get(i).y-listOfCircles.get(g).y)/(listOfCircles.get(j).y-listOfCircles.get(g).y)){
                        System.out.print("" + g);
                    }
                }
            }
            System.out.println();
        }
    }
    public static ArrayList<Circle> sort (ArrayList<Circle> list){

        return list;
    }
}