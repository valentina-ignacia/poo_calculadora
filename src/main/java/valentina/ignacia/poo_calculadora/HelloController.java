package valentina.ignacia.poo_calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    /* Atributos */
    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;
    @FXML
    private Label resultText;

    /* Getters n Setters */
    public TextField getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(TextField firstNumber) {
        this.firstNumber = firstNumber;
    }

    public TextField getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(TextField secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Label getResultText() {
        return resultText;
    }

    public void setResultText(Label resultText) {
        this.resultText = resultText;
    }

    /* Métodos de Comportamiento */
    @FXML
    private void onSumar() {
        int firstNumber = Integer.parseInt(this.getFirstNumber().getText());
        int secondNumber = Integer.parseInt(this.getSecondNumber().getText());


    };

    @FXML
    private void onRestar() {};

    @FXML
    private void onMultiplicar() {};

    @FXML
    private void onDividir() {};

    @FXML
    private void onModulo() {};
}
