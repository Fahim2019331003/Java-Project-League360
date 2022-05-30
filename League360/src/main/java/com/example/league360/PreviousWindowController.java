package com.example.league360;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class PreviousWindowController {

    @FXML
    private ScrollPane PreviousPane;

    @FXML
    void HomeButtonClick(ActionEvent event) {
        Stage stage= (Stage) PreviousPane.getScene().getWindow();
        Stages.current=(Nodes) Stages.current.nodeParent;
        Stages.showStage(stage);
    }
}
