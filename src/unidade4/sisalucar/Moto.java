package unidade4.sisalucar;

public class Moto extends Veiculo {


	private float velocidade;
	private int passageiros = 1;
	
	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public void acelera(int limiteVelocidade) {
		
		System.out.println("Obedeça o limite de velocidade: " + limiteVelocidade);
		
	}

	public void freia() {
		
		System.out.println("A moto está freindo!");
	}

}
