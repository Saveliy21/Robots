package model;

public class Field {
    //1 - молекула
    //2 - стенка
    //3 - еда
    //4 - яд
    //5- пусто
    public static int[][] array = new int[20][20];

    public static void fillField(){
        for(int i =0; i<20;i++){
            for(int j = 0; j< 20; j++){
                array[i][j] = (int)(Math.random()*((5-1)+1))+1;
            }
        }
    }
}
