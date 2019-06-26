package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainVewController implements Initializable {

	// itens de controle correspondente ao menu

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;

	// açõs dos itens do menu
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("Seller");
	}

	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.println("Department");
	}

	@FXML
	public void onMenuItemAbaoutAction() {
		System.out.println("About");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
