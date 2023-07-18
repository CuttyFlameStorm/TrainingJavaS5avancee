package fr.eni.jse.demo.bo;

//par héritage le chat est obligé de redéfinir la méthode communiquer
public class Chat extends Mammifere{
	@Override
	public void communiquer() {
		System.out.println("Miaou");
	}

}

