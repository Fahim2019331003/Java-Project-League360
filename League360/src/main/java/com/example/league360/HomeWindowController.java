package com.example.league360;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Optional;

public class HomeWindowController {

    @FXML
    private BorderPane homePane;
    @FXML
    void exitButtonClick(ActionEvent event) {

        Stage stage = (Stage) homePane.getScene().getWindow();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're going to Exit this application.");
        alert.setContentText("Do you want to Exit?");

        if(alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out!");
            stage.close();
        }

    }

    @FXML
    void newButtonClick(ActionEvent event) {
        Stage stage=(Stage) homePane.getScene().getWindow();
        Stages.current= (Nodes) Stages.current.list.get(1);
        Stages.showStage(stage);
    }

    @FXML
    void previousButtonClick(ActionEvent event) {
        Stage stage=(Stage) homePane.getScene().getWindow();
        Stages.current= (Nodes) Stages.current.list.get(0);
        Stages.showStage(stage);
    }
}