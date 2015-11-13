import java.util.LinkedList


public class Ai
{
      //Ai will view gameboard as -1 for enemy, 0 for empty, 1 for ai
      private int[4][8] gameBoard;
      private LinkedList() possibleMoves;

      //Updates possibleMoves, to be called each turn
      //Currently only seeks open spots, possible attacks need figured out
      public void updatePossibleMoves()
      {
            for (int i = 0; i < 4; i++)
            {
                  for (int j = 0; j < 8; j++)
                  {
                        if (gameBoard[i][j] == 1)
                        {
                              if ((j+1) % 2 == 0 && (i) != 3)
                              {
                                    if (gameBoard[i][j+1] = 0)
                                    {
                                          possibleMoves.add(Integer.toString(i) +
                                                            " : "
                                                            Integer.toString(j+1));

                                    }
                                    if (gameBoard[i+1][j+1] = 0)
                                    {
                                          possibleMoves.add(Integer.toString(i+1) +
                                                            " : "
                                                            Integer.toString(j+1));
                                    }
                              }
                              else if ((j+1) % 2 == 0 && (i) == 3)
                              {
                                    if (gameBoard[i][j+1] = 0)
                                    {
                                          possibleMoves.add(Integer.toString(i) +
                                                            " : "
                                                            Integer.toString(j+1));

                                    }
                              }
                              else if (i != 0)
                              {
                                    if (gameBoard[i][j+1] = 0)
                                    {
                                          possibleMoves.add(Integer.toString(i) +
                                                            " : "
                                                            Integer.toString(j+1));

                                    }
                              }
                              else
                              {
                                    if (gameBoard[i][j+1] = 0)
                                    {
                                          possibleMoves.add(Integer.toString(i) +
                                                            " : "
                                                            Integer.toString(j+1));

                                    }
                                    if (gameBoard[i-1][j+1] = 0)
                                    {
                                          possibleMoves.add(Integer.toString(i-1) +
                                                            " : "
                                                            Integer.toString(j+1));
                                    }
                              }
                        }
                  }
            }
      }

      //Updates gameBoard, to be called each turn
      public void updateGameBoard()
      {

      }

      //Evaluates each node and returns the best option
      public int miniMax()
      {

      }

      //Evaluates a given node and returns the risk/reward
      public int evaluate()
      {

      }
}
