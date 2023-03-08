//Nama	:Fayyad Rahman
//NIM	:24060121140161
//Desc	:Representasi Objek Segitiga, turunan kelas poligon
//tanggal	: 8 Maret 2023
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas,tinggi;
	
	public Segitiga(double alas,double tinggi,int jumlahSisi) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return alas * tinggi * 0.5;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
	}
}