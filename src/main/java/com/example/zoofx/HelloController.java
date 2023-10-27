package com.example.zoofx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;


public class HelloController {



        @FXML
        private ChoiceBox<String> chooseAnimal;



        @FXML
        private Button makeSoundButton;

        @FXML
        private Label soundOutput;

private ObservableList<String> animals = FXCollections.observableArrayList("Cat","Dog","Elephant", "Crow");

@FXML
protected void initialize(){
        makeSoundButton.setStyle("-fx-background-color: blue");
        chooseAnimal.setItems(animals);
        chooseAnimal.setValue("Cat");
        makeSoundButton.setOnAction(actionEvent -> chooseAnimalMakeSound());
}
private void chooseAnimalMakeSound(){
        switch (chooseAnimal.getValue()){
                case "Cat":
                        soundOutput.setText(new Cat().makeSound());
                        break;
                case "Dog":
                        soundOutput.setText(new Dog().makeSound());
                        break;
                case "Elephant":
                        soundOutput.setText(new Elephant().makeSound());
                        break;
                case "Crow":
                        soundOutput.setText(new Crow().makeSound());
                        break;
        }
}

}