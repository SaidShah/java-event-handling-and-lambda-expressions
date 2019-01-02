package myEventHandler2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String[] names = {"a","b","c","d"};
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		TextArea txtArea = new TextArea();// this is a text area like a text pad
		btn1.setOnAction(new MyEventHandler(txtArea,btn1)::handle);// this calls our event handler and we can use it and we
														/// can pass anything through it so you have to go to
														// the event handler class and make a constructor that can handle
														// what your passing
		btn2.setOnAction(new MyEventHandler(txtArea,btn2)::handle2); // the 2 colons lets you choose which method you would
														// like to use from the interface, its called a method refrence
		btn3.setOnAction(new MyEventHandler(txtArea,btn3));
		btn4.setOnAction(new MyEventHandler(txtArea,btn4));
		txtArea.setPrefSize(100, 200);// this text area opens under the button
		txtArea.setMaxWidth(100);// this sets the maximum but the prefSize is only preferred
		//txtArea.setText("hhhlsdhflsjdlfjs");// sets the text to what ever you want
		VBox pane = new VBox(50);// the 50 is the padding around the elements
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(btn1,btn2,btn3,btn4,txtArea);
		Scene scene = new Scene(pane,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
