package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HomeController implements Initializable {

    @FXML
    Label usernameLabel;

    @FXML
    private TableColumn<User, String> accounttable;

    @FXML
    private Button createbutton;

    @FXML
    private Button deletebutton;

    @FXML
    private MenuBar menubar;

    @FXML
    private TableView<User> mytable;

    @FXML
    private PasswordField passfield;

    @FXML
    private TableColumn<User, String> passtable;

    @FXML
    private ChoiceBox<User> statbox;

    @FXML
    private TableColumn<User, String> statustable;

    @FXML
    private Button updatebutton;

    @FXML
    private TextField usernamefield;

    @FXML
    private TableColumn<User, String> usertable;

    private Stage stage;
    private Scene scene;
    private Parent root;

    String filename = "accounts.txt";

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String username = LoginController.user.getUsername();
        usernameLabel.setText(username);

        
    } 
}
