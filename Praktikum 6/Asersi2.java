//Nama		: Fayyad Rahman
//NIM		: 24060121140161
//Deskripsi	: Program untuk menunjukkan demo asersi yang akan menolak unput jari-jari lingkaran yang bernilai nol

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"Jari-jari tidak boleh nol!!1";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "
			+kelilingLingkaran);
	}
}

//Program Asersi di atas memiliki kesalahan dalam kecocokan antara syarat dari asersi dan output yang dihasilkan. 
//Sebagai alternatif, jika output yang diinginkan adalah "jari jari tidak boleh nol!!!", maka syarat yang tepat adalah assert(jariJari != 0), 
//atau jika syarat yang diperlukan adalah assert(jariJari > 0), maka output yang tepat adalah "jari jari harus lebih dari nol!!!".