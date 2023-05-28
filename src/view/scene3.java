package view;

import java.io.File;







import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class scene3 {
	private Scene scene3;
	private Button next;
	private Image im;
	private TextField tf, tf1;
    private BorderPane window2;
	private MediaView mediaview;
	private MediaPlayer mediaPlayer;
	private Media media;
	public BorderPane getWindow2() {
	return window2;
}

public void setWindow2(BorderPane window2) {
	this.window2 = window2;
}

	public scene3() {
	//	String c = "ps2mp3.mp3";
		//String path = getClass().getResource(c).getPath();
//		Media h = new Media(new File(path).toURI().toString());
	//	mediaPlayer = new MediaPlayer(h);
	//	mediaview.setMediaPlayer(mediaPlayer);
		next = new Button();
		next.setMaxSize(500, 500);
	    next.setMinSize(10, 10);
	    next.setWrapText(true);
	    next.setTextFill(Color.WHITESMOKE);
	    next.setStyle("-fx-background-color:#000000;");
		next.setText("next");
		BorderPane.setMargin(next, new Insets(30));
		Label l1 = new Label("First Player name");
		l1.setFont(Font.font(25));
		l1.setTextFill(Color.BLACK);
		tf = new TextField();
		String s = tf.getText();
		Label l2 = new Label("Second Player name");
		l2.setFont(Font.font(25));
		l2.setTextFill(Color.BLACK);
		tf1 = new TextField();
		tf.setMaxWidth(250);
		tf1.setMaxWidth(250);
		tf.setStyle("-fx-background-color:#ffffff;");
		tf.setStyle("-fx-text-fill:#000000;");
		tf1.setStyle("-fx-background-color:#ffffff;");
		tf1.setStyle("-fx-text-fill:#000000;");
		 window2 = new BorderPane();
		window2.setId("window2");
		VBox t = new VBox(10);
		VBox t1 = new VBox(10);
		t.getChildren().addAll(l1 , tf);
		t1.getChildren().addAll(l2 , tf1);
		t.setAlignment(Pos.CENTER);
		t1.setAlignment(Pos.CENTER);
		next.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(next, Pos.CENTER);
		window2.setLeft(t);
		window2.setRight(t1);
		window2.setBottom(next);
		scene3 = new Scene(window2, 1500 , 800);
		scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	}

	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}

	public TextField getTf1() {
		return tf1;
	}

	public void setTf1(TextField tf1) {
		this.tf1 = tf1;
	}

	public Scene getScene3() {
		return scene3;
	}

	public void setScene3(Scene scene3) {
		this.scene3 = scene3;
	}

	public Button getNext() {
		return next;
	}

	public void setNext(Button next) {
		this.next = next;
	}

	public Image getIm() {
		return im;
	}

	public void setIm(Image im) {
		this.im = im;
	}

}
