package JavaCore22.task_1;

public class Main {
	
	public static void main(String[] args) {
		Pet cow = () -> "���... � - ������";
		Pet cat = () -> "����... � - ��";
		Pet dog = () -> "���-���... � - ���";
		
		voice(cow.voice(), "̳���");
		voice(cat.voice(), "�����");
		voice(dog.voice(), "����");	
	}

	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name + "!");
	}
}
