/** 
 * Name: Jay Nguyen              Student Number: 100384022
 * Course/Section: CPSC 1150-#   
 * Instructor: Bryan Green             Date:           Dec, 2, 2021
 * Assignment/Lab: 11             Last Modified: N   Dec, 7, 2021  
 * Purpose: Tic-Tac-Toe

*/
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        printBoard();
    }
    // Write a program that will allow two players to play a game of Tic-Tac-Toe
    // who goes first?
    // goes first: x
    //1 2 3
    // printBoard
    // getWhereToPlaceASymble(player)
    // is Winner(board)
    private static void printIdentification()
    {
        System.out.println("### Lab 11: Tic-Tac-Toe   Author: Jay Nguyen  ###");
        System.out.println("### Course/Section - CPSC1150-7 ###");
        System.out.println("### St.# - 100384022 ###\n");
        System.out.println();
    } // printIdentification
    private static void printBoard()
    {
        char[][] board = {
            {' ','|',' ','|',' '},
            {'-','-','-','-','-'},
            {' ','|',' ','|',' '},
            {'-','-','-','-','-'},
            {' ','|',' ','|',' '},
        };
        for(int i = 0; i < board.length;i++)
        {
            for(int j = 0; j < board[1].length;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    
}
