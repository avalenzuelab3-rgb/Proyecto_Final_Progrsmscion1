package domain;

public abstract class Material {
	
	private String title;
	private int code;
	private int year;
	private boolean available;
	private int pages;
	
    // Constructor para inicializar todos los atributos
    public Material(String title, int code, int year, boolean available, int pages) {
        this.title = title;
        this.code = code;
        this.year = year;
        this.available = available;
        this.pages = pages;
    }
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public abstract double calculateFine(); 

}
