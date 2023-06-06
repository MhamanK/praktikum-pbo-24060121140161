/*
Nama File 	: Lingkaran.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: implementasi Lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}