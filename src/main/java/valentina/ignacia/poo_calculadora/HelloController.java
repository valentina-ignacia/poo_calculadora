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
        int suma = secondNumber + firstNumber;
        this.getResultText().setText("" + suma);
    }

    @FXML
    private void onRestar() {
        int firstNumber = Integer.parseInt(this.getFirstNumber().getText());
        int secondNumber = Integer.parseInt(this.getSecondNumber().getText());
        int resta = firstNumber - secondNumber;
        this.getResultText().setText("" + resta);
    };

    @FXML
    private void onMultiplicar() {
        int firstNumber = Integer.parseInt(this.getFirstNumber().getText());
        int secondNumber = Integer.parseInt(this.getSecondNumber().getText());
        int multi = secondNumber * firstNumber;
        this.getResultText().setText("" + multi);
    };

    @FXML
    private void onDividir() {
        float firstNumber = Integer.parseInt(this.getFirstNumber().getText());
        float  secondNumber = Integer.parseInt(this.getSecondNumber().getText());
        float div;
        try{
            div = firstNumber / secondNumber;
            this.getResultText().setText("" + div);
        }catch (ArithmeticException ex){
            this.getResultText().setText(" ¡No se puede dividir por cero!");
        }
    };

    @FXML
    private void onModulo() {
        int firstNumber = Integer.parseInt(this.getFirstNumber().getText());
        int secondNumber = Integer.parseInt(this.getSecondNumber().getText());
        int modu = firstNumber % secondNumber;
        this.getResultText().setText("" + modu);
    };
}
