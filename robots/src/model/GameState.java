package model;

public class GameState {
    //1 - молекула    максимум 8                зеленый
    //2 - стенка      максимум 60               черный
    //3 - яд          максимум 15               красный
    //0- пусто
    public int[][] array = new int[20][20];

    public GameState(){
        int numberOfMolecules = 0;
        int numberOfWalls = 0;
        int numberOfPoison = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int x = (int) (Math.random() * ((19 - 0) + 1)) + 0;
                int y = (int) (Math.random() * ((19 - 0) + 1)) + 0;
                int typeOfObject = (int) (Math.random() * ((3 - 1) + 1)) + 1;

                if (array[x][y] == 0) {
                    if (typeOfObject == 1 & numberOfMolecules != 8) {
                        array[x][y] = 1;
                        numberOfMolecules += 1;
                    }
                    if (typeOfObject == 2 & numberOfWalls != 60) {
                        array[x][y] = 2;
                        numberOfWalls += 1;
                    }
                    if (typeOfObject == 3 & numberOfPoison != 15) {
                        array[x][y] = 3;
                        numberOfPoison += 1;
                    }
                }
                else{
                    while (array[x][y] != 0){
                        x = (int) (Math.random() * ((19 - 0) + 1)) + 0;
                        y = (int) (Math.random() * ((19 - 0) + 1)) + 0;
                    }
                }
                //array[i][j] = (int)(Math.random()*((3-1)+1))+1;
            }
        }
    }

}
