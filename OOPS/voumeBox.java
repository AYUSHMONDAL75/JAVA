class Box{
    double height, width, depth;

}
public class voumeBox {
    public static void main(String[] args) {
        Box ob1 = new Box();
        ob1.height = 20;
        ob1.width = 30;
        ob1.depth = 40;

        double volume = (ob1.height * ob1.width * ob1.depth);

        System.out.println("Volume of the box is: "+volume);
    }
    
}
