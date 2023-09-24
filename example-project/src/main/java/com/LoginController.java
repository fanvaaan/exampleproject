package com;

import com.form.FormAccess;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public final static double DEFAULT_WIDTH = 350;
    public final static double DEFAULT_HEIGHT = 310;

    @FXML protected Button btnClickMe;

    /**
     * Kebutuhan log aktifitas
     */
    @FXML protected AnchorPane backColorActivity;
    @FXML protected Circle circleColorActivity;
    @FXML protected Label lLogActivity;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Login
        btnClickMe.setOnMouseClicked(mouseEvent -> {

            Alert.information("It works!");

        });

    }






































}

