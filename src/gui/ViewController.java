/**
 * 
 */
package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author cristovao
 *
 */
public class ViewController implements Initializable{
	
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Label labelResult;
	
	@FXML 
	private Button btSum;  // Atributo correspondente ao elemento gráfico da tela.
	
	@FXML // método que será acionado quando o botão btTest for clicado.
	public void onBtSumAction() {
		
		try {
			Locale.setDefault(Locale.US); // para garantir que o número inserido seja lido com o ponto como separador de decimais.
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;

			labelResult.setText(String.format("%.2f", sum));
			
		} catch (NumberFormatException e) {
			Alerts.showAlert("Erro", "Erro de valor inserido", e.getMessage(), AlertType.ERROR);
		}

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) { // executado quando o controllador for instanciado.
		// Aqui estão as instruçoes que devem ser executadas quando da instanciaçào do controlador.
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 12);
		Constraints.setTextFieldMaxLength(txtNumber2, 12);
		Constraints.setTextFieldInteger(txtNumber1);
		Constraints.setTextFieldInteger(txtNumber2);		
		
	}

	
}
