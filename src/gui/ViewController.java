/**
 * 
 */
package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author cristovao
 *
 */
public class ViewController {
	
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
		Locale.setDefault(Locale.US); // para garantir que o número inserido seja lido com o ponto como separador de decimais.
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1 + number2;
		
		labelResult.setText(String.format("%.2f", sum));
		
	}

	
}
