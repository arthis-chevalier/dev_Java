package test;
import java.util.Scanner;

public class ShoppingListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		String saisie;
		
		System.out.println("d�but du programme");
		try(Scanner sc =   new Scanner(System.in)){
			
			while(run == true) {
				for (int i = 0; i < ShoppingList.getItemCount(); i++) {
					ShoppingListItem item = ShoppingList.getItem(i);
					if(item.checked == false) {
						System.out.println(i + "." + item.description + "[ ]");
					}
					else {
						System.out.println(i + "." + item.description + "[x]");
					}
				}
				System.out.println("saisir: + pour ajouter / - pour supprimer / x pour check / stop pour arr�ter");
				saisie = sc.nextLine();
				if(saisie.equals("+")) {
					System.out.println("saisir l'objet � ajouter (tapper entr�e sans rien saisir pour sortir)");
					saisie = sc.nextLine();
					if (saisie.isEmpty() == false) {
						ShoppingListItem item = new ShoppingListItem(saisie);
						ShoppingList.add(item);
					}
				}
				else {
					if(saisie.equals("-")) {
						System.out.println("saisir le num�ro de l'objet � retirer (tapper entr�e sans rien saisir pour sortir)");
						saisie = sc.nextLine();
						if (saisie.isEmpty() == false) {
							if(IsInteger.isInteger(saisie)==true) {
								ShoppingList.remove(Integer.parseInt(saisie));
							}
							else {
								System.out.println("entr�e incorrect");
							}
						}
					}
					else {
						if(saisie.equals("x")) {
							System.out.println("saisir le num�ro de l'objet � checker / unchecker (tapper entr�e sans rien saisir pour sortir)");
							saisie = sc.nextLine();
							if (saisie.isEmpty() == false) {
								if(IsInteger.isInteger(saisie)==true) {
									ShoppingListItem item = ShoppingList.getItem(Integer.parseInt(saisie));
									item.setChecked();
								}
								else {
									System.out.println("entr�e incorrect");
								}
							}
						}
						else {
							if(saisie.equals("stop")) {
								sc.close();
								run = false;
							}
						}
					}
				}
			}
		}
		System.out.println("fin du programme");

	}

}
