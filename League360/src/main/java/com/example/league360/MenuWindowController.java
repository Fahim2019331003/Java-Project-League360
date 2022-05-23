package com.example.league360;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuWindowController {

    @FXML
    private AnchorPane MenuPane;

    @FXML
    void homeButtonClick(ActionEvent event) {
        Stage stage= (Stage) MenuPane.getScene().getWindow();
        Stages.current=(Nodes) Stages.current.nodeParent;
        Stages.showStage(stage);
    }
}
