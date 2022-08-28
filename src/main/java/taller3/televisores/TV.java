package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	


	

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public TV(Marca marca, boolean estado) {
		super();
		this.marca = marca;
		this.estado = estado;
		numTV ++;
	}

	public Marca getMarca() {
		return marca;
	}

	public int getCanal() {
		return canal;
	}

	public int getPrecio() {
		return precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setCanal(int canal) {
		if (canal > 0 && canal <121 && this.estado) {
		this.canal = canal;
		}
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setVolumen(int volumen) {
		if (volumen > -1 && volumen < 8 && this.estado) {
		this.volumen = volumen;
		}
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (this.canal < 120 & this.estado) {
			canal ++;
		}
	}
	
	public void canalDown() {
		if (this.canal > 1 & this.estado) {
			canal --;
		}
	}
	
	public void volumenUp() {
		if (this.volumen < 7 & this.estado) {
			volumen ++;
		}
	}
	
	public void volumenDown() {
		if (this.volumen > 0 & this.estado) {
			volumen --;
		}
	}
}
