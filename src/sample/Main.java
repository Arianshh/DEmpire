package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(WIDTH, HEIGHT);

        Graphic graphic = new Graphic(root,scene,canvas,primaryStage,gc);
        graphic.setGraphics();
    }


}
