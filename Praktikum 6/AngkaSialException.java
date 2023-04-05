//Nama		: Fayyad Rahman
//NIM		: 24060121140161
//Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13!

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial!!!");
	}
}