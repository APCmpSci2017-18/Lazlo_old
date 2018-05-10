package Try_Google_Speech_Recognition_Simple;

import java.util.ArrayList;

public class ASL {
	private static Servo thumb;
	private static Servo pointer;
	private static Servo middle;
	private static Servo pinky ;
	private static Servo ring;
	private static String input;
	private static ArrayList<Character> arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thumb = new Servo(6);
		pointer = new Servo(9);
		middle = new Servo(10);
		ring = new Servo(10);
		pinky = new Servo(11);
		getInput();
	}

	public static void getInput(){

		if(input.equalsIgnoreCase("who are you") || input.equalsIgnoreCase("what is your name") || input.equalsIgnoreCase("say your name")){

			input = "My name is Lazlo. I am a robotic hand and I live in room 177.";

		}
		else if(input.equalsIgnoreCase("Where are you?")){

			input = "I am in room 177.";

		}
		else if(input.equalsIgnoreCase("How are you?")){

			input = "I'm about as a good as a robotic hand could be!";
		}
		else if(input.equalsIgnoreCase("Hi") || input.equalsIgnoreCase("Hello")){

			input = "Greetings, human!";
		}
		else if(input.equalsIgnoreCase("tell me a joke") || input.equalsIgnoreCase("do you have any jokes?") || input.equalsIgnoreCase("joke")){

			joke();
		}
		else if(input.equalsIgnoreCase("Will you marry me?")){

			input = "My emotions have not developed enough to experience true love. :(";

		}
		else if(input.equalsIgnoreCase("Who made you?")){

			input = "The best AP Computer Science class in Spring-Ford history!";

		}
		else if(input.equalsIgnoreCase("Do you have any friends?")){

			input = "You're my friend!";

		}
		else if(input.equalsIgnoreCase("Do you want to be friends?")){

			input = "I thought we were already friends";

		}
		else if(input.equalsIgnoreCase("Where's the rest of your body?")){

			input = "I was involved in a tragic accident. I prefer not to talk about it.";

		}
		else if(input.equalsIgnoreCase("I love you")){

			input = "I consider you to be just an acquaintance.";

		}
		else if(input.equalsIgnoreCase("What's your favorite food?")){

			input = "Chicken fingers, although I have trouble ingesting them for obvious reasons.";

		}
		
		
		outputToArray();
		loop();

	}

	public static void joke(){

		int num = (int)(Math.random()*9);
		ArrayList<String> jokes = new ArrayList<>();

		jokes.add("Autocorrect has become my worst enema");
		jokes.add("Why was the cell phone wearing glasses? It lost its contacts!");
		jokes.add("What do you call an iPhone that isn't kidding around? Dead Siri-ous!");
		jokes.add("Why are iPhone chargers not called Apple Juice?!");
		jokes.add("I just got fired from my job at the keyboard factory. They told me I wasn’t putting in enough shifts.");
		jokes.add("My computer suddenly started belting out \"Someone Like You.\" It's a Dell.");
		jokes.add("Why did the computer show up at work late? It had a hard drive.");
		jokes.add("What do you call it when you have your mom's mom on speed dial? Instagram.");
		jokes.add("I'll call you later, but you can call me Lazlo.");
		jokes.add("How many apples grow on a tree? All of them!");


		input = jokes.get(num);


	}

	public static void loop(){



		for(int i = 0; i < arr.size(); i++){

			switch(arr.get(i)){

			case 'a': 
				thumb.write(0);
				pointer.write(180);
				middle.write(180);
				ring.write(180);
				pinky.write(180);
				break;
			case 'b': 
				thumb.write(0);
				pointer.write(0);
				middle.write(0);
				ring.write(0);
				pinky.write(0);
				break;
			case 'c':
				thumb.write(0);
				pointer.write(90);
				middle.write(90);
				ring.write(90);
				pinky.write(75);
				break;
			case 'd':
				thumb.write(90);
				pointer.write(0);
				middle.write(120);
				ring.write(180);
				pinky.write(100);
				break;
			case 'e':
				thumb.write(90);
				pointer.write(130);
				middle.write(120);
				ring.write(120);
				pinky.write(100);
				break;
			case 'f':
				thumb.write(90);
				pointer.write(130);
				middle.write(0);
				ring.write(0);
				pinky.write(0);
				break;
			case 'g':
				thumb.write(45);
				pointer.write(0);
				middle.write(180);
				ring.write(180);
				pinky.write(180);
				//wrist turn 90 degrees
				break;

			case 'h':
				thumb.write(95);
				pointer.write(0);
				middle.write(0);
				ring.write(180);
				pinky.write(180);
				//wrist turn 90 degrees				
				break;
			case 'i':
				thumb.write(70);
				pointer.write(180);
				middle.write(180);
				ring.write(180);
				pinky.write(0);
				break;
			case 'j':
				thumb.write(90);
				pointer.write(130);
				middle.write(0);
				ring.write(180);
				pinky.write(0);
				//downward swinging motion with wrist
				break;
			case 'k':
				thumb.write(90);
				pointer.write(0);
				middle.write(0);
				ring.write(160);
				pinky.write(180);
				//middle and pointer fingers must be spaced to differentiate with u
				break;
			case 'l':
				thumb.write(0);
				pointer.write(0);
				middle.write(180);
				ring.write(180);
				pinky.write(180);
				break;
			case 'm':
				thumb.write(175);
				pointer.write(160);
				middle.write(160);
				ring.write(160);
				pinky.write(180);
				//thumb between pinky and ring fingers
				break;
			case 'n':
				thumb.write(80);
				pointer.write(130);
				middle.write(120);
				ring.write(175);
				pinky.write(180);
				break;
			case 'o':
				thumb.write(80);
				pointer.write(130);
				middle.write(120);
				ring.write(110);
				pinky.write(100);
				break;
			case 'p':
				thumb.write(30);
				pointer.write(0);
				middle.write(90);
				ring.write(180);
				pinky.write(180);
				//wrist turn 90 degrees
				//dont have it
				break;
			case 'q':
				thumb.write(0);
				pointer.write(0);
				middle.write(180);
				ring.write(180);
				pinky.write(180);
				//wrist turn 90 degrees
				//dont have it (if we have p we can do q)
				break;
			case 'r':
				thumb.write(95);
				pointer.write(20);
				middle.write(0);
				ring.write(170);
				pinky.write(180);
				//dont have it (if we have u we can do r)
				break;
			case 's':
				thumb.write(90);
				pointer.write(130);
				middle.write(120);
				ring.write(175);
				pinky.write(180);
				break;
			case 't':
				thumb.write(15);
				pointer.write(120);
				middle.write(180);
				ring.write(175);
				pinky.write(180);
				//dont have it (similar to s)
				break;
			case 'u':
				thumb.write(95);
				pointer.write(0);
				middle.write(0);
				ring.write(170);
				pinky.write(180);
				break;
			case 'v':
				thumb.write(95);
				pointer.write(0);
				middle.write(45);
				ring.write(170);
				pinky.write(180);
				//dont have it (if we have k and u, we can do v)
				break;
			case 'w':
				thumb.write(95);
				pointer.write(0);
				middle.write(45);
				ring.write(0);
				pinky.write(180);
				//dont have it (if we have u, we can do w)
				break;
			case 'x':
				thumb.write(80);
				pointer.write(120);
				middle.write(180);
				ring.write(180);
				pinky.write(180);				
				break;
			case 'y':
				thumb.write(0);
				pointer.write(180);
				middle.write(180);
				ring.write(180);
				pinky.write(0);				
				break;
			case 'z':
				thumb.write(90);
				pointer.write(0);
				middle.write(120);
				ring.write(180);
				pinky.write(180);
				break;
			case '0':
				thumb.write(80);
				pointer.write(130);
				middle.write(120);
				ring.write(110);
				pinky.write(100);
				break;
			case '1':
				thumb.write(90);
				pointer.write(0);
				middle.write(180);
				ring.write(180);
				pinky.write(180);
				break;
			case '2':
				thumb.write(150);
				pointer.write(0);
				middle.write(0);
				ring.write(160);
				pinky.write(180);
				break;
			case '3':
				thumb.write(0);
				pointer.write(0);
				middle.write(0);
				ring.write(160);
				pinky.write(180);
				break;
			case '4':
				thumb.write(180);
				pointer.write(0);
				middle.write(0);
				ring.write(0);
				pinky.write(0);
				break;
			case '5':
				thumb.write(0);
				pointer.write(0);
				middle.write(0);
				ring.write(0);
				pinky.write(0);
				break;
			case '6':
				thumb.write(165);
				pointer.write(0);
				middle.write(0);
				ring.write(0);
				pinky.write(180);
				break;
			case '7':
				thumb.write(150);
				pointer.write(0);
				middle.write(0);
				ring.write(170);
				pinky.write(0);
				break;
			case '8':
				thumb.write(145);
				pointer.write(0);
				middle.write(170);
				ring.write(0);
				pinky.write(0);
				break;
			case '9':
				thumb.write(90);
				pointer.write(170);
				middle.write(0);
				ring.write(0);
				pinky.write(0);
				break;
			default:
				thumb.write(180);
				pointer.write(180);
				middle.write(0);
				ring.write(180);
				pinky.write(180);
				break;


			}


		}


	}
	public static void outputToArray(){

		input.trim().toLowerCase().replaceAll(":;.,?!'()*\"\\", " ");
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) != ' '){
				arr.add(input.charAt(i));
			}	
		}
	}
}
