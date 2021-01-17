package org.tp.Singleton;

import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;

public class SnapshotHandler {
    private static SnapshotHandler instance = null;


    private SnapshotHandler() {
        // Exists only to defeat instantiation.
    }
    /* Static 'instance' method */
    public static SnapshotHandler getInstance() {
        if (instance == null) instance = new SnapshotHandler();
        return instance;
    }

    public WritableImage snap(Node node) {
        try {
            final Bounds bounds = node.getLayoutBounds();
            int imageWidth = (int) Math.round(bounds.getWidth());
            int imageHeight = (int) Math.round(bounds.getHeight());
            final SnapshotParameters snapPara = new SnapshotParameters();
            snapPara.setFill(Color.GRAY);
            WritableImage snapshot = new WritableImage(imageWidth, imageHeight);
            return node.snapshot(snapPara, snapshot);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
