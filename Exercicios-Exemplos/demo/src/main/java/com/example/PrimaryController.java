package com.example;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PrimaryController {

    @FXML
    private Circle objeto;

    @FXML
    private void mecanincaTeclado() {
        objeto.setFill(Color.BISQUE);
    }
}