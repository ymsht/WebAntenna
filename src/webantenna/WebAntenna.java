/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webantenna;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author yamashita
 */
public class WebAntenna extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        AntennaController controller = new AntennaController();
        Scene scene = new Scene(controller);
        stage.setScene(scene);
        stage.getScene().setRoot(controller);
        stage.show();
    }
}