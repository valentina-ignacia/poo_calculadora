module valentina.ignacia.poo_calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens valentina.ignacia.poo_calculadora to javafx.fxml;
    exports valentina.ignacia.poo_calculadora;
}