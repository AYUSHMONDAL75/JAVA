// Q38: Color with RGB, hex and named constructors
class Color {
    int r, g, b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // One String constructor: hex starts with '#', otherwise it is a name
    Color(String text) {
        if (text.startsWith("#")) {
            r = Integer.parseInt(text.substring(1, 3), 16);
            g = Integer.parseInt(text.substring(3, 5), 16);
            b = Integer.parseInt(text.substring(5, 7), 16);
        } else if (text.equalsIgnoreCase("red")) {
            r = 255; g = 0; b = 0;
        } else if (text.equalsIgnoreCase("green")) {
            r = 0; g = 255; b = 0;
        } else if (text.equalsIgnoreCase("blue")) {
            r = 0; g = 0; b = 255;
        } else {
            r = 0; g = 0; b = 0;    // unknown name -> black
        }
    }

    void display() {
        System.out.println("RGB(" + r + ", " + g + ", " + b + ")");
    }
}

public class Q38 {
    public static void main(String[] args) {
        new Color(10, 20, 30).display();
        new Color("#FF8800").display();
        new Color("blue").display();
    }
}
