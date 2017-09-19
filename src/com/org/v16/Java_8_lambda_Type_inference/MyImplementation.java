package com.org.v16.Java_8_lambda_Type_inference;

import com.org.v1_to_v3_.Java_8_From_PermGen_to_Metaspace_PART1_to_PART3.Interface1;
import com.org.v1_to_v3_.Java_8_From_PermGen_to_Metaspace_PART1_to_PART3.Interface2;

public class MyImplementation implements Interface1, Interface2{

	@Override
	public void display(){
		Interface1.super.display();
	}
	
	public static void main(String[] args) {
		MyImplementation mi = new MyImplementation();
		mi.display();
	}
}
