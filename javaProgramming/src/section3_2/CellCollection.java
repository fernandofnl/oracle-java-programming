package section3_2;

public class CellCollection {

	// Properties
	Cell[] cells;
	int index = 0;
	
	// Constructors
	public CellCollection(int size) {
		cells = new Cell[size];
	}

	// Behaviors
	
	public Cell getCell(int i) {
		return cells[i];
	}

	public void add(Cell c) {
		cells[index++] = c;
	}
	
	
	
	
}
