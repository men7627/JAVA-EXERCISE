
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
		//���� ������ �޼ҵ� ����
		//�� ����ϸ� ����� ��ٱ��Ͽ� ����(addȣ��)
		if(this.money < p.price) {
			System.out.println("�� ����");
			return;
		}
		money -= p.price;
		add(p);
		
	}
	void add(Product p) {
		//��ٱ��� ������ 2�� ū �迭 ���� �� ����
		//���� ��ٱ��Ͽ� ���� �ε��� ����
		if(this.cart.length==this.index) {
			Product[] temp = new Product[index*2]; 
			for(int i=0;i<this.cart.length;i++)
				temp[i] = this.cart[i];
			this.cart = temp;
		}
		this.cart[index++] = p;
	}
	void summary() {
		//��ٱ��Ͽ� ��� ��� ���
		//���� ���ؼ� ���
		//���� �ݾ� ���
		
		for(int i=0; i<this.index;i++)
			System.out.print(this.cart[i].toString()+" ");
		System.out.println();
		int sum=0;
		for(int i =0; i<this.index ;i++) {
			sum+=this.cart[i].price;
		}
		System.out.println("�Ѿ� : "+sum);
		System.out.println("�����ݾ� : "+this.money);
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
