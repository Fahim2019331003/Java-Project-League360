package com.example.league360;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Nodes {
    public String address;
    public FXMLLoader fxmlloader;
    public Scene loaderScene;

    public Nodes nodeParent;
    public List list=new ArrayList<Nodes>();

    Nodes()
    {
        nodeParent=null;
    }
    Nodes(String address,Nodes parent) throws IOException {
        this.address=address;
        fxmlloader=new FXMLLoader(getClass().getResource(address));
        loaderScene=new Scene(fxmlloader.load());
        nodeParent=parent;
    }
    void addChild(Nodes child)
    {
        list.add(child);
    }
}
