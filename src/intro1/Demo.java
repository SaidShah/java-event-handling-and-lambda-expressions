package intro1;

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
		TextArea txtArea = new TextArea();// this is a text area like a text pad
		btn1.setOnAction(e->{// the e is just a variable name
			for(int i = 0; i < names.length;i++){
				txtArea.appendText(names[i]+"\n");// this prints all of the stuff in the array

			}
			// append adds the text and \n just gives it a new line
		//	txtArea.setText("we \n"); set text only does it once but append does it multiple times
		});

		txtArea.setPrefSize(100, 200);// this text area opens under the button
		txtArea.setMaxWidth(100);// this sets the maximum but the prefSize is only preferred
		//txtArea.setText("hhhlsdhflsjdlfjs");// sets the text to what ever you want
		VBox pane = new VBox(50);// the 50 is the padding around the elements
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(btn1,txtArea);
		Scene scene = new Scene(pane,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
