package model;

public class Rettangolo {
	private Segmento base,altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	public Segmento getBase() {
		return base;
	}

	public void setBase(Segmento base) {
		this.base = base;
	}

	public Segmento getAltezza() {
		return altezza;
	}

	public void setAltezza(Segmento altezza) {
		this.altezza = altezza;
	}
	
	public double perimetro() {
		return (base.lunghezza()+altezza.lunghezza())*2;
	}
	
	public double area() {
		return base.lunghezza() * altezza.lunghezza();
	}
}
