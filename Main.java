import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Friends Book");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FriendsBook.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Optionally, you can access the controller if needed
        FriendController controller = loader.getController();
    }

    public static void main(String[] args) {
        launch(args);
    }
}