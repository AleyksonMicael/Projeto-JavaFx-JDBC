package com.example.javafxjdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class MainViewController {

    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    protected void onMenuItemSellerAction() {
        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    protected void onMenuItemDepartmentAction() {
        System.out.println("onMenuItemDepartmentAction");
    }

    @FXML
    protected void onMenuItemAboutAction() {
        System.out.println("onMenuItemAboutAction");
    }
}
