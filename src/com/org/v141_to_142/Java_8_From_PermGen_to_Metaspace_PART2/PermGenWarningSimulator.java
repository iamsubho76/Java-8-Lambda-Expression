package com.org.v141_to_142.Java_8_From_PermGen_to_Metaspace_PART2;

public class PermGenWarningSimulator {

	//Set the below in VM arguments to to generate warning for PernGen
	//-XX:MaxPermSize=512m
	public static void main(String[] args) {
		System.out.println("PermGen Warning in java8");
	}
}
