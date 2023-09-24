package com;

import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;

public class Alert {

    private static void alert(javafx.scene.control.Alert.AlertType type, Stage stage, String message) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(type);
        alert.initOwner(stage);
        alert.setContentText(message);
        alert.show();
    }
    private static void alert(javafx.scene.control.Alert.AlertType type, String message) {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(type);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static boolean confirmation(Stage stage, String message) {

        javafx.scene.control.Alert alert =
                new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION);

        alert.initOwner(stage);
        alert.setContentText(message);

        var result = alert.showAndWait();

        return result.isPresent() && result.get() == ButtonType.OK;

    }
    public static boolean confirm(Stage stage, String header, String message) {

        javafx.scene.control.Alert alert =
                new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION);

        alert.setHeaderText(header);
        alert.initOwner(stage);
        alert.setContentText(message);

        var result = alert.showAndWait();

        return result.isPresent() && result.get() == ButtonType.OK;

    }
    public static ButtonBar.ButtonData confirmation(Stage stage, String message, String customButtonName) {

        javafx.scene.control.Alert alert =
                new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION);

        alert.initOwner(stage);
        alert.setContentText(message);

        ButtonType yesButton = new ButtonType("YES", ButtonBar.ButtonData.YES);
        ButtonType customButton = new ButtonType(customButtonName, ButtonBar.ButtonData.OTHER);
        ButtonType cancelButton = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getButtonTypes().clear();
        dialogPane.getButtonTypes().addAll(yesButton, customButton, cancelButton);

        Button yesButtonNode = (Button) dialogPane.lookupButton(yesButton);
        yesButtonNode.setDefaultButton(false);

        Button customButtonNode = (Button) dialogPane.lookupButton(customButton);
        customButtonNode.setDefaultButton(true);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == yesButton) {
            return ButtonBar.ButtonData.YES;
        } else if (result.isPresent() && result.get() == customButton) {
            return ButtonBar.ButtonData.OTHER;
        } else {
            return ButtonBar.ButtonData.CANCEL_CLOSE;
        }

    }
    public static void error(Stage stage, String message) {

        Alert.alert(javafx.scene.control.Alert.AlertType.ERROR, stage, message);

    }
    public static void error(String message) {

        Alert.alert(javafx.scene.control.Alert.AlertType.ERROR, message);

    }
    public static void warning(Stage stage, String message) {

        Alert.alert(javafx.scene.control.Alert.AlertType.WARNING, stage, message);

    }
    public static void warning(String message) {

        Alert.alert(javafx.scene.control.Alert.AlertType.WARNING, message);

    }
    public static void information(Stage stage, String message) {

        Alert.alert(javafx.scene.control.Alert.AlertType.INFORMATION, stage, message);

    }
    public static void information(String message) {

        Alert.alert(javafx.scene.control.Alert.AlertType.INFORMATION, message);

    }

    public static String input(Stage stage, String message, String initValue) {

        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setContentText(initValue);
        textInputDialog.initOwner(stage);
        textInputDialog.setHeaderText(message);

        var result = textInputDialog.showAndWait();
        return result.orElse("");

    }
    public static String input(String message) {

        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setHeaderText(message);

        var result = textInputDialog.showAndWait();
        return result.orElse(null);
    }
    public static String input(Stage stage, String message, String initValue, boolean checkIsPresent) {

        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setContentText(initValue);
        textInputDialog.initOwner(stage);
        textInputDialog.setHeaderText(message);

        var result = textInputDialog.showAndWait();
        if(checkIsPresent) {

            if(result.isPresent()) {
                return result.orElse("");
            } else {
                return initValue;
            }

        } else {
            return result.orElse("");
        }
    }
    public static String input(Stage stage, String message, String initValue, boolean checkIsPresent, String customButtonName) {

        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setContentText(initValue);
        textInputDialog.initOwner(stage);
        textInputDialog.setHeaderText(message);

        var result = textInputDialog.showAndWait();
        if(checkIsPresent) {

            if(result.isPresent()) {
                return result.orElse("");
            } else {
                return initValue;
            }

        } else {
            return result.orElse("");
        }
    }
    public static int input(Stage stage, String message, int initValue) {

        TextInputDialog textInputDialog = new TextInputDialog();
        textInputDialog.setContentText(String.valueOf(initValue));
        textInputDialog.initOwner(stage);
        textInputDialog.setHeaderText(message);

        int results = -1;

        try {
            results = Integer.parseInt(String.valueOf(textInputDialog.showAndWait()));
        } catch (NumberFormatException e) {
            input(stage, "You may only enter numbers", 1);
        }

        return results;

    }









































}
































