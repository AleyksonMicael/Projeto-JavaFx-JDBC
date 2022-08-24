package com.example.javafxjdbc.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
    public static void showAlert(String title, String header, String content, javafx.scene.control.Alert.AlertType type) {
        Alert alerts = new Alert(type);
        alerts.setTitle(title);
        alerts.setHeaderText(header);
        alerts.setContentText(content);
        alerts.show();
    }
}
