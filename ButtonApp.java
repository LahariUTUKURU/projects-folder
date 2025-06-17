import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Button
        Button button = new Button("Click Me!");

        // Set action on button click
        button.setOnAction(e -> {
            System.out.println("Button was clicked!");
            button.setText("Clicked!");
        });

        // Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // Scene
        Scene scene = new Scene(layout, 300, 200);

        // Stage
        primaryStage.setTitle("JavaFX Button Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}