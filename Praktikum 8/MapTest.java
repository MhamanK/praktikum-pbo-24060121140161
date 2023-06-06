/*
Nama File 	: MapTest.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
*/
import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai-> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> key = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan
		//nilai dari kunci ? tulis pada laporan anda!
		// petunjuk : gunakan iterasi seperti program ArrayListTest

		// Digunakan perulangan "for" untuk menginisialisasi variabel "k" 
		//sebagai elemen dari objek "key". Setelah itu, dilakukan pencetakan 
		//ke layar dengan menggunakan nilai "k" itu sendiri untuk mendapatkan 
		//nilai dari kunci tersebut. Untuk mendapatkan nilai dari kunci, 
		//digunakan operator "get()" pada objek Map.
	}
}