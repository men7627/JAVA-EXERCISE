class Robot{}
class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다~");
	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다~");
	}
}
class DrawRobot extends Robot{
	void Draw() {
		System.out.println("그림 그리기~");
	}
}
public class EXERCISE_7_18 {
	static void action(Robot robo){
		
		if(robo instanceof DanceRobot) ((DanceRobot)robo).dance(); //부모 클래스의 참조변수로 참조 된 자식클래스의 객체 들을 형검사 하여 
		if(robo instanceof SingRobot)  ((SingRobot)robo).sing();   //명시적 형변환 후 각각에 맞는 메소드 실행
		if(robo instanceof DrawRobot)  ((DrawRobot)robo).Draw();
	}
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length;i++)
			action(arr[i]);
	}

}
