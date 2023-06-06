/*
Nama File 	: Pegawai.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: Program untuk demo Polimorfisme Inclusion
*/

public class Pegawai {
	protected String nama;
	protected int gajiPokok = 5000000;

	public void setNama (String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
	}
}