package buble;

public class bublesort {
	
	int[] dizi;
	int eleman_sayı=0;
	public void Liste_Eleman(int eleman) {
		dizi=new int[eleman];
	}
	public void Eleman_ekle(int a) {
		if(eleman_sayı>=dizi.length) {
			System.out.println("Dizi dolduğu için ekleme yapılamadı.");
		}
		else {
				dizi[eleman_sayı]=a;
				eleman_sayı++;
		}
		
	}
	public void yazdır() {
		if(dizi==null) {
			System.out.println("Lütfen dize boyutunu ayarlayıp diziyi yazdır seçeneğine basınız.");
		}
		else {
			System.out.print("Dizi:[");
			for(int i=0;i<dizi.length;i++) {
				System.out.print(dizi[i]);
				if(i!=dizi.length-1) {
					System.out.print(",");
				}
				
			}
			System.out.println("]");
		}
	}
	public void buble() {
		int b=0;
		boolean swap=true;
		for(int i=0;i<dizi.length-1;i++) {
																	// 1 2 3 4 ilk for 4 kez döncek dizi.lenght=4 j<4-1 den j <3 j 2.indekse göre arıyor zaten
			swap=false;
			for(int j=0;j<(dizi.length-1)-i;j++) {
				if(dizi[j]>dizi[j+1]) {
					b=dizi[j+1];
					dizi[j+1]=dizi[j];
					dizi[j]=b;
					swap=true;
				}
				
			}
		}
	}

}
