package hw3;
import java.util.ArrayList;

import api.Direction;
import api.SnakePiece;

/**
 * A Snake is a sequence of (row, column) pairs in which each 
 * (row, column) in the sequence represents a 2d position that is
 * horizontally or vertically adjacent to the previous one.
 * Each (row, column) is represented by an instance of the
 * class SnakePiece.  The first piece in the sequence
 * is called the "head", and the last one is called the
 * "tail".  In addition to the list of SnakePiece objects,
 * a Snake has an id consisting of a single character.
 * <p>
 * A snake may or may not be <em>valid</em>.  More precisely,
 * a snake is defined to be valid if:
 * <ul>
 *   <li>It has at least two pieces
 *   <li>There are no null elements in its pieces list
 *   <li>There are no duplicates in its pieces list
 *   <li>Each piece in the list has a row and column
 *   position that is horizontally or vertically adjacent
 *   to the previous piece in the list
 * </ul>
 * The methods to add pieces to a snake do 
 * NOT do any error-checking.  Instead, clients can use the method 
 * isValid to check whether the snake is valid.
 */
public class Snake
{
  
  /**
   * Constructs a Snake with an empty list of SnakePiece objects
   * and with the given character as its ID.
   * @param givenId
   *   ID to use for this Snake
   */
  public Snake(char givenId)
  {

  }
  
  /**
   * Adds a new SnakePiece to the end of  this Snake's list of pieces.  This 
   * method does no error-checking to ensure the given position is actually 
   * adjacent to the current tail.
   * @param row
   *   row for the new SnakePiece
   * @param col
   *   column for the new SnakePiece
   */
  public void addPiece(int row, int col)
  {  
  }
  
  /**
   * Sets this Snake's list of pieces at the given index to be a new
   * SnakePiece with the given row and column.  If the current list 
   * of pieces is shorter than the given index, it is padded with
   * nulls so the given index can be set. This method does no 
   * error-checking to ensure the given (row, column) is actually 
   * adjacent to its neighbors in the list of pieces.
   * @param index
   *   index in the list of pieces where the new SnakePiece will be set
   * @param row
   *   row for the new SnakePiece
   * @param col
   *   column for the new SnakePiece
   */
  public void addPiece(int index, int row, int col)
  {  
  }
  
  /**
   * Returns the ID for this Snake.
   * @return
   *   ID for this Snake
   */
  public char getId()
  {
    return ' ';
  }
  
  /**
   * Returns true if the ID is one of the characters 'g' or 'G'.
   * @return
   *   true if ID is 'g' or 'G'
   */
  public boolean isGreen()
  {
    return false;
  }
  
  /**
   * Returns the first piece in this Snake's list of pieces,
   * or null if this snake has no pieces.
   * @return
   *   first piece
   */
  public SnakePiece getHead()
  {
    return null;
  }
  
  /**
   * Returns the last piece in this Snake's list of pieces, or 
   * null if this snake has no pieces.
   * @return
   *   last piece
   */
  public SnakePiece getTail()
  {
    return null;
  }
  
  /**
   * Returns true if given row and column match the row and column 
   * of this Snake's first piece.
   * Returns false if this snake has no pieces.
   * @param row
   *   given row
   * @param col
   *   given column
   * @return
   *   true if the head of this Snake has the same row and column
   */
  public boolean isHead(int row, int col)
  {
    return false;
  }
  
  /**
   * Returns true if given row and column match the row and column 
   * of this Snake's last piece.  Returns false if this snake has no pieces.
   * 
   * @param row
   *   given row
   * @param col
   *   given column
   * @return
   *   true if the tail of this Snake has the same row and column
   */
  public boolean isTail(int row, int col)
  {
    return false;
  }
   
  /**
   * Returns this Snake's list of pieces. Normally this
   * method is used to render or display the game; clients
   * should not directly modify the snakes through this method.
   * @return
   *   list of SnakePiece objects for this Snake
   */
  public ArrayList<SnakePiece> getPieces()
  {
    return null;
  }
  
  /**
   * Moves the head of this Snake in the given direction without
   * changing its length. Does nothing if the snake has fewer than
   * two pieces.
   * @param dir
   *   which direction
   */
  public void moveHead(Direction dir)
  {
  }
  
  /**
   * Moves the tail of this Snake in the given direction without
   * changing its length. Does nothing if the snake has fewer than
   * two pieces.
   * @param dir
   *   which direction
   */
  public void moveTail(Direction dir)
  {
  }
  
  /**
   * Moves the head of this Snake in the given direction, increasing
   * its length by 1. Does nothing if the snake has fewer than
   * two pieces.
   * @param dir
   *   which direction
   */
  public void moveHeadAndGrow(Direction dir)
  {
  }
  
  /**
   * Moves the head of this Snake in the given direction, decreasing
   * its length by 1.  Does nothing if this Snake fewer than three pieces.
   * @param dir
   *   which direction
   */
  public void moveHeadAndShrink(Direction dir)
  {
  }
  
  
  /**
   * Determines whether this snake is valid.  A snake is
   * <em>valid</em> if 
   * <ul>
   *   <li>It has at least two pieces
   *   <li>There are no null elements in its pieces list
   *   <li>There are no duplicates in its pieces list
   *   <li>Each piece in the list has a row and column
   *   position that is horizontally or vertically adjacent
   *   to the previous piece in the list
   * </ul>
   * @return
   *   true if this snake is valid, false otherwise
   */
  public boolean isValid()
  {
    return false;
  }
  
}
