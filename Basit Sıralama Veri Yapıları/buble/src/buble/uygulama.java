package buble;

public class uygulama {

	public static void main(String[] args) {
		bublesort bs=new bublesort();
		bs.Liste_Eleman(8);
		bs.Eleman_ekle(6);
		bs.Eleman_ekle(15);
		bs.Eleman_ekle(8);
		bs.Eleman_ekle(1);
		bs.Eleman_ekle(99);
		bs.Eleman_ekle(65);
		bs.Eleman_ekle(75);
		bs.Eleman_ekle(36);
		bs.yazdır();
		bs.buble();
		bs.yazdır();

	}

}
