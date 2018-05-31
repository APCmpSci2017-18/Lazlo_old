package Try_Google_Speech_Recognition_Simple;

public class Dummy {

	public static void main(String[] args) {
		Servo servoo = new Servo();
		
		/*servoo.write(180);
		normalize(servoo.read());
		servoo.write(135);
		normalize(servoo.read());
		servoo.write(90);
		normalize(servoo.read());
		servoo.write(45);
		normalize(servoo.read());
		servoo.write(0);
		normalize(servoo.read());*/
		
		for(int i = 0; i <= 180; i++){
			
			System.out.println(i + " = " + normalize(i));
			
		}
		
	}
	
	public static int normalize(int angle){

		angle *= 250./180.;
		
		return angle;
		
	}

}
