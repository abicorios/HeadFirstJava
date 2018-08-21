public class BeerSong {
	public static void main(String[]args){
		int beerNum=99;
		String word="бутылок";
		while(beerNum>0){
			System.out.println(beerNum+" "+word+" пива на стене");
			System.out.println(beerNum+" "+word+" пива.");
			System.out.println("Возьми одну.");
			System.out.println("Пусти по кругу.");
			beerNum-=1;
			if(beerNum>=2||beerNum<=4){
				word="бутылки";
			}
			if(beerNum>=5){
				word="бутылок";
			}
			if(beerNum==1){
				word="бутылка";
			}
			if(beerNum>0){
			System.out.println(beerNum+" "+word+" пива на стене");
			} else {
			System.out.println("Нет бутылок пива на стене");
			}
		}
	}
}
