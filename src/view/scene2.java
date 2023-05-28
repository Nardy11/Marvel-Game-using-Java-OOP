package view;

import java.io.File;


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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class scene2 {
	private Scene scene2;
	private Image video;
	private Button skip;
	private MediaPlayer mediaPlayer;
	private VBox window1;
	public VBox getWindow1() {
		return window1;
	}

	public void setWindow1(VBox window1) {
		this.window1 = window1;
	}

	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}

	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public scene2() {
		String s = "ps2mp3.mp3";
		String path = getClass().getResource(s).getPath();
		Media h = new Media(new File(path).toURI().toString());
		mediaPlayer = new MediaPlayer(h);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        skip = new Button("skip");
        skip.setPrefWidth(100);
		window1 = new VBox();
		window1.setSpacing(40);
		window1.setId("window1");
		window1.getChildren().addAll(skip);
		window1.setAlignment(Pos.BASELINE_RIGHT);
		scene2 = new Scene(window1, 1500, 800);
		scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	
	}

	public Scene getScene2() {
		return scene2;
	}

	public void setScene2(Scene scene2) {
		this.scene2 = scene2;
	}

	public Image getVideo() {
		return video;
	}

	public void setVideo(Image video) {
		this.video = video;
	}

	public Button getSkip() {
		return skip;
	}

	public void setSkip(Button skip) {
		this.skip = skip;
	}

}
