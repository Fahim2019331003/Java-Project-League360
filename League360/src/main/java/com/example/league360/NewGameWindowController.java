package com.example.league360;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NewGameWindowController {
    @FXML
    private AnchorPane NewGamepane;
    @FXML
    void homeButtonClick(ActionEvent event) {
        Stage stage= (Stage) NewGamepane.getScene().getWindow();
        Stages.current=(Nodes) Stages.current.nodeParent;
        Stages.showStage(stage);
    }

    @FXML
    void submitButtonClick(ActionEvent event) {
        FormChecker.checkform();
        Stage stage= (Stage) NewGamepane.getScene().getWindow();
        Stages.current=(Nodes) Stages.current.list.get(0);
        Stages.showStage(stage);
    }
}
