package AplicacionLogin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Contrlador implements Initializable {

	@FXML
	private Pane pane1;
	@FXML
	private Pane pane2;
	@FXML
	private Pane pane3;
	@FXML
	private Pane pane4;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		pane1.setStyle("-fx-background-image: url(\"/AplicacionLogin/feli1_1.jpg\")");
		pane2.setStyle("-fx-background-image: url(\"/AplicacionLogin/feliz2.jpg\")");
		pane3.setStyle("-fx-background-image: url(\"/AplicacionLogin/feliz3_1.jpg\")");
		pane4.setStyle("-fx-background-image: url(\"/AplicacionLogin/feliz4.jpg\")");

		backgroundAnimation();
	}

	private void backgroundAnimation() {
		//modo trancision 
		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), pane4);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();

		fadeTransition.setOnFinished(event -> {

			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(3), pane3);
			fadeTransition1.setFromValue(1);
			fadeTransition1.setToValue(0);
			fadeTransition1.play();

			fadeTransition1.setOnFinished(event1 -> {
				FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(3), pane2);
				fadeTransition2.setFromValue(1);
				fadeTransition2.setToValue(0);
				fadeTransition2.play();

				fadeTransition2.setOnFinished(event2 -> {

					FadeTransition fadeTransition0 = new FadeTransition(Duration.seconds(3), pane2);
					fadeTransition0.setToValue(1);
					fadeTransition0.setFromValue(0);
					fadeTransition0.play();

					fadeTransition0.setOnFinished(event3 -> {

						FadeTransition fadeTransition11 = new FadeTransition(Duration.seconds(3), pane3);
						fadeTransition11.setToValue(1);
						fadeTransition11.setFromValue(0);
						fadeTransition11.play();

						fadeTransition11.setOnFinished(event4 -> {

							FadeTransition fadeTransition22 = new FadeTransition(Duration.seconds(3), pane4);
							fadeTransition22.setToValue(1);
							fadeTransition22.setFromValue(0);
							fadeTransition22.play();

							fadeTransition22.setOnFinished(event5 -> {
								backgroundAnimation();
							});

						});

					});

				});
			});

		});

	}

}
