package com.pankiba.designpatterns.creational.builder.effectivejava;

import java.time.Year;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {

	private String isbn;
	private String title;
	private String genre;
	private String author;
	private Year published;
	private String description;

	public Book(BookBuilder bookBuilder) {
		this.isbn = bookBuilder.isbn;
		this.title = bookBuilder.title;
		this.genre = bookBuilder.genre;
		this.author = bookBuilder.author;
		this.published = bookBuilder.published;
		this.description = bookBuilder.description;
	}

	public static class BookBuilder {

		private String isbn;
		private String title;
		private String genre;
		private String author;
		private Year published;
		private String description;

		public BookBuilder(String isbn, String title) {
			this.isbn = isbn;
			this.title = title;
		}

		public BookBuilder genre(String genre) {
			this.genre = genre;
			return this;
		}

		public BookBuilder author(String author) {
			this.author = author;
			return this;
		}

		public BookBuilder published(Year published) {
			this.published = published;
			return this;
		}

		public BookBuilder description(String description) {
			this.description = description;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}
}
