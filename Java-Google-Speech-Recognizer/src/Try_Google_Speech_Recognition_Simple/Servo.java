package Try_Google_Speech_Recognition_Simple;


public class Servo {

	private int angle;
	private int pin;
	private int minPulse;
	private int maxPulse;

	public Servo(){

		//not sure what default angle is
		this(9 , 544 , 2400 , 0);


	}

	public Servo(int pin , int angle){

		this();
		this.pin = pin;
		this.angle = angle;

	}
	public Servo(int pin){

		this(pin , 544 , 2400 , 0);
	}

	public Servo(int pin , int min , int max , int angle){

		this.pin = pin;
		this.minPulse = min;
		this.maxPulse = max;
		this.angle = angle;

	}


	public int read(){

		return angle;

	}
	public void write(int angle){

		this.angle = angle;
		normalize(600 , 2400);

	}

	public void attach(int pin){

		this.pin = pin;
	}

	public void attach(int pin , int min , int max){

		this.pin = pin;
		minPulse = min;
		maxPulse = max;

	}
	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

	/**
	 * @return the minPulse
	 */
	public int getMinPulse() {
		return minPulse;
	}

	/**
	 * @param minPulse the minPulse to set
	 */
	public void setMinPulse(int minPulse) {
		this.minPulse = minPulse;
	}

	/**
	 * @return the maxPulse
	 */
	public int getMaxPulse() {
		return maxPulse;
	}

	/**
	 * @param maxPulse the maxPulse to set
	 */
	public void setMaxPulse(int maxPulse) {
		this.maxPulse = maxPulse;
	}

	/**Normalize the range of the angle from 0 to 180 to min to max
	 * @param min the lower bound on the new range
	 * @param max the upper bound on the new range*/
	public void normalize(int min , int max){

		angle =  (int)((max/180.) * (angle - min));

	}

}
