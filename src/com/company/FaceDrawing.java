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
            faceFeatures[0][0] = str;
            faceFeatures[0][7] = str;
            faceFeatures[4][0] = str;
            faceFeatures[4][7] = str;
        }
}
