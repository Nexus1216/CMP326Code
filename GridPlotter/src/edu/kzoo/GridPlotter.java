// Class: GridPlotter
//
// Author: Your Name Here
//
// License Information:
//   This class is free software; you can redistribute it and/or modify
//   it under the terms of the GNU General Public License as published by
//   the Free Software Foundation.
//
//   This class is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU General Public License for more details.
package edu.kzoo;
import edu.kzoo.grid.ColorBlock;
import edu.kzoo.grid.Grid;
import edu.kzoo.grid.Location;
import edu.kzoo.grid.gui.GridChangeListener;
import edu.kzoo.grid.gui.nuggets.ColorChoiceMenu;

import java.awt.Color;

import javax.swing.JOptionPane;

/**
 *  Grid Plotter:<br>
 *
 *    The GridPlotter class provides methods for drawing in
 *    a grid by placing color blocks in its cells.
 *    Each drawing method should take zero arguments, should
 *    have a void return type, and should have a name that conforms
 *    to the on...ButtonClick format.  (This restriction allows the
 *    GridPlotterGUI to recognize drawing methods, for which
 *    it automatically generates buttons.)
 *
 *  @author Your Name (based on a template provided by Alyce Brady)
 *  @version Appropriate Date
 **/

public class GridPlotter implements GridChangeListener
{
  // Instance Variables: Encapsulated data for EACH GridPlotter object
    private Grid theGrid = null;
    private GridPlotterGUI display = null;
    private ColorChoiceMenu drawingColorChooser = null;

  // constructors and initialization

    /** Constructs an object that could draw in a grid.
     *      @param disp    an object that knows how to display a grid
     *      @param colorChooser  a menu for choosing the color block color
     **/
    public GridPlotter(GridPlotterGUI disp,
                       ColorChoiceMenu colorChooser)
    {
        this.display = disp;
        this.drawingColorChooser = colorChooser;
    }

    /** Sets the grid in which to draw.
     **/
    public void reactToNewGrid(Grid grid)
    {
        theGrid = grid;
    }

  // drawing methods

    /** Removes all objects from the grid.
     **/
    public void onClearGridButtonClick()
    {

        
    	for ( int row = 0; row < theGrid.numRows(); row++ )
        {
            for ( int column = 0; column < theGrid.numCols(); column++ )
            {
            	ensureEmpty(row, column);
            }
        }

        // Display the grid after it has been completely cleared.
        display.showGrid();
    }

    /** Fills in all the cells of the grid using a row-major traversal.
     **/
    public void onRowMajorFillButtonClick()
    {
        for ( int row = 0; row < theGrid.numRows(); row++ )
        {
            for ( int column = 0; column < theGrid.numCols(); column++ )
            {
                placeColorBlock(row, column);
            }
        }
    }

    /** Fills in all the cells of the grid using a column-major traversal.
     **/
    public void onColMajorFillButtonClick()
    {
    	for ( int column = 0; column < theGrid.numCols(); column++ )
        {
            for ( int row = 0; row < theGrid.numRows(); row++ )
            {
                placeColorBlock(row, column);
            }
        }
        
    }
    /** Fills in all the cells of the grid using a reverse row-major traversal.
     **/
    public void onReverseRowMajorFillButtonClick()
    {
        for ( int row = theGrid.numRows() - 1; row >= 0; row--)
        {
        	for ( int column = 0; column < theGrid.numCols(); column++ )
            {
                placeColorBlock(row, column);
            }
        }
    }
    
    /** Fills in all the cells of the grid using a reverse column-major traversal.
     **/
    public void onReverseColMajorFillButtonClick ()
    {
    	for ( int column = theGrid.numCols() - 1; column >= 0; column--)
        {
            for ( int row = theGrid.numRows() - 1; row >= 0; row--)
            {
                placeColorBlock(row, column);
            }
        }
    }
    
    public void onDiagonalButtonClick ()
    {
    	int row = 0; 
    	int column = 0;
    	
    	while (row < theGrid.numRows() && column < theGrid.numCols())
    	{
    		placeColorBlock(row, column);
    		row++;
    		column++;
    	}
    }
    
