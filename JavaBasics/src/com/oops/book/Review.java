package com.oops.book;

public class Review {
	private int id;
	
	private String comments;
	private int rating;
	
	public Review(int id, String comments, int rating) {
		super();
		this.id = id;
		this.comments = comments;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", comments=" + comments + ", rating=" + rating + "]";
	}

}
