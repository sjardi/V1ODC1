package week4_opdracht8_1;

import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 
public class HelloWorld extends Application 
						implements EventHandler<ActionEvent> { 
	
	@Override 
	public void start(Stage primaryStage) { 
	Button btn = new Button(); 
	
btn.setText("Op console: 'Hello World!'"); 
btn.setOnAction(this); 

StackPane root = new StackPane(); 
root.getChildren().add(btn); 

Scene scene = new Scene(root, 300, 250); 

primaryStage.setTitle("De naam van dit raam!"); 
primaryStage.setScene(scene); 
primaryStage.show(); } 
	
public void handle(ActionEvent event) { 
	System.out.println("Hello World!"); } 

public static void main(String[] args){
{ Application.launch(args);
}
}
}