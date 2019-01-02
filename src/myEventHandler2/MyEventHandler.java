package myEventHandler2;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MyEventHandler implements EventHandler {
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
		txtArea.appendText("thats fun \n");// here is where you control the button from other classes
	}

	public void handle2(Event event) {
		if(btn.getText().equals("btn1")){
			txtArea.appendText("by handler 2\n");
		}else if(btn.getText().equals("btn2")){
			txtArea.appendText("by handler 2\n");
		}
		txtArea.appendText("thats fun \n");// here is where you control the button from other classes
	}



}
