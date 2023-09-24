package com.form;

import com.MainClass;
import com.Alert;
import com.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FormAccess {

    public static Stage stageOfLogin = new Stage();

    public void openLogin() {
        var stage = stageOfLogin;
        if(!stage.isShowing()) {
            FXMLLoader fxmlLoader = new FXMLLoader(MainClass.class.getResource(FXMLLocation.LOGIN));
            fxmlLoader.setController(new LoginController());
            try {
                Scene scene = new Scene(fxmlLoader.load());

                stage.setScene(scene);
                stage.setTitle("Click me!");

                stage.setMinWidth(LoginController.DEFAULT_WIDTH);
                stage.setMinHeight(LoginController.DEFAULT_HEIGHT);
                stage.setWidth(LoginController.DEFAULT_WIDTH);
                stage.setHeight(LoginController.DEFAULT_HEIGHT);

                stage.setOnCloseRequest(windowEvent -> System.exit(0));

                stage.centerOnScreen();
                stage.show();
            } catch (IOException exception) {
                Alert.error("Error");
            }
        } else {
            stage.requestFocus();
        }
    }

}




































