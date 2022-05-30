package com.example.league360;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class NewGameWindowController implements Initializable {
    @FXML
    private AnchorPane NewGamepane;

    @FXML
    private Label WarningTextLabel;
    @FXML
    private TextField TournamentNameTextField;

    @FXML
    private Spinner<Integer> PlayersSpinner;
    @FXML
    private Spinner<Integer> TeamSpinner;
    SpinnerValueFactory TeamValueFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(2,10,2);
    SpinnerValueFactory PlayerValueFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,15,1);

    @FXML
    private ChoiceBox<String> sportsChoiceBox;
    @FXML
    private ChoiceBox<Integer> GroupChoiceBox;
    private Integer[] groupChoices={1,2,4,8,16,32};
    private String[] choices={"Football","Cricket","Valorant","Others"};
    @FXML
    void homeButtonClick(ActionEvent event) {
        Stage stage= (Stage) NewGamepane.getScene().getWindow();
        Stages.current=(Nodes) Stages.current.nodeParent;
        Stages.showStage(stage);
    }

    @FXML
    void submitButtonClick(ActionEvent event) {
        FormChecker.TournamentName=TournamentNameTextField.getText();
        if(FormChecker.checkform(sportsChoiceBox.getValue())){
            Stage stage= (Stage) NewGamepane.getScene().getWindow();
            Stages.current=(Nodes) Stages.current.list.get(0);
            Stages.showStage(stage);
        }

        else{
            WarningTextLabel.setVisible(true);
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        WarningTextLabel.setVisible(false);

        sportsChoiceBox.getItems().addAll(choices);
        sportsChoiceBox.setOnAction(this::getSports);

        GroupChoiceBox.getItems().addAll(groupChoices);
        GroupChoiceBox.setOnAction(this::getGroups);

        PlayersSpinner.setValueFactory(PlayerValueFactory);
        TeamSpinner.setValueFactory(TeamValueFactory);
        FormChecker.TeamNumber=TeamSpinner.getValue();
        FormChecker.PlayerNumber=PlayersSpinner.getValue();

        TeamSpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                FormChecker.TeamNumber=TeamSpinner.getValue();
                System.out.println("Team Number "+FormChecker.TeamNumber);
            }
        });
        PlayersSpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                FormChecker.PlayerNumber=PlayersSpinner.getValue();
                System.out.println("Player Number "+FormChecker.PlayerNumber);

            }
        });


    }
    @FXML
    void GetTournamentName(ActionEvent event) {
        FormChecker.TournamentName=TournamentNameTextField.getText();
        System.out.println(FormChecker.TournamentName);
    }

    public void getSports(ActionEvent event)
    {
        FormChecker.SportName=sportsChoiceBox.getValue();
        System.out.println(FormChecker.SportName);

    }
    public void getGroups(ActionEvent event)
    {
        FormChecker.GroupNumber=GroupChoiceBox.getValue();
        System.out.println(FormChecker.GroupNumber);
    }
}
