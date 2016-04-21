package u8.day3;

public class Book {
	public static final int LANG_ENGLISH = 0;
	public static final int LANG_FRENCH = 1;
	public static final int LANG_SPANISH = 2;
	public static final int LANG_MANDARIN = 3;
	
	public static final String[] LANGUAGES = {"English", "French", "Spanish", "Mandarin"};
	
	private static int totalBooks = 0;

	private String title;
	private String author;
	private int language;
	private int numPages;
	private int numWords;

	public Book(String title, String author, int language) {
		this.title = title;
		this.author = author;
		this.language = language;
		
		totalBooks++;
	}
	
	public double averageWordsPerPage() {
		return (double)numWords / numPages;
	}
	
	public String toString() {
		return title + " by " + author + " in " + LANGUAGES[language];
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLanguage() {
		return language;
	}

	public void setLanguage(int language) {
		this.language = language;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public int getNumWords() {
		return numWords;
	}

	public void setNumWords(int numWords) {
		this.numWords = numWords;
	}

	public static int getTotalBooks() {
		return totalBooks;
	}

}
