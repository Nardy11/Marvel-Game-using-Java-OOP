package view;



import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class scene1 
{
   private Scene scene1;
   private Button start,end;
   private Image M3;
   private StackPane s0;
   public scene1(){
        start = new Button("Start");
	    end = new Button("End");
	    start.setPrefWidth(100);
		end.setPrefWidth(100);
		s0 = new StackPane();
		HBox window = new HBox();
		window.setId("window");
		window.setSpacing(40);
		window.setAlignment(Pos.CENTER);
		window.getChildren().addAll(start, end);
		s0.getChildren().addAll(window);
		scene1 = new Scene(s0, 1500 , 800);
		scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
   }
   

public StackPane getS0() {
	return s0;
}


public void setS0(StackPane s0) {
	this.s0 = s0;
}


public Scene getScene1() {
	return scene1;
}

public void setScene1(Scene scene1) {
	this.scene1 = scene1;
}


public Button getEnd() {
	return end;
}


public void setEnd(Button end) {
	this.end = end;
}


public Button getStart() {
	return start;
}


public void setStart(Button start) {
	this.start = start;
}


public Image getM3() {
	return M3;
}


public void setM3(Image m3) {
	M3 = m3;
}
   
	
	
}
