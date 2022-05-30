package com.example.league360;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stages {

    public static Nodes current;

    private String[] addresses=new String[]{"HomeWindow.fxml","PreviousWindow.fxml","NewGameWindow.fxml","MenuWindow.fxml"};
    private Nodes[] nodes=new Nodes[10];

    Stages() throws IOException {
        for(int i=0;i<4;i++){
            try{
                nodes[i]=new Nodes(addresses[i],null);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        nodes[1].nodeParent=nodes[0];
        nodes[2].nodeParent=nodes[0];
        nodes[3].nodeParent=nodes[0];
        nodes[0].addChild(nodes[1]);
        nodes[0].addChild(nodes[2]);
        nodes[2].addChild(nodes[3]);

        current=nodes[0];

    }

    public static void showStage(Stage stage) {

        stage.setScene(current.loaderScene);
        stage.show();

    }

}
