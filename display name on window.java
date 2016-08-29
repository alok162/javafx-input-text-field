import java.util.Optional;

import javafx.application.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
public class Helloworld extends Application{
    public static void main(String args[])
    {
    	launch(args);
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TextInputDialog dialog=new TextInputDialog("name");
		dialog.setContentText("please enter your name");
		Optional<String> result = dialog.showAndWait();
		String name=result.get();
		if(name.length()>=2 && name.matches("[A-Za-z ]+"))
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			String res="Hello "+name;
			alert.setContentText(res);
			alert.showAndWait();
		}
		else
		{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setHeaderText("Please enter some valid name");
			alert.showAndWait();
		}
	}	
	}
