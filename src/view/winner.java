package view;

import engine.Player;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class winner {
public winner(Player b){
	Stage w = new Stage();
	StackPane d = new StackPane();
	w.initModality(Modality.APPLICATION_MODAL);
	Button b1 = new Button(b.getName() + "winner");
	d.getChildren().addAll(b1);
	b1.setOnAction(e -> w.close());
	w.setScene(new Scene(d , 1800 ,500));
	w.show();
}
}
