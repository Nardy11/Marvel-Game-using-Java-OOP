package view;

//import java.awt.Rectangle;
import java.awt.Point;

import java.util.ArrayList;

import model.abilities.Ability;
import model.abilities.AreaOfEffect;
import model.world.Champion;
import model.world.Cover;
import model.world.Direction;
import engine.Game;
import engine.Player;
import engine.PriorityQueue;
import exceptions.AbilityUseException;
import exceptions.ChampionDisarmedException;
import exceptions.InvalidTargetException;
import exceptions.LeaderAbilityAlreadyUsedException;
import exceptions.LeaderNotCurrentException;
import exceptions.NotEnoughResourcesException;
import exceptions.UnallowedMovementException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class scene5 {
	private Scene scene5;
	private BorderPane window4;
	StackPane[][] screen_buttons = new StackPane[5][5];
	private GridPane grid;
	private Game game;
	private StackPane t;
	Button b, up, down, right, left;
	private VBox ve;

	public Scene getScene5() {
		return scene5;
	}

	public void setScene5(Scene scene5) {
		this.scene5 = scene5;
	}

	public BorderPane getWindow4() {
		return window4;
	}

	public void setWindow4(BorderPane window4) {
		this.window4 = window4;
	}

	public scene5(Player first, Player second) {
		window4 = new BorderPane();
		game = new Game(first, second);
		window4.setId("window4");
		VBox v1 = new VBox();
		VBox v2 = new VBox();

		Label la1 = new Label("First Player");
		Label la2 = new Label("Second Player");

		up = new Button("UP");
		down = new Button("Down");
		right = new Button("Right");
		left = new Button("Left");
		ve = new VBox();
		ve.getChildren().addAll(up, down, right, left);
		grid = new GridPane();
		grid.setPadding(new Insets(5));
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setAlignment(Pos.CENTER);
		v1.getChildren().addAll(la1);
		v2.getChildren().addAll(la2);
		v1.setAlignment(Pos.CENTER);
		v2.setAlignment(Pos.CENTER);

		Label firstplayer = new Label(first.getName());
		Label secondplayer = new Label(second.getName());
		ArrayList<Champion> firstteam = first.getTeam();
		ArrayList<Champion> secondteam = second.getTeam();
		v1.getChildren().addAll(firstplayer);
		v2.getChildren().addAll(secondplayer);

		Champion v = (Champion) game.getTurnOrder().peekMin();
		window4.setLeft(new Label(v.tostring()));
		ve.setAlignment(Pos.BOTTOM_CENTER);
		window4.setRight(ve);
		window4.setTop(v2);
		window4.setBottom(v1);
		window4.setCenter(grid);
		scene5 = new Scene(window4, 1500, 800);

		refresh(0);
		boolean flag = false;
		scene5.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case ENTER:
				game.endTurn();
				Champion t = (Champion) game.getTurnOrder().peekMin();
				window4.setLeft(new Label(t.tostring()));
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case UP:
				try {

					game.move(Direction.UP);

				} catch (NotEnoughResourcesException e2) {
					new warning(e2);
				} catch (UnallowedMovementException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case DOWN:
				try {
					game.move(Direction.DOWN);
				} catch (NotEnoughResourcesException e2) {
					new warning(e2);
				} catch (UnallowedMovementException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case RIGHT:
				try {
					game.move(Direction.RIGHT);
				} catch (NotEnoughResourcesException e2) {

					new warning(e2);
				} catch (UnallowedMovementException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case LEFT:
				try {
					game.move(Direction.LEFT);
				} catch (NotEnoughResourcesException e2) {

					new warning(e2);
				} catch (UnallowedMovementException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case W:
				try {
					game.attack(Direction.UP);

				} catch (NotEnoughResourcesException e2) {
					new warning(e2);
				} catch (ChampionDisarmedException e2) {
					new warning(e2);
				} catch (InvalidTargetException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case S:
				try {
					game.attack(Direction.DOWN);

				} catch (NotEnoughResourcesException e2) {

					new warning(e2);
				} catch (ChampionDisarmedException e2) {
					new warning(e2);
				} catch (InvalidTargetException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case A:
				try {
					game.attack(Direction.LEFT);

				} catch (NotEnoughResourcesException e2) {

					new warning(e2);
				} catch (ChampionDisarmedException e2) {
					new warning(e2);
				} catch (InvalidTargetException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case D:
				try {
					game.attack(Direction.RIGHT);

				} catch (NotEnoughResourcesException e2) {

					new warning(e2);
				} catch (ChampionDisarmedException e2) {
					new warning(e2);
				} catch (InvalidTargetException e2) {
					new warning(e2);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;

			case X:
				try {
					Ability a = (game.getCurrentChampion()).getAbilities().get(
							0);

					if (a.getCastArea() == AreaOfEffect.SURROUND
							|| a.getCastArea() == AreaOfEffect.TEAMTARGET
							|| a.getCastArea() == AreaOfEffect.SELFTARGET) {
						game.castAbility(a);
						refresh(0);
					} else if (a.getCastArea() == AreaOfEffect.DIRECTIONAL) {
						up.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.UP);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						down.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.DOWN);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						left.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.LEFT);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						right.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.RIGHT);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});

					}
				} catch (NotEnoughResourcesException e2) {

					new warning(e2);
				} catch (AbilityUseException e2) {
					new warning(e2);
				} catch (CloneNotSupportedException e2) {
					new warning(e2);
				}
				refresh(1);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case C:
				try {
					Ability a = (game.getCurrentChampion()).getAbilities().get(
							1);

					if (a.getCastArea() == AreaOfEffect.SURROUND
							|| a.getCastArea() == AreaOfEffect.TEAMTARGET
							|| a.getCastArea() == AreaOfEffect.SELFTARGET) {
						game.castAbility(a);
						refresh(0);
					} else if (a.getCastArea() == AreaOfEffect.DIRECTIONAL) {
						up.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.UP);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						down.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.DOWN);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						left.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.LEFT);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						right.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.RIGHT);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});

					}
				} catch (NotEnoughResourcesException e2) {

					System.out.println(e2);
				} catch (AbilityUseException e2) {
					System.out.println(e2);
				} catch (CloneNotSupportedException e2) {
					System.out.println(e2);
				}
				refresh(2);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case V:
				try {
					Ability a = (game.getCurrentChampion()).getAbilities().get(
							2);

					if (a.getCastArea() == AreaOfEffect.SURROUND
							|| a.getCastArea() == AreaOfEffect.TEAMTARGET
							|| a.getCastArea() == AreaOfEffect.SELFTARGET) {
						game.castAbility(a);
						refresh(0);
					} else if (a.getCastArea() == AreaOfEffect.DIRECTIONAL) {
						up.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.UP);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						down.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.DOWN);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						left.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.LEFT);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {

								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});
						right.setOnAction(y -> {
							try {
								game.castAbility(a, Direction.RIGHT);
								refresh(0);
							} catch (NotEnoughResourcesException e2) {
								new warning(e2);
							} catch (AbilityUseException e2) {
								new warning(e2);
							} catch (CloneNotSupportedException e2) {
								new warning(e2);
							}

						});

					}
				} catch (NotEnoughResourcesException e2) {

					new warning(e2);
				} catch (AbilityUseException e2) {
					new warning(e2);
				} catch (CloneNotSupportedException e2) {
					new warning(e2);
				}
				refresh(3);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;
			case DIGIT1:
				try {
					game.useLeaderAbility();
				} catch (LeaderNotCurrentException e1) {
					new warning(e1);
				} catch (LeaderAbilityAlreadyUsedException e1) {
					new warning(e1);
				}
				refresh(0);
				if (game.checkGameOver() != null) {
					new winner(game.checkGameOver());
				}
				break;

			}

		});
		if (game.checkGameOver() != null) {
			new winner(game.checkGameOver());
		}
		// scene5.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	}

	public HBox order() {
		PriorityQueue temp = new PriorityQueue(6);
		PriorityQueue temp2 = new PriorityQueue(6);
		HBox h = new HBox(5);
		while (!game.getTurnOrder().isEmpty()) {
			temp.insert(game.getTurnOrder().peekMin());
			temp2.insert(game.getTurnOrder().remove());
		}
		while (!temp2.isEmpty()) {
			game.getTurnOrder().insert(temp2.remove());
		}
		while (!temp.isEmpty()) {
			h.getChildren().addAll(
					new Label(((Champion) (temp.remove())).getName()));
		}
		return h;
	}

	public void refresh(int t) {
		Object[][] board2 = game.getBoard();
		Champion v = (Champion) game.getTurnOrder().peekMin();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				b = new Button(" ");
				b.setMinHeight(120);
				b.setMinWidth(120);

				if (board2[i][j] instanceof Champion) {
					Champion a = (Champion) board2[i][j];
					b.setText(a.getName());
					int x = i;
					int y = j;
					b.setOnAction(e -> {

						if (t == 1 || t == 2 || t == 3) {
							if (v.getAbilities().get(t - 1).getCastArea() == AreaOfEffect.SINGLETARGET) {
								try {
									game.castAbility(v.getAbilities()
											.get(t - 1), x, y);
								} catch (NotEnoughResourcesException e2) {

									System.out.println(e2);
								} catch (AbilityUseException e2) {
									System.out.println(e2);
								} catch (CloneNotSupportedException e2) {
									System.out.println(e2);
								} catch (InvalidTargetException e2) {
									System.out.println(e2);
								}

							}
						}

						Label l = new Label(a.tostring());
						l.setAlignment(Pos.CENTER);
						VBox va = new VBox(12);
						va.getChildren().addAll(l, ve);
						window4.setRight(va);

					});

				} else if (board2[i][j] instanceof Cover) {
					b.setText("cover");
					Cover a = (Cover) board2[i][j];
					int x = i;
					int y = j;
					b.setOnAction(e -> {
						if (t == 1 || t == 2 || t == 3) {
							try {
								game.castAbility(v.getAbilities().get(t - 1),
										x, y);
							} catch (NotEnoughResourcesException e2) {

								System.out.println(e2);
							} catch (AbilityUseException e2) {
								System.out.println(e2);
							} catch (CloneNotSupportedException e2) {
								System.out.println(e2);
							} catch (InvalidTargetException e2) {
								System.out.println(e2);
							}

						}

						Label l = new Label(a.toString());
						l.setAlignment(Pos.CENTER);
						VBox va = new VBox(12);
						va.getChildren().addAll(l, ve);
						window4.setRight(va);
					});
				}

				GridPane.setRowIndex(b, 4 - i);
				GridPane.setColumnIndex(b, j);

				grid.getChildren().addAll(b);
				final int x = i;
				final int y1 = j;

			}

		}
		VBox d = new VBox(10);
		d.getChildren().addAll(new Label(v.tostring()), order());
		window4.setLeft(d);
	}

	public Button getB() {
		return b;
	}

	public void setB(Button b) {
		this.b = b;
	}

	public Button getUp() {
		return up;
	}

	public void setUp(Button up) {
		this.up = up;
	}

	public Button getDown() {
		return down;
	}

	public void setDown(Button down) {
		this.down = down;
	}

	public Button getRight() {
		return right;
	}

	public void setRight(Button right) {
		this.right = right;
	}

	public Button getLeft() {
		return left;
	}

	public void setLeft(Button left) {
		this.left = left;
	}

	public GridPane getGrid() {
		return grid;
	}

	public void getSt(String a, ArrayList<Champion> firstteam,
			ArrayList<Champion> secondteam, Label st1, Label st2) {
		if (firstteam.contains(a))
			st1.setText(a.toString());
		else
			st2.setText(a.toString());
	}

	public void setGrid(GridPane grid) {
		this.grid = grid;
	}
}