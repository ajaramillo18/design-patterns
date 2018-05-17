import java.util.Date;

public class Siniestro {

	private String delincuente;	
	private int monto;	
	private Date fecha;	
	private boolean muertos;	
	private String aseguradora;
	
	public Siniestro(SiniestroBuilder builder) {
		
		this.delincuente = builder.delincuente;
		this.monto = builder.monto;
		this.fecha = builder.fecha;
		this.muertos = builder.muertos;
		this.aseguradora = builder.aseguradora;
		
	}
	
	
	//inner class
	
	static class  SiniestroBuilder {
		
		
		public SiniestroBuilder() {
			super();
		}

		private String delincuente;	
		private int monto;	
		private Date fecha;	
		private boolean muertos;	
		private String aseguradora;
		
		public SiniestroBuilder delincuente(String delincuente) {
			this.delincuente = delincuente;
			return this;
		}
		
		public SiniestroBuilder monto(int monto) {
			this.monto = monto;
			return this;
		}
		
		public SiniestroBuilder fecha(Date fecha) {
			this.fecha = fecha;
			return this;
		}
		
		public SiniestroBuilder muertos(boolean muertos) {
			this.muertos = muertos;
			return this;
		}
		
		public SiniestroBuilder aseguradora(String aseguradora) {
			this.aseguradora = aseguradora;
			return this;
		}
		
		public Siniestro build() {
			
			if(monto == 0) {
				throw new IllegalStateException("El monto no puede ser nulo");
				
			}
				
		
			return new Siniestro(this);
		}
		
		
	}
	
}	

	

