package anyonomusClass4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
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

		btn1.setOnAction(new EventHandler<ActionEvent>() {// this creates a new interface and instanciates it right away
														// so you dont need another class

			@Override
			public void handle(ActionEvent event) {
				txtArea.appendText(btn1.getText()+"is clicked \n");
			}

		});


		btn2.setOnAction(new EventHandler<ActionEvent>() {// this creates a new interface and instanciates it right away
													// so you dont need another class

			@Override
			public void handle(ActionEvent event) {
				txtArea.appendText(btn2.getText()+"is clicked \n");
				}

			});


		/*btn1.setOnAction(new MyEventHandler(txtArea,btn1));// this calls our event handler and we can use it and we
														/// can pass anything through it so you have to go to
														// the event handler class and make a constructor that can handle
														// what your passing
		btn2.setOnAction(new MyEventHandler(txtArea,btn2));
		btn3.setOnAction(new MyEventHandler(txtArea,btn3));
		btn4.setOnAction(new MyEventHandler(txtArea,btn4));
		txtArea.setPrefSize(200, 200);// this text area opens under the button
		txtArea.setMaxWidth(200);// this sets the maximum but the prefSize is only preferred
		//txtArea.setText("hhhlsdhflsjdlfjs");// sets the text to what ever you want
*/		VBox pane = new VBox(50);// the 50 is the padding around the elements
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(btn1,btn2,btn3,btn4,txtArea);
		Scene scene = new Scene(pane,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// this is called the inner class and you can put it inside another class inside the code brackets
/*	private class MyEventHandler implements EventHandler {// you can make it private now because its a private inner class
													// this way you can put one class in another class
		private TextArea txtArea;// you have to instanciate the text area in order to be able to use it in methods
		private Button btn;
		public MyEventHandler(TextArea txtArea,Button btn){// this is the constructor
			this.btn = btn;
			this.txtArea=txtArea;
		}

		@Override
		public void handle(Event event) {
			if(btn.getText().equals("btn1")){
				txtArea.appendText("bttn one is pressed \n");
			}else if(btn.getText().equals("btn2")){
				txtArea.appendText("bttn two was pressed \n");
			}
			// here is where you control the button from other classes
		}

	}*/



}

/*// this is called the inner class
class MyEventHandler implements EventHandler {// when you remove the public from the name java knows its not the main class
												// this way you can put one class in another class
	private TextArea txtArea;// you have to instanciate the text area in order to be able to use it in methods
	private Button btn;
	public MyEventHandler(TextArea txtArea,Button btn){// this is the constructor
		this.btn = btn;
		this.txtArea=txtArea;
	}

	@Override
	public void handle(Event event) {
		if(btn.getText().equals("btn1")){
			txtArea.appendText("bttn one is pressed");
		}else if(btn.getText().equals("btn2")){
			txtArea.appendText("bttn two was pressed");
		}
		// here is where you control the button from other classes
	}

}

*/