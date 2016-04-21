package u8.day3;

public class BookTester {

	public static void main(String[] args) {
		Book b1 = new Book("Tale of Two Cities", "Charles Dickens", Book.LANG_ENGLISH);
		b1.setNumPages(448);
		b1.setNumWords(135420);

		Book b2 = new Book("Don Quixote", "Miguel de Cervantes", Book.LANG_SPANISH);

		System.out.println(b1);
		System.out.println("Words per page: " + b1.averageWordsPerPage());

		System.out.println(b2);

		System.out.println("Total books created: " + Book.getTotalBooks());
	}

}
