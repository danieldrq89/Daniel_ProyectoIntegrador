package retratosrobot;
import java.util.Scanner;


public class main {

	
	static void choose() {
		
		Scanner opt = new Scanner(System.in);
		boolean isFinished = false;
		boolean check = false;
		String[] face = {"","","","",""};
		String[][] data = {{"WWWWWWWWW","\\\\\\//////","\"|||||||\"","|||||||||"},
							{"|  o o  |","|-(· ·)-|","|-(o o)-","|  \\ /  |"},
							{"@   J   @","{   \"   }","[   j   ]","<   -   >"},
							{"|  ===  |","|   -   |","|  ___  ","|  ---  |"},
							{"\\_______/","\\,,,,,,,/","\\......./","\\mmmmmmm/"}};
		String[][] message = {{"OPCIÓN 1: WWWWWWWWW","OPCION 2: \\\\\\//////","OPCION 3: \"|||||||\"","OPCION 4: |||||||||\r\n"},
								{"OPCIÓN 1: |  o o  |","OPCION 2: |-(· ·)-","OPCION 3: |-(o o)-|","OPCION 4: |  \\\\ /  |"},
								{"OPCIÓN 1: @   J   @","OPCION 2: {   \"   }","OPCION 3: [   j   ]","OPCION 4: <   -   >"},
								{"OPCIÓN 1: |  ===  |","OPCION 2: |   -   |","OPCION 3: |  ___  |","OPCION 4: |  ---  |"},
								{"OPCIÓN 1: \\_______/","OPCION 2: \\,,,,,,,/","OPCION 3: \\......./","OPCION 4: \\mmmmmmm/"}};
		
		for(int i = 0;isFinished == false;i++){
			while(check == false) {
				if(i == 5) {
					System.out.println("Quieres crear una nueva cara?");
					System.out.println("1 SI 2 NO");
					int option = opt.nextInt();
					
					if(option == 1) {
						i = 0;
						for(int z = 0;z <= 4; z++) {
							System.out.println(face[z]);
						}
						System.out.println(" ");
					}else {
						isFinished = true;
						for(int z = 0;z <= 4; z++) {
							System.out.println(face[z]);
						}
						break;
					}
					
				}
				
				for(int j = 0;  j <= 3 ;j++) {
					System.out.println(message[i][j]);
				}
				
				int option = opt.nextInt();
				
				if(option == 1) {
					face[i] = data[i][option - 1];
					check = true;
					break;
				}else if(option == 2) {
					face[i] = data[i][option - 1];
					check = true;
					break;
				}else if(option == 3) {
					face[i] = data[i][option - 1];
					check = true;
					break;
				}else if(option == 4) {
					face[i] = data[i][option - 1];
					check = true;
					break;
				}else {
					System.out.println("Opcion incorrecta pruebe de nuevo");
				}

			}
			check = false;
			
			
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			
		choose();
		
		
	}

	
}
