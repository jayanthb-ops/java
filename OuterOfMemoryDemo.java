
import java.util.ArrayList;

class OutOfMemoryDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            list.add(1000000);
        }
    }
}


