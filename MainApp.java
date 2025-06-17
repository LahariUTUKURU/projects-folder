import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        DBConnection.connect(); // Connect to MySQL

        Label label = new Label("JavaFX & MySQL Connected!");
        Scene scene = new Scene(label, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Database Connection Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
