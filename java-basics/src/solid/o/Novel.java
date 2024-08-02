package solid.o;

import solid.s.Book;

public class Novel extends Book {

	// Novel extends - so this is open for Extenstion
	// We did add extra attribute in Book class - So colsed for Modification

	private int seriesCount;

	@Override
	public String toString() {
		return "Novel [id=" + getId() + ", name=" + getName() + ", Author=" + getAuthor() + "seriesCount=" + seriesCount
				+ "]";
	}

	public Novel(int id, String name, String author, int seriesCount) {
		super(id, name, author);
		this.seriesCount = seriesCount;
		// TODO Auto-generated constructor stub
	}

	public int getSeriesCount() {
		return seriesCount;
	}

	public void setSeriesCount(int seriesCount) {
		this.seriesCount = seriesCount;
	}

}
