package domain;

public class Magazine extends Material{
	
	private int editionNumber;

	public Magazine(String title, int editionNumber, int code, int year, boolean available, int pages) {
		super(title, code, year, available, pages);
        this.editionNumber = editionNumber;
		
	}
	
	@Override
	public double calculateFine() {
		return 0;
	}

}
