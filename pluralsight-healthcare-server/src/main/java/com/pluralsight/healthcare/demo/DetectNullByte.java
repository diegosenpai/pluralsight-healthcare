package com.pluralsight.healthcare.demo;

public class DetectNullByte {

	public static void main(String[] args) {
		String note = "Hello\0World";
		System.out.println(String.format("String length %d", note.length()));
		System.out.println(String.format("String content %s", note));
		System.out.println(String.format("String contains null bytes %b", note.contains("\0")));
	}

}
