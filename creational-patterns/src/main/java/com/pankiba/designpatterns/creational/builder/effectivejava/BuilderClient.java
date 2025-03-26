package com.pankiba.designpatterns.creational.builder.effectivejava;

import java.time.Year;

public class BuilderClient {
	public static void main(String[] args) {
		Book book = new Book.BookBuilder("0-12-345678-9", "Moby-Dick").genre("Fiction").author("Herman Melville")
				.published(Year.of(1851)).description("The book about adventure fiction").build();
		System.out.println(book);
	}
}
