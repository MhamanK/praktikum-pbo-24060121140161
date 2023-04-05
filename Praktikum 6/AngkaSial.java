//Nama		: Fayyad Rahman
//NIM		: 24060121140161
//Deskripsi	: Program penggunaan exception buatan sendiri dan pengenalan klausa 'throw' dan 'throws'

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as=new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}
		catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

//Program tidak dijalankan karena baris sebelumnya berisi angka 13 dan dieksekusi untuk mengeluarkan pesan "hati-hati memasukkan angka!!!", jika terdapat input 13.