package com.coforge.day3;

public class Movie {
	private int name;
	private String Director;
	private float rating;

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", Director=" + Director + ", rating=" + rating + "]";
	}

}
