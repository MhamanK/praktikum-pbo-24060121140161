/*
Nama File 	: LambdaList.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: Implementasi lambda pada List, digunakan sebagai parameter pada method
*/

import java.util.ArrayList;

public class LambdaList{
	public static void main(String[] args){
		ArrayList<String> mahasiswaList = new ArrayList<>();
		mahasiswaList.add("Purel");
		mahasiswaList.add("Jasin");
		mahasiswaList.add("Denis");
		mahasiswaList.add("Diabolos");
		
		//lambda digunakan sebagai parameter
		mahasiswaList.forEach((nama)-> System.out.println(nama));
	}
}