    public void onDiagonal2ButtonClick ()
    {
    	int row = 0; 
    	int column = theGrid.numCols() - 1;
    	
    	while (row < theGrid.numRows() && column >= 0)
    	{
    		placeColorBlock(row, column);
    		row++;
    		column--;
    	}
    }
    
    public void onXButtonClick ()
    {
    	int row = 0; 
    	int column = 0;
    	
    	while (row < theGrid.numRows() && column < theGrid.numCols())
    	{
    		placeColorBlock(row, column);
    		row++;
    		column++;
    	}
    	
    	row = 0; 
    	column = theGrid.numCols() - 1;
    	
    	while (row < theGrid.numRows() && column >= 0)
    	{
    		placeColorBlock(row, column);
    		row++;
    		column--;
    	}
    }
    
    public void onSquareButtonClick ()
    {
    	int row = 0; 
    	int column = 0;
    	
    	while (column < theGrid.numCols())
    	{
    		placeColorBlock(row, column);
    		column++;
    	}
    	
    	row = 1; 
    	column = theGrid.numCols() - 1;
    	
    	while (row < theGrid.numRows())
    	{
    		placeColorBlock(row, column);
    		row++;
    	}
    	
    	row = theGrid.numRows() - 1; 
    	column = theGrid.numCols() - 2;
    	
    	while (column >= 0)
    	{
    		placeColorBlock(row, column);
    		column--;
    	}
    	
    	row = theGrid.numRows() - 2; 
    	column = 0;
    	
    	while (row >= 0)
    	{
    		placeColorBlock(row, column);
    		row--;
    	}
    	
    }
    
    public void onRoofButtonClick  ()
    {
    	int rowLimit = 0;
    	int colLimit = theGrid.numCols();
    	int column;
    	if(theGrid.numCols()%2 == 0)
    	{
    		column = theGrid.numCols()/2 - 1; 
    		if(theGrid.numCols() > theGrid.numRows())
    		{
    			colLimit = theGrid.numRows();
    		}
    		else
    		{
    			colLimit = theGrid.numCols() - 1;
    		}
    	}
    	else
    	{
    		column = (theGrid.numCols()/2);
    		if(theGrid.numCols() > theGrid.numRows())
    		{
    			colLimit = theGrid.numRows();
    		}
    		else
    		{
    			colLimit = theGrid.numCols();
    		}
    	}
    	int row = 0;
    	
    	while (column < colLimit)
		{
			placeColorBlock(row, column);
			row++;
			column++;
			rowLimit = row;
		}
    	
    	
    	for ( int i = 1; i < rowLimit; i++ )
        {
    		row = i;
    		if(theGrid.numCols()%2 == 0)
        	{
        		column = theGrid.numCols()/2 - 1; 
        	}
        	else
        	{
        		column = (theGrid.numCols()/2);
        	}
    		
    		while (row < rowLimit && column < colLimit)
    		{
    			placeColorBlock(row, column);
    			row++;
    			column++;
    		}
        }
    	
    	for ( int i = 1; i < rowLimit; i++ )
        {
    		row = i;
    		if(theGrid.numCols()%2 == 0)
        	{
        		column = theGrid.numCols()/2 - 2; 
        	}
        	else
        	{
        		column = (theGrid.numCols()/2 - 1);
        	}
    		
    		while (row < rowLimit && column >= 0)
    		{
    			placeColorBlock(row, column);
    			row++;
    			column--;
    		}
        }
    	
    	
    	
    }
    
