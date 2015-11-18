import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests. Creates a grid
 * that changes every second based on a set of rules established with if, elseif, and else statements.
 * 
 * @author @Eric Kim
 * @version 11/17/2015
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 10 rows and 10 columns
    private final int ROWS = 10;
    private final int COLS = 10;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);

        // populate the game
        populateGame();

        // display the newly constructed and populated world
        world.show();

    }

    /**
     * Creates the 9 actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the 10x10 grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid as rocks
     * 
     */
    private void populateGame()
    {
        // constants for the location of the nine cells initially alive
        final int X1 = 1, Y1 = 1;
        final int X2 = 3, Y2 = 1;
        final int X3 = 4, Y3 = 2;
        final int X4 = 4, Y4 = 3;
        final int X5 = 4, Y5 = 4;
        final int X6 = 4, Y6 = 5;
        final int X7 = 3, Y7 = 5;
        final int X8 = 2, Y8 = 5;
        final int X9 = 1, Y9 = 4;
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1 , Y1);
        grid.put(loc1, rock1);

        Rock rock2 = new Rock();
        Location loc2 = new Location(X2 , Y2);
        grid.put(loc2, rock2);

        Rock rock3 = new Rock();
        Location loc3 = new Location(X3 , Y3);
        grid.put(loc3, rock3);

        Rock rock4 = new Rock();
        Location loc4 = new Location(X4 , Y4);
        grid.put(loc4, rock4);

        Rock rock5 = new Rock();
        Location loc5 = new Location(X5 , Y5);
        grid.put(loc5, rock5);

        Rock rock6 = new Rock();
        Location loc6 = new Location(X6 , Y6);
        grid.put(loc6, rock6);

        Rock rock7 = new Rock();
        Location loc7 = new Location(X7 , Y7);
        grid.put(loc7, rock7);

        Rock rock8 = new Rock();
        Location loc8 = new Location(X8 , Y8);
        grid.put(loc8, rock8);

        Rock rock9 = new Rock();
        Location loc9 = new Location(X9 , Y9);
        grid.put(loc9, rock9);
        world.show();
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world by updating the new grid with a list of locations for alive cells
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation 
     * 
     */
    public void createNextGeneration()
    {

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        // Creates the Array lists that will store the locations of the dead cells and alive cells
        
        ArrayList<Location> deadcells = new ArrayList<Location>();
        ArrayList<Location> alivecells = new ArrayList<Location>();
        ArrayList<Actor> neighbors = new ArrayList<Actor>();
        
        // Uses nested for loops in order to go through each square of the grid 
        for (int rows = 0;
        rows < ROWS;
        rows ++)
        {
            for (int col = 0;
            col < COLS;
            col ++)
            {
                {
                    // Creates a loc variable that stores the current location of the for loop
                    Location loc = new Location(rows,col);
                    // Uses loc variable to check the number of neigbors around an actor cell
                    neighbors = grid.getNeighbors(loc);
                    //Checks for dead cell with loc variable and makes it alive if it has 3 alive cells
                    if (grid.get(loc) == null && neighbors.size() == 3)
                    {
                        alivecells.add(loc);
                    }
                    else if (grid.get(loc) != null)
                    {
                        // Alive cell has 2/3 neighbords and alive array list stores its location
                        if (neighbors.size() == 2 || neighbors.size() == 3)
                        {
                            alivecells.add(loc);
                        }
                        // Alive cell doesn't have 2/3 neighbors and dead array list stores its location
                        else
                        {
                            deadcells.add(loc);
                        }
                    }
                }

            }

        }
        // Iterates through the alive arraylist in order to update the new grid with the alive cells
        for (Location newloc : alivecells)
        {
            Rock rock = new Rock();
            //Puts a new rock in the grid by using the location stored inside alivecells
            grid.put(newloc,rock);
        }
        // Iterates through the dead arraylist in order to update the new grid with the dead cells
        for (Location newloc : deadcells)
        {
            //removes rocks by using the stored locations in the deadcells arraylist
            grid.remove(newloc);
        }

        world.show();
    }

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        for (int i = 0; i < 8; i++)
        {
            // Takes one second for each generation
            Thread.sleep(1000);
            //Calls the createNextGeneration method and updates the grid every one second
            game.createNextGeneration();
        }
    }
}
