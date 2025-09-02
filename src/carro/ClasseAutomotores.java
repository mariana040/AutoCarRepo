package carro;

public class ClasseAutomotores {
	
	String corAt;
	String marcaAt;
	String modeloAt;
	String tipoAt;
	
	public  ClasseAutomotores(){	
	}
	
	public ClasseAutomotores(String corPar, String marcaPar, String modeloPar, String tipoPar) {
        this.corAt = corPar;
        this.marcaAt = marcaPar;
        this.modeloAt = modeloPar;
        this.tipoAt = tipoPar;
    }
	
	 public String getCorAt() {
	        return corAt;
	    }
	    public String getMarcaAt() {
	        return marcaAt;
	    }

	    public String getModeloAt() {
	        return modeloAt;
	    }
	    public String getTipoAt() {
	        return tipoAt;
	    }
	
}

