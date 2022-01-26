/** 
 * Name: Jay Nguyen  Warren  Chan          Student Number: 100384022 100373143
 * Course/Section: CPSC 1150-#   
 * Instructor: Bryan Green             Date:           Nov, 25, 2021
 * Assignment/Lab: 11             Last Modified: N   Dec, 02, 2021  
 * Purpose: create Tic Tac Toe game
*/
import java.util.*;
public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        printIdentification();
        char[][] board = {{' ', ' ', ' '},
				 	      {' ', ' ', ' '}, 
				 	      {' ', ' ', ' '}};
        boolean playing = true;
        printBoard(board);
        while(playing)
        {
            player1Choice(board, 'X');
            if(finish(board, 'X')){
                break;
            }
            printBoard(board);
            player2Choice(board, 'O');
            if(finish(board, 'O')){
                break;
            }
            printBoard(board); 
        }

		
    }
    private static void printIdentification()
    {
        System.out.println("### Lab 11: Menus   Author: Jay Nguyen, Warren Chan  ###");
        System.out.println("### Course/Section - CPSC1150-003 ###");
        System.out.println("### St.# - 100384022, 100373143 ###\n");
        System.out.println();
    } // printIdentification
    /**
     * print the board
     * @param board
     */
    private static void printBoard(char[][] board)
    {
        System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] );
    }
    /**
     * translate the positions on the board to X or O depending on who goes first
     * @param board game board
     * @param position where the players want to put on the board
     * @param symbol X if the player goes first, otherwise O
     */
    private static void placeXOrO(char[][] board, String position, char symbol)
    {
        switch(position){
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("Not on the board");

        }

    }
    /**
     * the choice of the first player
     * @param board game board
     * @param symbol X if the player goes first, otherwise O
     */
    private static void player1Choice(char[][] board, char symbol)
    {
        String player1;
		while (true) {
			System.out.println("Where would you like to play from 1-9?");
			player1 = scanner.nextLine();
			if (isValidMove(board, player1)){
				break;
			} else {
				System.out.println(player1 + " is not a valid move.");
			}
		}
		placeXOrO(board, player1, 'X');
        
    }
    /**
     * the choice of the second player
     * @param board game board
     * @param symbol X if the player goes first, otherwise O
     */
    private static void player2Choice(char[][] board, char symbol)
    {
        String player2;
		while (true) {
			System.out.println("Where would you like to play from 1-9?");
			player2 = scanner.nextLine();
			if (isValidMove(board, player2)){
				break;
			} else {
				System.out.println(player2 + " is not a valid move.");
			}
		}
		placeXOrO(board, player2, 'O');
        
    }
    /**
     * check if the spots on board are empty or not
     * @param board the board that the player1 and the player2 are playing
     * @param position where the players want to put on the board
     * @return
     */
    private static boolean isValidMove(char[][] board, String position)
    {
        switch(position){
            case "1":
                return board[0][0] == ' ';
            case "2":
                return board[0][1] == ' ' ;
            case "3":
                return board[0][2] == ' ' ;
            case "4":
                return board[1][0] == ' ';
            case "5":
                return board[1][1] == ' ';
            case "6":
                return board[1][2] == ' ';
            case "7":
                return board[2][0] == ' ';
            case "8":
                return board[2][1] == ' ';
            case "9":
                return board[2][2] == ' ';
            default:
                return false;

        }
    }
    /**
     * determine who goes first in the program
     * @param player1 the first player
     * @param player2 the second player
     */
    private static char whoIsFirst(String player1, String player2, char symbol)
    {
        String first = "Y";
        System.out.println("Press Y if you want to go first or press N if you want to go second");
        if(player1 == first)
        {
            return symbol = 'X';
        }
        else    
            return symbol = 'O';
            

    }
    /**
     * check if the program has a winner or not
     * @param board the board that the player1 and the player2 are playing
     * @param symbol X or O
     * @return true if the program found out who wins, otherwise false
     */
    private static boolean checkWinner(char[][] board, char symbol)
    {
        if(board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol ||
        board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol ||
        board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol ||
        board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol ||
        board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol ||
        board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol ||
        board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol ||
        board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol){
            return true;
        }
        return false;
    }
    /**
     * check if the program is finished or not
     * @param board game board
     * @param symbol X or O
     * @return true if it has a winner otherwise false
     */
    private static boolean finish(char[][] board, char symbol)
    {
        if(checkWinner(board, symbol))
        {
            printBoard(board);
            System.out.println("Wins");
            return true;
        }
        else
        {
            System.out.println("Tie");
            return false;
        }

    }

    

}
