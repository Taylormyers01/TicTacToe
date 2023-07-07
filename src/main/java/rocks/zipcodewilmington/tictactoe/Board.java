package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] playingBoard = new Character[3][3];
    public Board(Character[][] matrix) {
        this.playingBoard = matrix;
    }

    public Boolean isInFavorOfX() {
        return (checkColumn('X') || checkRows('X')|| checkDiag('X'));
    }

    public Boolean isInFavorOfO() {
        return (checkColumn('O') || checkRows('O')|| checkDiag('O'));
    }

    public Boolean isTie() {
        if(!isInFavorOfO() && !isInFavorOfX() ){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        }
        else if(isInFavorOfO()){
            return "O";
        }
        return "";
    }
    public boolean checkRows(char player){
        for(int i = 0; i < 3; i++){
            if(playingBoard[i][0] == player && playingBoard[i][1] == player && playingBoard[i][2] == player){
                return true;
            }
        }
        return false;
    }
    public boolean checkColumn(char player){
        for(int i = 0; i < 3; i++){
            if(playingBoard[0][i] == player && playingBoard[1][i] == player && playingBoard[2][i] == player){
                return true;
            }
        }
        return false;
    }
    public boolean checkDiag(char player){
        if(playingBoard[0][0] == player && playingBoard[1][1] == player && playingBoard[2][2] == player){
            return true;
        }
        else if(playingBoard[0][2] == player && playingBoard[1][1] == player && playingBoard[2][0] == player){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Character[][] hold =  {{'X', 'X', 'O'},
                               {'O', 'X', 'X'},
                               {'X', 'O', 'O'}};
        Board player = new Board(hold);
        System.out.println(player.isInFavorOfX());
    }

}
