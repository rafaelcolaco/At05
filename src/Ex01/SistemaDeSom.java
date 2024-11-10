package Ex01;

public class SistemaDeSom extends EquipamentoEletronico {
	
	private String marca = "Sony";
	private String Modelo = "massa";
	private float potencia = 100;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.length() > 0)
		this.marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		if (Modelo.length() > 0)
		Modelo = modelo;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		if (potencia > 0)
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeSom [marca=");
		builder.append(marca);
		builder.append(", Modelo=");
		builder.append(Modelo);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
