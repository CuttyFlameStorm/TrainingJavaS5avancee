package fr.eni.jse.demo.bo;

//par héritage la chauve souris est obligée de redéfinir la méthode communiquer
//par l'implémentation de l'interface Volant, la chauve souris est obligée de redéfinir la méthode voler
public class ChauveSouris extends Mammifere implements Volant {
	
	@Override
	public void communiquer() {
		System.out.println("ultra-sons");
	}

	@Override
	public void voler() {
		System.out.println("Chauve souris volante !");
		
	}
}
