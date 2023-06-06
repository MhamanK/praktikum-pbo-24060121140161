/*
Nama File 	: BangunDatarGeneric.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: kelas konstruksi generic untuk BangunDatar 
*/

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;
	
	public void set(T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}