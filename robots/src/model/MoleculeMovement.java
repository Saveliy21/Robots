package model;

import presenter.GamePresenter;

public class MoleculeMovement {

    private final GamePresenter presenter;

    public MoleculeMovement(GamePresenter presenter){
        this.presenter = presenter;
    }
    public GamePresenter getPresenter(){return this.presenter;}


    public void getMoleculeAction(){
        int[][] array = presenter.getField();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (array[i][j] == 1){
                    int direction = (int)((Math.random() * ((4 - 1) + 1)) + 1); // direction: 1 - вверх; 2 - вниз; 3 - влево; 4 - вправо;
                    switch(direction) {
                        case 1:
                            if (i != 0) {
                                if (array[i - 1][j] == 0) {
                                    array[i - 1][j] = 1;
                                    array[i][j] = 0;
                                }
                                if (array[i - 1][j] == 3) {
                                    array[i][j] = 0;
                                }
                            }
                            break;
                        case 2:
                            if (i != 19) {
                                if (array[i + 1][j] == 0) {
                                    array[i + 1][j] = 1;
                                    array[i][j] = 0;
                                }
                                if (array[i + 1][j] == 3) {
                                    array[i][j] = 0;
                                }
                            }
                            break;
                        case 3:
                            if (j != 0) {
                                if (array[i][j - 1] == 0) {
                                    array[i][j - 1] = 1;
                                    array[i][j] = 0;
                                }
                                if (array[i][j - 1] == 3) {
                                    array[i][j] = 0;
                                }
                            }
                            break;
                        case 4:
                            if (j != 19) {
                                if (array[i][j + 1] == 0) {
                                    array[i][j + 1] = 1;
                                    array[i][j] = 0;
                                }
                                if (array[i][j + 1] == 3) {
                                    array[i][j] = 0;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
