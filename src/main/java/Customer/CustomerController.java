package Customer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CustomerController {
    @FXML
    private Label welcomeText;
    private Button loginButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello");
    }
}