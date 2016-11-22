import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 * Test, PACKAGE_NAME
 * Mario Winiker
 * 04/04/2016
 */
public class HelloWorld extends Application {
    private int count = 0;

    @Override
    public void start(Stage mainStage) {

        Button button1 = new Button("Click Me!");
        button1.setPrefWidth(100);
        Button button2 = new Button("Exit");
        button2.setPrefWidth(100);

        VBox myPane = new VBox();
        myPane.getChildren().add(button1);
        myPane.getChildren().add(button2);
        VBox.setMargin(button1, new Insets(0, 0, 15, 0));
        VBox.setMargin(button2, new Insets(15, 0, 0, 0));
        myPane.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(myPane);
        mainStage.setScene(myScene);
        mainStage.setWidth(600);
        mainStage.setHeight(400);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ++count;
                button1.setText(Integer.toString(count));
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ++count;
                mainStage.close();
            }
        });

        mainStage.show();
    }
}
