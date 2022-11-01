public class App{
	public static void main(String[] args){
		int count = 140;
		float a = 1.0f*count/20;
		if(a - (int)a > 0){
			a += 1;
		}
		System.out.println((int)a);
	}
}
