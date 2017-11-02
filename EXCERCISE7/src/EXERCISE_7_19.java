
public class EXERCISE_7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int index=0;
	
	void buy(Product p) {
		//돈이 적으면 메소드 종료
		//돈 충분하면 계산후 장바구니에 담음(add호출)
		if(this.money < p.price) {
			System.out.println("돈 부족");
			return;
		}
		money -= p.price;
		add(p);
		
	}
	void add(Product p) {
		//장바구니 꽉차면 2배 큰 배열 생성 후 복사
		//물건 장바구니에 저장 인덱스 증가
		if(this.cart.length==this.index) {
			Product[] temp = new Product[index*2]; 
			for(int i=0;i<this.cart.length;i++)
				temp[i] = this.cart[i];
			this.cart = temp;
		}
		this.cart[index++] = p;
	}
	void summary() {
		//장바구니에 담긴 목록 출력
		//가격 더해서 출력
		//남은 금액 출력
		
		for(int i=0; i<this.index;i++)
			System.out.print(this.cart[i].toString()+" ");
		System.out.println();
		int sum=0;
		for(int i =0; i<this.index ;i++) {
			sum+=this.cart[i].price;
		}
		System.out.println("총액 : "+sum);
		System.out.println("남은금액 : "+this.money);
	}	   
}
class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}
}
class Tv extends Product{
	Tv() {super(100);}
	public String toString() {return "Tv";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}
