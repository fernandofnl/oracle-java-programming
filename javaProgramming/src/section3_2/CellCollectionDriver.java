package section3_2;

public class CellCollectionDriver {

	public static void main(String[] args) {

		CellCollection celulas = new CellCollection(5);
		
		celulas.add(new Cell());
		celulas.add(new Cell());
		celulas.add(new Cell());
		celulas.add(new Cell());
		celulas.add(new Cell());

		System.out.println(celulas.getCell(0));
		System.out.println(celulas.getCell(1));
		System.out.println(celulas.getCell(2));
		System.out.println(celulas.getCell(3));
		System.out.println(celulas.getCell(4));
		
		celulas.getCell(0).setData("Primeira celula.");
		celulas.getCell(1).setData("Segunda celula.");
		celulas.getCell(2).setData("Terceira celula.");
		celulas.getCell(3).setData("Penúltima celula.");
		
		
		System.out.println(celulas.getCell(0));
		System.out.println(celulas.getCell(1));
		System.out.println(celulas.getCell(2));
		System.out.println(celulas.getCell(3));
		System.out.println(celulas.getCell(4));
		
		
		
	}

}
