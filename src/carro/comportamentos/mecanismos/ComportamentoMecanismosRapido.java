package carro.comportamentos.mecanismos;

public class ComportamentoMecanismosRapido implements ComportamentoMecanismos{

	@Override
	public void mover() {
		System.out.println("Movendo rápido.");
		
	}

	@Override
	public void freiar() {
		System.out.println("Freiando rápido.");
		
	}

	@Override
	public void baixarVidro() {
		System.out.println("Baixando vidros rápido.");
		
	}

	@Override
	public void subirVidro() {
		System.out.println("Subindo vidros rápido.");
		
	}

}
