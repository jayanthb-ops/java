
interface DrawableStatic {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class RectangleStatic implements DrawableStatic {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class TestInterfaceStatic {
    public static void main(String args[]) {
        DrawableStatic d = new RectangleStatic();

        d.draw();

        System.out.println(DrawableStatic.cube(3));
    }
}
