import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Viewer v = new Viewer();
        Tetrahedron t = new Tetrahedron(new Vertex(100, 100, 100),
                new Vertex(-100, -100, 100),
                new Vertex(-100, 100, -100),
                new Vertex(100, -100, -100)
        );
        v.addShape(t);
    }
}
