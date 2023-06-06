/*
Nama File 	: Car.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: Program untuk demo Polimorfisme Inclusion
*/

public class Car extends Vehicle {
	void calRent(int jarak, float harga){
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}