package control;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import engine.Game;
import model.world.Champion;
import model.world.Hero;
import view.scene1;
import view.scene2;
import view.scene3;
import view.scene4;
import view.scene5;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class control extends Application {
	private Stage wind;
	private scene4 s4;
    private static int c1 = 0;
    private static int c2 = 0;
    private Button u;
    private static int c3 = 0;
    private scene5 s5;	
    public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws IOException {

		try {
			wind = primaryStage;
			wind.setTitle("Vallhala");
			wind.setFullScreenExitHint("");
			scene1 s1 = new scene1();
			scene2 s2 = new scene2();
			scene3 s3 = new scene3();
			wind.getIcons().add(new Image("M3.jpg"));
			s1.getStart().setOnAction(e -> switchtoscene1(s2));
			s1.getEnd().setOnAction(e -> System.exit(0));
			s2.getSkip().setOnAction(e -> switchtoscene2(s3));
			s3.getNext()
					.setOnAction(
							e -> {

								try {
									s4 = new scene4(s3.getTf().getText(), s3
											.getTf1().getText());
								} catch (Exception e1) {
								
									e1.printStackTrace();
								}
                                if(s3.getTf().getText().length() != 0 && s3
											.getTf1().getText().length() != 0){
								    wind.setScene(s4.getScene4());
                                }
                                else{
                                	Label l = new Label("please enter your names");
                                	l.setFont(Font.font(50));
                                	BorderPane.setAlignment(l, Pos.CENTER);
                                	s3.getWindow2().setTop(l);
                                }
                                wind.setFullScreen(true);
								ArrayList<Champion> c = Game
										.getAvailableChampions();
								
								
								Button leader = new Button("set leader1");
								Button leader2 = new Button("set leader2");
								
								HBox p = new HBox(1727);
								p.getChildren().addAll(leader,leader2);
                               
								
								s4.getWindow3().setTop(p);
								
									
									s4.getB1().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c , "Captain America" , s4.getB1() , s4.getS1(),leader);
										}
										else if(c2 <= 2){
										handle2(c , "Captain America" , s4.getB1() , s4.getS1() , leader2);
										}
										
											if(c3 >= 2){
						                    	 u = new Button("let's roll");
						                    	 u.setAlignment(Pos.CENTER);
						                    	 s4.getWindow3().setBottom(u);
						                    	 s5 = new scene5(s4.getFirst() , s4.getSecond()) ;
												 u.setOnAction(o -> wind.setScene(s5.getScene5()));
												   
						                     } 	    
									        	
										
											
		                            
									});
									
									s4.getB2().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c , "Deadpool" , s4.getB2() , s4.getS2() , leader);
										}
										else if(c2 <= 2){
										handle2(c , "Deadpool" , s4.getB2() , s4.getS2() , leader2);
										}
									
			                            	
										
										
											
		                            
									});
									s4.getB3().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c , "Dr Strange" , s4.getB3() , s4.getS3() , leader);
										}
										else if(c2 <= 2){
										handle2(c , "Dr Strange" , s4.getB3() , s4.getS3() , leader2);
										}
									
			                            	 
									        	
										
											
		                            
									});
									s4.getB4().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Electro" , s4.getB4() , s4.getS4() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Electro" , s4.getB4() , s4.getS4() , leader2);
										}
										
			                            	
											
										
											
		                            
										});
									s4.getB5().setOnAction(y ->{
										if(c1 <= 2){
										handle1(c ,"Ghost Rider" , s4.getB5() , s4.getS5() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Ghost Rider" , s4.getB5() , s4.getS5() , leader2);
										}
										
			                            	
										   
									        	
										
										
		                            
										} );
									s4.getB6().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Hela" , s4.getB6() , s4.getS6() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Hela" , s4.getB6() , s4.getS6() , leader2);
										}
										
			                            	
										
										
											
		                            
										});
									s4.getB7().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Hulk" , s4.getB7() , s4.getS7() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Hulk" , s4.getB7() , s4.getS7() , leader2);
										}
									
			                            	
										
										
											
		                            
										});
									s4.getB8().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Iceman" , s4.getB8() , s4.getS8() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Iceman" , s4.getB8() , s4.getS8() , leader2);
										}
										
			                            	
										
										
											
		                            
										});
									s4.getB9().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Ironman" , s4.getB9() , s4.getS9() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Ironman" , s4.getB9() , s4.getS9() , leader2);
										}
										
			                            	
										
										
											
		                            
										});
									s4.getB10().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Loki" , s4.getB10() , s4.getS10() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Loki" , s4.getB10() , s4.getS10() , leader2);
										}
										
			                            	
											
											
		                            
										});
									s4.getB11().setOnAction(y ->{
										if(c1 <= 2){
										handle1(c ,"Quicksilver" , s4.getB11() , s4.getS11() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Quicksilver" , s4.getB11() , s4.getS11() , leader2);
										}
										
			                            	
											
											
		                            
										});
									s4.getB12().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Spiderman" , s4.getB12() , s4.getS12() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Spiderman" , s4.getB12() , s4.getS12() , leader2);
										}
										
											
		                            
										});
									s4.getB13().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Thor" , s4.getB13() , s4.getS13() , leader);
										}
										else if(c2 <= 2){
											handle2(c ,"Thor" , s4.getB13() , s4.getS13() , leader2);
										}
										
			                            	
											
										
											
		                            
										});
									s4.getB14().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Venom" , s4.getB14() , s4.getS14() , leader);
										
										}
										else if(c2 <= 2){
											handle2(c ,"Venom" , s4.getB14() , s4.getS14() , leader2);
											
										}
										
			                            	
											
		                            
										});
									s4.getB15().setOnAction(y -> {
										if(c1 <= 2){
										handle1(c ,"Yellow Jacket" , s4.getB15() , s4.getS15() , leader);
										
										}
										else if(c2 <= 2){
											handle2(c ,"Yellow Jacket" , s4.getB15() , s4.getS15() , leader2);
											
											
										}
									
			                            	
											  
									        	
										
											
		                            
										});
								 
								

		});

			wind.setScene(s1.getScene1());
			wind.setFullScreen(true);
			wind.show();

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void handle1(ArrayList<Champion> c ,  String s , Button b , ImageView o , Button leader){
		VBox d = new VBox(50);
		Label l1 = new Label();
		l1.setFont(new Font(STYLESHEET_CASPIAN , 20));
		l1.setTextFill(Color.BLACK);
		Button conf = new Button("CONFIRM");
		Button canc = new Button("CANCEL");
		
        d.setAlignment(Pos.CENTER);
		HBox h = new HBox(150);
		h.getChildren().addAll(conf, canc);
		h.setAlignment(Pos.CENTER);
		for (int i = 0; i < c
				.size(); i++) {

			Champion a = c.get(i);
			if (a.getName().compareTo(s) == 0) {
				l1.setText(a.toString());
				d.getChildren().addAll(l1,h);

					
				s4.getWindow3()
						.setCenter(
								d);
				
                 BorderPane.setAlignment(d, Pos.CENTER);
				conf.setOnAction(j -> {
					s4.getWindow3()
							.setCenter(
									null);
					
					
					 
						s4.getFirst()
								.getTeam()
								.add(a);
						
						s4.getWin1().getChildren().addAll(o);
						
					    c1++;
					   
					   
					    
					leader.setOnAction(k -> {
						s4.getFirst().setLeader(a);
						leader.setDisable(true);
						s4.getWin1().getChildren().addAll(new Label(a.getName() + " is the leader"));
						c3++;
						if(s4.getFirst()
								.getTeam().size() == 3 && s4.getSecond()
										.getTeam().size() == 3 && c3 >= 2){
	                    	 u = new Button("let's roll");
	                    	 u.setAlignment(Pos.CENTER);
	                    	 s4.getWindow3().setBottom(u);
	                    	 s5 = new scene5(s4.getFirst() , s4.getSecond()) ;
							 u.setOnAction(y -> wind.setScene(s5.getScene5()));
							   
	                     } 	    
				        	
					});
					if(s4.getFirst()
							.getTeam().size() == 3 && s4.getSecond()
									.getTeam().size() == 3 && c3 >= 2){
                    	 u = new Button("let's roll");
                    	 u.setAlignment(Pos.CENTER);
                    	 s4.getWindow3().setBottom(u);
                    	 s5 = new scene5(s4.getFirst() , s4.getSecond()) ;
						 u.setOnAction(y -> wind.setScene(s5.getScene5()));
						   
                     } 	
					//System.out.println(s4.getFirst().getLeader().getName());
						
					
					b.setDisable(true);
				});
				canc.setOnAction(j -> {
					s4.getWindow3()
							.setCenter(
									null);
				});
				break;
			}
		}
		
      

	}
	public void handle2(ArrayList<Champion> c ,  String s , Button b , ImageView o , Button leader2){
		VBox d = new VBox(50);
		Label l1 = new Label();
		l1.setFont(new Font(STYLESHEET_CASPIAN , 20));
		l1.setTextFill(Color.BLACK);
		Button conf = new Button("CONFIRM");
		Button canc = new Button("CANCEL");
		
		
		
        d.setAlignment(Pos.CENTER);
		HBox h = new HBox(150);
		h.getChildren().addAll(conf, canc);
		h.setAlignment(Pos.CENTER);
		for (int i = 0; i < c
				.size(); i++) {

			Champion a = c.get(i);
			if (a.getName().compareTo(s) == 0) {
				l1.setText(a.toString());
				d.getChildren().addAll(l1,h);

					
				s4.getWindow3()
						.setCenter(
								d);
				
                 BorderPane.setAlignment(d, Pos.CENTER);
				conf.setOnAction(j -> {
					s4.getWindow3()
							.setCenter(
									null);
					
					 
				
						s4.getSecond()
								.getTeam()
								.add(a);
						
						s4.getWin2().getChildren().addAll(o);
						
				        c2++;
				  
								
				       

					
					
					leader2.setOnAction(k -> {
						s4.getSecond().setLeader(a);
						leader2.setDisable(true);
						s4.getWin2().getChildren().addAll(new Label(a.getName() + " is the leader"));
						c3++;
						if(s4.getFirst()
								.getTeam().size() == 3 && s4.getSecond()
										.getTeam().size() == 3 && c3 >= 2){
	                    	 u = new Button("let's Start");
	                    	 u.setAlignment(Pos.CENTER);
	                    	 s4.getWindow3().setBottom(u);
	                    	 s5 = new scene5(s4.getFirst() , s4.getSecond()) ;
							 u.setOnAction(y -> wind.setScene(s5.getScene5()));
							   
	                     } 	 
					});
					if(s4.getFirst()
							.getTeam().size() == 3 && s4.getSecond()
									.getTeam().size() == 3 && c3 >= 2){
                    	 u = new Button("let's Start");
                    	 u.setAlignment(Pos.CENTER);
                    	 s4.getWindow3().setBottom(u);
                    	 s5 = new scene5(s4.getFirst() , s4.getSecond()) ;
						 u.setOnAction(y -> wind.setScene(s5.getScene5()));
						   
                     } 	
					//System.out.println(s4.getSecond().getLeader().getName());
			        
					
				
					b.setDisable(true);
				});
				canc.setOnAction(j -> {
					s4.getWindow3()
							.setCenter(
									null);
				});
				break;
			}
		}

	}


	void switchtoscene2(scene3 scene) {
         
		wind.setScene(scene.getScene3());

	}

	void switchtoscene3(Stage p, Scene scene) {
		wind.setScene(scene);
	}

	void switchtoscene1(scene2 scene) {
		scene.getMediaPlayer().play();
		wind.setScene(scene.getScene2());
	}

}
