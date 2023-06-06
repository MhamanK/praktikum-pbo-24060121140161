/*
Nama File 	: Programmer.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: Program untuk demo Polimorfisme Inclusion
*/

public class Programmer extends Pegawai {
	protected int bonus = 450000;
	
	public Programmer (String name){
		nama = name;
	}
	
	public void tampilData() {
		System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
        System.out.println("Bonus : "+bonus);
	}
}