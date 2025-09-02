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
	    
	    public void setCorAt(String corPar) {
	        this.corAt = corPar;
	    }

	    public void setMarcaAt(String marcaPar) {
	        this.marcaAt = marcaPar;
	    }

	    public void setModeloAt(String modeloPar) {
	        this.modeloAt = modeloPar;
	    }

	    public void setTipoAt(String tipoPar) {
	        this.tipoAt = tipoPar;
	    }
		

	}
	


