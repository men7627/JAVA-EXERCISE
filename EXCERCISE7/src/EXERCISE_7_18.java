class Robot{}
class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�~");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �մϴ�~");
	}
}
class DrawRobot extends Robot{
	void Draw() {
		System.out.println("�׸� �׸���~");
	}
}
public class EXERCISE_7_18 {
	static void action(Robot robo){
		
		if(robo instanceof DanceRobot) ((DanceRobot)robo).dance(); //�θ� Ŭ������ ���������� ���� �� �ڽ�Ŭ������ ��ü ���� ���˻� �Ͽ� 
		if(robo instanceof SingRobot)  ((SingRobot)robo).sing();   //����� ����ȯ �� ������ �´� �޼ҵ� ����
		if(robo instanceof DrawRobot)  ((DrawRobot)robo).Draw();
	}
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length;i++)
			action(arr[i]);
	}

}
