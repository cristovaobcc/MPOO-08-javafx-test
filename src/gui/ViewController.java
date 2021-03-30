/**
 * 
 */
package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author cristovao
 *
 */
public class ViewController {
	
	@FXML 
	private Button btTest;  // Atributo correspondente ao elemento gráfico da tela.
	
	@FXML // método que será acionado quando o botão btTest for clicado.
	public void onBtTestAction() {
		System.out.println("Click!");
	}

	
}
