package disciplina1.unidade4.sisalucar;

public class Onibus extends Veiculo {
	
	private float velocidade;
	private int passageiros = 40;
	
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

	public void acelera() {
		
		System.out.println("O onibus está acelerando: " + this.velocidade + "km/h");
		
	}

	public void freia() {
		
		System.out.println("O onibus está freindo!");
	}

}
