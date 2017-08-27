package com.org.v117.Java_8_IO_Enhancement_Files_walk_method;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args)   {
		Path start = Paths.get("/Java8FeatureWorkSpace_3");
		try(Stream<Path> walk = Files.walk(start, Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS)) {
			walk.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}