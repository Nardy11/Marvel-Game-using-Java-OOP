package view;

import java.io.File;

import javafx.geometry.Insets;

import java.io.IOException;

import engine.Game;
import engine.Player;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Skin;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class scene4 {

	private Player first, second;
	private Game game;
	private ImageView s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13,
			s14, s15;
	private BorderPane window3;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14,
			b15;
	private static Object[][] boarder;
	private VBox win1, win2;
	private Scene scene4;
	
	Image m1 = new Image(getClass().getResourceAsStream("Captain_America.jpg"));
	Image m2 = new Image(getClass().getResourceAsStream("Deadpool.jpg"));
	Image m3 = new Image(getClass().getResourceAsStream("Doctor_Strange.jpg"));
	Image m4 = new Image(getClass().getResourceAsStream("Electro.jpg"));
	Image m5 = new Image(getClass().getResourceAsStream("Ghost_Rider.jpg"));
	Image m6 = new Image(getClass().getResourceAsStream("Hela.jpg"));
	Image m7 = new Image(getClass().getResourceAsStream("Hulk.jpg"));
	Image m8 = new Image(getClass().getResourceAsStream("Iceman.jpg"));
	Image m9 = new Image(getClass().getResourceAsStream("IronMan.jpg"));
	Image m10 = new Image(getClass().getResourceAsStream("Loki.jpg"));
	Image m11 = new Image(getClass().getResourceAsStream("quicksilver.jpg"));
	Image m12 = new Image(getClass().getResourceAsStream("Spider-Man.jpg"));
	Image m13 = new Image(getClass().getResourceAsStream("Thor.jpg"));
	Image m14 = new Image(getClass().getResourceAsStream("Venom.png"));
	Image m15 = new Image(getClass().getResourceAsStream("Yellowjacket.jpg"));

	public scene4(String firstplayername, String secondplayername)
			throws IOException {
		Label firstplayer = new Label(firstplayername);
		Label secondplayer = new Label(secondplayername);
		first = new Player(firstplayername);
		second = new Player(secondplayername);
		firstplayer.setTextFill(Color.WHITE);
		secondplayer.setTextFill(Color.WHITE);

		Game.loadAbilities("Abilities.csv");
		Game.loadChampions("Champions.csv");
		window3 = new BorderPane();
		win1 = new VBox(5);
		win2 = new VBox(5);

		window3.setId("window3");
		s1 = new ImageView();
		s1.setImage(m1);
		s1.setFitWidth(150);
		s1.setFitHeight(150);
		b1 = new Button();
		b1.setTextFill(Color.TRANSPARENT);
		b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b1.setMinSize(125, 125);
		b1.setId("b1");
		s2 = new ImageView();
		s2.setImage(m2);
		s2.setFitWidth(150);
		s2.setFitHeight(150);
		b2 = new Button();
		b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b2.setMinSize(125, 125);
		b2.setId("b2");
		s3 = new ImageView();
		s3.setImage(m3);
		s3.setFitWidth(150);
		s3.setFitHeight(150);
		b3 = new Button();
		b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b3.setMinSize(125, 125);
		b3.setId("b3");
		s4 = new ImageView();
		s4.setImage(m4);
		s4.setFitWidth(150);
		s4.setFitHeight(150);
		b4 = new Button();
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b4.setMinSize(125, 125);
		b4.setId("b4");
		s5 = new ImageView();
		s5.setImage(m5);
		s5.setFitWidth(150);
		s5.setFitHeight(150);
		b5 = new Button();
		b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5.setMinSize(125, 125);
		b5.setId("b5");
		HBox h1 = new HBox();
		h1.getChildren().addAll(b1, b2, b3, b4, b5);

		s6 = new ImageView();
		s6.setImage(m6);
		s6.setFitWidth(150);
		s6.setFitHeight(150);
		b6 = new Button();
		b6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b6.setMinSize(125, 125);
		b6.setId("b6");
		s7 = new ImageView();
		s7.setImage(m7);
		s7.setFitWidth(150);
		s7.setFitHeight(150);
		b7 = new Button();
		b7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b7.setMinSize(125, 125);
		b7.setId("b7");
		s8 = new ImageView();
		s8.setImage(m8);
		s8.setFitWidth(125);
		s8.setFitHeight(125);
		b8 = new Button();
		b8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b8.setMinSize(125, 125);
		b8.setId("b8");
		s9 = new ImageView();
		s9.setImage(m9);
		s9.setFitWidth(150);
		s9.setFitHeight(150);
		b9 = new Button();
		b9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b9.setMinSize(125, 125);
		b9.setId("b9");
		s10 = new ImageView();
		s10.setImage(m10);
		s10.setFitWidth(150);
		s10.setFitHeight(150);
		b10 = new Button();
		b10.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b10.setMinSize(125, 125);
		b10.setId("b10");
		HBox h2 = new HBox();
		h2.getChildren().addAll(b6, b7, b8, b9, b10);

		s11 = new ImageView();
		s11.setImage(m11);
		s11.setFitWidth(150);
		s11.setFitHeight(150);
		b11 = new Button();
		b11.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b11.setMinSize(125, 125);
		b11.setId("b11");
		s12 = new ImageView();
		s12.setImage(m12);
		s12.setFitWidth(150);
		s12.setFitHeight(150);
		b12 = new Button();
		b12.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b12.setMinSize(125, 125);
		b12.setId("b12");
		s13 = new ImageView();
		s13.setImage(m13);
		s13.setFitWidth(150);
		s13.setFitHeight(150);
		b13 = new Button();
		b13.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b13.setMinSize(125, 125);
		b13.setId("b13");
		s14 = new ImageView();
		s14.setImage(m14);
		s14.setFitWidth(150);
		s14.setFitHeight(150);
		b14 = new Button();
		b14.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b14.setMinSize(125, 125);
		b14.setId("b14");
		s15 = new ImageView();
		s15.setImage(m15);
		s15.setFitWidth(150);
		s15.setFitHeight(150);
		b15 = new Button();
		b15.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b15.setMinSize(125, 125);
		b15.setId("b15");
		HBox h3 = new HBox();
		h3.getChildren().addAll(b11, b12, b13, b14, b15);

		HBox v = new HBox();
		v.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		v.setPrefSize(250, 125);
		b1.prefWidthProperty().bind(window3.widthProperty());
		b2.prefWidthProperty().bind(window3.widthProperty());
		b3.prefWidthProperty().bind(window3.widthProperty());
		b4.prefWidthProperty().bind(window3.widthProperty());
		b5.prefWidthProperty().bind(window3.widthProperty());
		b6.prefWidthProperty().bind(window3.widthProperty());
		b7.prefWidthProperty().bind(window3.widthProperty());
		b8.prefWidthProperty().bind(window3.widthProperty());
		b9.prefWidthProperty().bind(window3.widthProperty());
		b10.prefWidthProperty().bind(window3.widthProperty());
		b11.prefWidthProperty().bind(window3.widthProperty());
		b12.prefWidthProperty().bind(window3.widthProperty());
		b13.prefWidthProperty().bind(window3.widthProperty());
		b14.prefWidthProperty().bind(window3.widthProperty());
		b15.prefWidthProperty().bind(window3.widthProperty());

		v.getChildren().addAll(h1, h2, h3);
		HBox.setHgrow(b1, Priority.ALWAYS);
		HBox.setHgrow(b2, Priority.ALWAYS);
		HBox.setHgrow(b3, Priority.ALWAYS);
		HBox.setHgrow(b4, Priority.ALWAYS);
		HBox.setHgrow(b5, Priority.ALWAYS);
		HBox.setHgrow(b6, Priority.ALWAYS);
		HBox.setHgrow(b7, Priority.ALWAYS);
		HBox.setHgrow(b8, Priority.ALWAYS);
		HBox.setHgrow(b9, Priority.ALWAYS);
		HBox.setHgrow(b10, Priority.ALWAYS);
		HBox.setHgrow(b11, Priority.ALWAYS);
		HBox.setHgrow(b12, Priority.ALWAYS);
		HBox.setHgrow(b13, Priority.ALWAYS);
		HBox.setHgrow(b14, Priority.ALWAYS);
		HBox.setHgrow(b15, Priority.ALWAYS);
		win1.getChildren().addAll(firstplayer);
		win2.getChildren().addAll(secondplayer);
		win1.setAlignment(Pos.CENTER);
		win2.setAlignment(Pos.CENTER);
		window3.setLeft(win1);
		window3.setRight(win2);
		window3.setBottom(v);
		scene4 = new Scene(window3, 1250, 500);
		scene4.getStylesheets().add(
				getClass().getResource("application.css").toExternalForm());
	}

	public VBox getWin1() {
		return win1;
	}

	public void setWin1(VBox win1) {
		this.win1 = win1;
	}

	public VBox getWin2() {
		return win2;
	}

	public void setWin2(VBox win2) {
		this.win2 = win2;
	}

	public Button getB1() {
		return b1;
	}

	public void setB1(Button b1) {
		this.b1 = b1;
	}

	public Button getB2() {
		return b2;
	}

	public void setB2(Button b2) {
		this.b2 = b2;
	}

	public Button getB3() {
		return b3;
	}

	public void setB3(Button b3) {
		this.b3 = b3;
	}

	public Button getB4() {
		return b4;
	}

	public void setB4(Button b4) {
		this.b4 = b4;
	}

	public Button getB5() {
		return b5;
	}

	public void setB5(Button b5) {
		this.b5 = b5;
	}

	public Button getB6() {
		return b6;
	}

	public void setB6(Button b6) {
		this.b6 = b6;
	}

	public Button getB7() {
		return b7;
	}

	public void setB7(Button b7) {
		this.b7 = b7;
	}

	public Button getB8() {
		return b8;
	}

	public void setB8(Button b8) {
		this.b8 = b8;
	}

	public Button getB9() {
		return b9;
	}

	public void setB9(Button b9) {
		this.b9 = b9;
	}

	public Button getB10() {
		return b10;
	}

	public void setB10(Button b10) {
		this.b10 = b10;
	}

	public Button getB11() {
		return b11;
	}

	public void setB11(Button b11) {
		this.b11 = b11;
	}

	public Button getB12() {
		return b12;
	}

	public void setB12(Button b12) {
		this.b12 = b12;
	}

	public Button getB13() {
		return b13;
	}

	public void setB13(Button b13) {
		this.b13 = b13;
	}

	public Button getB14() {
		return b14;
	}

	public void setB14(Button b14) {
		this.b14 = b14;
	}

	public Button getB15() {
		return b15;
	}

	public void setB15(Button b15) {
		this.b15 = b15;
	}

	public static Object[][] getBoarded() {
		return boarder;
	}

	public BorderPane getWindow3() {
		return window3;
	}

	public void setWindow3(BorderPane window3) {
		this.window3 = window3;
	}

	public ImageView getS1() {
		return s1;
	}

	public void setS1(ImageView s1) {
		this.s1 = s1;
	}

	public ImageView getS2() {
		return s2;
	}

	public void setS2(ImageView s2) {
		this.s2 = s2;
	}

	public ImageView getS3() {
		return s3;
	}

	public void setS3(ImageView s3) {
		this.s3 = s3;
	}

	public ImageView getS4() {
		return s4;
	}

	public void setS4(ImageView s4) {
		this.s4 = s4;
	}

	public ImageView getS5() {
		return s5;
	}

	public void setS5(ImageView s5) {
		this.s5 = s5;
	}

	public ImageView getS6() {
		return s6;
	}

	public void setS6(ImageView s6) {
		this.s6 = s6;
	}

	public ImageView getS7() {
		return s7;
	}

	public void setS7(ImageView s7) {
		this.s7 = s7;
	}

	public ImageView getS8() {
		return s8;
	}

	public void setS8(ImageView s8) {
		this.s8 = s8;
	}

	public ImageView getS9() {
		return s9;
	}

	public void setS9(ImageView s9) {
		this.s9 = s9;
	}

	public ImageView getS10() {
		return s10;
	}

	public void setS10(ImageView s10) {
		this.s10 = s10;
	}

	public ImageView getS11() {
		return s11;
	}

	public void setS11(ImageView s11) {
		this.s11 = s11;
	}

	public ImageView getS12() {
		return s12;
	}

	public void setS12(ImageView s12) {
		this.s12 = s12;
	}

	public ImageView getS13() {
		return s13;
	}

	public void setS13(ImageView s13) {
		this.s13 = s13;
	}

	public ImageView getS14() {
		return s14;
	}

	public void setS14(ImageView s14) {
		this.s14 = s14;
	}

	public ImageView getS15() {
		return s15;
	}

	public void setS15(ImageView s15) {
		this.s15 = s15;
	}

	public Scene getScene4() {
		return scene4;
	}

	public void setScene4(Scene scene4) {
		this.scene4 = scene4;
	}

	public Game getGame() {
		return game;
	}

	public Player getFirst() {
		return first;
	}

	public void setFirst(Player first) {
		this.first = first;
	}

	public Player getSecond() {
		return second;
	}

	public void setSecond(Player second) {
		this.second = second;
	}
}
