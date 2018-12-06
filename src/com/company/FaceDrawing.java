package com.company;

public class FaceDrawing {

    private String[][]  faceFeatures;

    FaceDrawing(String[][] faceFeatures){
        this.faceFeatures=faceFeatures;
    }

        void edit(String replace, int row, int column){

        for(int i = 0; i < faceFeatures.length; i++){
            for(int j = 0; j < faceFeatures[i].length; j++) {
                faceFeatures[row][column] = replace;
                if(j < 3){
                    System.out.print(faceFeatures[i][j]);
                }
                else System.out.println(faceFeatures[i][j]);
            }
        }
        }

        void fill(String str){
            faceFeatures[0][0] = str;
            faceFeatures[0][7] = str;
            faceFeatures[4][0] = str;
            faceFeatures[4][7] = str;
        }
}
