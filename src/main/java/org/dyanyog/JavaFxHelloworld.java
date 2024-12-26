package org.dyanyog;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxHelloworld extends Application{
	public static void main(String[] args) {
		Application.launch();	
	}
	


@Override
public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();      //create stage
		
		stage.setTitle("First Window"); //Arrange the stage
		stage.setFullScreen(true);
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		Group actorGroup = new Group();  //Create Scene using actor backgrounds
		
		Scene scene =new Scene(actorGroup, Color.RED); //put scene on stage before we show to audience
		
		stage.setScene(scene); //show the stage to audience
		stage.show(); //Show the stage to audience
	}
	
}