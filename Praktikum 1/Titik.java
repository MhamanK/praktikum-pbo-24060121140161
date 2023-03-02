//Nama	: Fayyad Rahman
//NIM	: 24060121140161
//Tgl	: 22 Februari 2023
//Desk	:

class Titik{
	
	int absis;
	int ordinat;
	int	static counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(int a, int b){
		absis = a;
		ordinat = b;
		counterTitik++;
	}
	
	void setAbsis(int a){
		absis = a;
	}
	
	void setOrdinat(int b){
		ordinat = b;
	}
	
	int getAbsis(){
		return absis;
	}
	
	int getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}