// import java.util.ArrayList;
// import java.util.List;

// class N_Queen_problem {
//     public boolean isSafe(int row , int col , char[][] board)
//     {
//         for (int j = 0; j < board.length; j++) {
//             if (board[row][j]=='Q') {
//                 return false;
//             }
//         }
//         for (int i = 0; i < board[0].length; i++) {
//             if (board[i][col]=='Q') {
//                 return false;
//             }
//         }
//     }
//     public void helper(char[][] board,List<List<String>> allBoard,int col)
//     {
//         if(col==board.length)
//         {
//             saveBoard(board,allBoard);
//             return;
//         }
//         for (int row = 0; row < board.length; row++) {
//             if (isSafe(row,col,board)) {
//                 board[row][col]='Q';
//                 helper(board, allBoard, col+1);
//                 board[row][col]='.';
//             }
//         }
//     }
//     public List<List<String>> solveNQueen(int n)
//     {
//         List<List<String>> allBoards = new ArrayList<>();
//         // char [][]board = new board[n][n];
//         char[][]board=new board[n][n];

//         helper(board, allBoards, 0);

//     }

// }