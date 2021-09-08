package bean;

public class PagamentoBean {
	private int idPagamento;
	private String dataPagamento;
	private double importoPagamento;
	private String descPagamento;
	private int idOrdine;
	
	public PagamentoBean() {
		idPagamento=-1;
		dataPagamento="";
		importoPagamento=-1;
		descPagamento="";
		idOrdine=-1;
	}

	public int getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getImportoPagamento() {
		return importoPagamento;
	}

	public void setImportoPagamento(double importoPagamento) {
		this.importoPagamento = importoPagamento;
	}

	public String getDescPagamento() {
		return descPagamento;
	}

	public void setDescPagamento(String descPagamento) {
		this.descPagamento = descPagamento;
	}

	public int getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}
}
