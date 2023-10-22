package carro.comportamentos.mecanismos;

public class ComportamentoMecanismosDevagar implements ComportamentoMecanismos{
	@Override
	public void mover() {
		System.out.println("Movendo devagar.");
		
	}

	@Override
	public void freiar() {
		System.out.println("Freiando devagar.");
		
	}

	@Override
	public void baixarVidro() {
		System.out.println("Baixando vidros devagar.");
		
	}

	@Override
	public void subirVidro() {
		System.out.println("Subindo vidros devagar.");
		
	}
}
