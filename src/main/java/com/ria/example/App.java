package com.ria.example;


import java.util.Scanner;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        char tickTack[] = new char[9];

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char ch = sc.nextLine().charAt(0);
            int index = sc.nextInt();
            if (ch == 'X'){
                tickTack[index] = 'X';
            }
            if (ch == 'Y'){
                tickTack[index] = 'Y';
            }
            if(checkLineMatch(ch, index, tickTack)){
                System.out.println("Winner");
                break;
            }
        }

    }
    private static boolean checkLineMatch(char ch, int index, char tickTack[]){
        int[][] winn1 = {{1,2,3}, {1,4,7}, {1,5,9}, {2,5,8}, {3,6,9}, {3,5,7}, {4,5,6}, {7,8,9}};

        for (int i =0; i< 3; i++){
            boolean found = true;
            for (int j=0; j<9; j++){
                int charIdx = winn1[i][j];
                if (tickTack[charIdx] != ch){
                    found = false;
                    break;
                }
            }
            if (!found){
                return false;
            } else {
                return true;
            }
        }
        return false;
    }


}
