package JavaCore22.task_1;

public class Main {
	
	public static void main(String[] args) {
		Pet cow = () -> "ћуу... я - корова";
		Pet cat = () -> "ћ€уу... я - к≥т";
		Pet dog = () -> "√ав-гав... я - пес";
		
		voice(cow.voice(), "ћ≥лка");
		voice(cat.voice(), "ћурка");
		voice(dog.voice(), "–екс");	
	}

	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name + "!");
	}
}
