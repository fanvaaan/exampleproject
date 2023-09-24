package com;

import com.form.FormAccess;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainClass extends Application {

    private final FormAccess formAccess = new FormAccess();

    @Override
    public void start(Stage stage) {

        formAccess.openLogin();

    }

    public static void main(String[] args) {

        launch();

    }


}
