package org.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Return2ndWord {

	public static void main(String[] args) {
		File file = new File("sentences.txt");
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String sentence;
			while ((sentence = reader.readLine()) != null) {
				sentence = sentence.trim();
				String[] words = sentence.split(" ");
				System.out.print(words[words.length - 2] + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
