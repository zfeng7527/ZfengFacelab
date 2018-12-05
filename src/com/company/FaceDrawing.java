package com.company;

public class FaceDrawing {

    private String[][]  faceFeatures;

    FaceDrawing(String[][] faceFeatures){
        this.faceFeatures=faceFeatures;
    }

        void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
        }

        void fill(String str){
        String[0][1] = str;
        }

        String toString();
}
