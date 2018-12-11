package com.company;

public class FaceDrawing {

    private String[][]  faceFeatures;

    FaceDrawing(String[][] faceFeatures){
        this.faceFeatures=faceFeatures;
    }

        void edit(String replace, int row, int column){
            faceFeatures[row][column] = replace;
        }

        void fill(String str) {
            for (int i = 0; i < faceFeatures.length; i++) {
                for (int j = 0; j < faceFeatures[i].length; j++) {
                    faceFeatures[i][j] = str;
                }
            }
        }
        public String toString(){
             String face1 = "";
                for (int i = 0; i < faceFeatures.length; i++) {
                    for (int j = 0; j < faceFeatures[i].length; j++) {
                        face1 += faceFeatures[i][j];

                }
                face1 += "\n";
            }
            return face1;
            }
}
