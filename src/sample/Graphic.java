package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Created by ASUS on 6/7/2017.
 */
public class Graphic implements Graphics {

    Group root;
    Scene scene;
    Canvas canvas;
    Stage primaryStage;
     GraphicsContext gc;

    Graphic(Group root, Scene scene, Canvas canvas,Stage primaryStage,GraphicsContext gc) {

        this.canvas = canvas;
        this.root = root;
        this.scene = scene;
        this.primaryStage=primaryStage;
    }
    public void setGraphics(){
        primaryStage.setTitle("Age of Empire");
        primaryStage.setScene(scene);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
        drawBackground();
        primaryStage.show();
    }

    @Override
    public void drawBackground() {
        Image grass = new Image("Images/grass.jpg");
        Image water = new Image("Images/water.jpg");
        Image rock = new Image("Images/rock.jpg");
        for (int j = 0; j < 8; j++)
            gc.drawImage(rock, j * 100, 0);
        for (int i = 1; i < 7; i++)
            for (int j = 0; j < 8; j++)
                gc.drawImage(grass, j * 100, i * 100);
        for (int j = 0; j < 8; j++)
            gc.drawImage(water, j * 100, 700);
    }
}