    public void onHouseButtonClick  ()
    {
    	int rowLimit = 0;
    	int colLimit = theGrid.numCols();
    	int column;
    	if(theGrid.numCols()%2 == 0)
    	{
    		column = theGrid.numCols()/2 - 1; 
    		if(theGrid.numCols() > theGrid.numRows())
    		{
    			colLimit = theGrid.numRows();
    		}
    		else
    		{
    			colLimit = theGrid.numCols() - 1;
    		}
    	}
    	else
    	{
    		column = (theGrid.numCols()/2);
    		if(theGrid.numCols() > theGrid.numRows())
    		{
    			colLimit = theGrid.numRows();
    		}
    		else
    		{
    			colLimit = theGrid.numCols();
    			
    		}
    	}
    	int row = 0;
    	
    	while (column < colLimit)
		{
			row++;
			column++;
			rowLimit = row;
		}
    	
    	
    	for ( int i = 1; i < rowLimit; i++ )
        {
    		row = i;
    		if(theGrid.numCols()%2 == 0)
        	{
        		column = theGrid.numCols()/2 - 1; 
        	}
        	else
        	{
        		column = (theGrid.numCols()/2);
        	}
    		
    		while (row < rowLimit && column < colLimit)
    		{
    			row++;
    			column++;
    		}
        }
    	for ( int i = 1; i < rowLimit; i++ )
        {
    		row = i;
    		if(theGrid.numCols()%2 == 0)
        	{
        		column = theGrid.numCols()/2 - 2; 
        	}
        	else
        	{
        		column = (theGrid.numCols()/2 - 1);
        	}
    		
    		while (row < rowLimit && column >= 0)
    		{
    			row++;
    			column--;
    			
    		}
        }
    	int minCol = colLimit - (colLimit - 1);
    	int maxRow = colLimit + 1;
    	if(maxRow > theGrid.numRows())
    	{
    		maxRow = theGrid.numRows();
    		minCol = theGrid.numCols() - colLimit;
    	}
    	
    	for ( int i = minCol; i < colLimit - 1; i++ )
        {
            for (int j = rowLimit; j < maxRow; j++ )
            {
                placeColorBlock(j, i);
            }
        }
    	
    }
    
    public void onDoorButtonClick  ()
    {
    	int colLimit = theGrid.numCols();
    	int column;
    	if(theGrid.numCols()%2 == 0)
    	{
    		column = theGrid.numCols()/2 - 1; 
    		if(theGrid.numCols() > theGrid.numRows())
    		{
    			colLimit = theGrid.numRows();
    		}
    		else
    		{
    			colLimit = theGrid.numCols() - 1;
    		}
    	}
    	else
    	{
    		column = (theGrid.numCols()/2);
    		if(theGrid.numCols() > theGrid.numRows())
    		{
    			colLimit = theGrid.numRows();
    		}
    		else
    		{
    			colLimit = theGrid.numCols();
    			
    		}
    	}
    	
    	int maxRow = colLimit + 1;
    	if(maxRow > theGrid.numRows())
    	{
    		maxRow = theGrid.numRows();
    	}
    	
    	for ( int r = maxRow - 3; r < maxRow; r++ )
        {
    		
                placeColorBlock(r, column);
            
        }
    }
    
    public void onTriangleButtonClick  ()
    {
    	int row = 0; 
    	int column = 0;
    	
    	for ( int i = 0; i < theGrid.numRows(); i++ )
        {
    		row = i;
    		column = 0;
    		while (row < theGrid.numRows() && column < theGrid.numCols())
    		{
    			placeColorBlock(row, column);
    			row++;
    			column++;
    		}
        }
    	
    	
    }

  // helper methods that are called by other methods

    /** Ensures that the specified location is empty by removing the object
     *  there, if there is one.
     *      @param row      row number of location that should be empty
     *      @param column   column number of location that should be empty
     **/
    private void ensureEmpty(int row, int column)
    {
        // If the specified location in the grid is not empty,
        // remove whatever object is there.
        Location loc = new Location(row, column);
        if ( ! theGrid.isEmpty(loc) )
            theGrid.remove(theGrid.objectAt(loc));
    }

    /** Puts a color block in the specified location and redisplays the grid.
     *      @param row      row in which to place the new color block
     *      @param column   column in which to place the new color block
     **/
    private void placeColorBlock(int row, int column)
    {
        // First remove any color block that happens to be at this location.
        ensureEmpty(row, column);

        // Determine the color to use for this color block.
        Color color = drawingColorChooser.currentColor();

        // Construct the color block and add it to the grid at the
        // specificed location.  Then display the grid.
        Location loc = new Location(row, column);
        theGrid.add(new ColorBlock(color), loc);
        display.showLocation(loc);
    }

}
