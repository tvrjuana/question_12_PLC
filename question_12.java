import java.io.*;

public class question_12 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Esoteric programming language - brainfuck lexical analyzer
		try (FileReader file = new FileReader("C:\\Users\\tvrju\\OneDrive\\Desktop\\brainfuck.txt")) {
			int i;
			
			while ((i = file.read()) != -1) {
				switch (i) {
				case '>':
					System.out.println("> is operator");
					break;
				case '<':
					System.out.println("< is operator");
					break;
				case '+':
					System.out.println("+ is operator");
					break;
				case '-':
					System.out.println("- is operator");
					break;
				case '.':
					System.out.println(". is function ");
					break;
				case ',':
					System.out.println(", is function");
					break;
				case '[':
					System.out.println("[ is loop identifier ");
					break;
				case ']':
					System.out.println("] is end of loop identifier");
					break;
				default:
					System.out.println("Character not valid in Brainfuck");
					break;
				}
			}
		}
	}

}
