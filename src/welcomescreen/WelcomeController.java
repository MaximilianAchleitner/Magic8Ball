package welcomescreen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import mainscreen.MainController;


public class WelcomeController implements Initializable {

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public static void show(Stage stage){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(WelcomeController.class.getResource("welcome.fxml"));
            Parent root = fxmlLoader.load();

            //get controller which is connected to this fxml file
            WelcomeController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Welcome");
            stage.setScene(new Scene(root, 400, 400));
            stage.show();
        }catch(Exception ex){
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error");
            ex.printStackTrace(System.err);
            System.exit(1);
        }
    }

    @FXML
    private void next()
    {
       MainController.show(new Stage());
       stage.close();
    }
}