package entities;

public class Aeronave {
    private Integer codigoAeronave; // [0]
    private Integer codigoOcorrencia; //[1]
    private String equipamento; //[5]
    private String fabricante; //[6]
    private String modelo; //[7]
    private String tipoOperacao;//[19]
    private int quantidadeDeFatalidade;
    private String categoriaAviacao;//[20]

    public Aeronave(int codigoAeronave,
                    int codigoOcorrencia,
                    String equipamento,
                    String fabricante,
                    String modelo,
                    String tipoOperacao,
                    Integer quantidadeDeFatalidade,
                    String categoriaAviacao) {
        super();
        this.codigoAeronave = codigoAeronave;
        this.codigoOcorrencia = codigoOcorrencia;
        this.equipamento = equipamento;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipoOperacao = tipoOperacao;
        this.quantidadeDeFatalidade = quantidadeDeFatalidade;
        this.categoriaAviacao = categoriaAviacao;
    }

    public Integer getCodigoAeronave() {
        return codigoAeronave;
    }

    public void setCodigoAeronave(Integer codigoAeronave) {
        this.codigoAeronave = codigoAeronave;
    }

    public Integer getQuantidadeDeFatalidade() {
        return quantidadeDeFatalidade;
    }

    public void setQuantidadeDeFatalidade(Integer quantidadeDeFatalidade) {
        this.quantidadeDeFatalidade = quantidadeDeFatalidade;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public Integer getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(Integer codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public void setQuantidadeDeFatalidade(int quantidadeDeFatalidade) {
        this.quantidadeDeFatalidade = quantidadeDeFatalidade;
    }

    public String getCategoriaAviacao() {
        return categoriaAviacao;
    }

    public void setCategoriaAviacao(String categoriaAviacao) {
        this.categoriaAviacao = categoriaAviacao;
    }

    @Override
    public String toString() {
        return "Aeronave{" +
                "codigoAeronave=" + codigoAeronave +
                ", codigoOcorrencia=" + codigoOcorrencia +
                ", equipamento='" + equipamento + '\'' +
                ",       fabricante='" + fabricante + '\'' +
                ",       modelo='" + modelo + '\'' +
                ",   tipoOperacao='" + tipoOperacao + '\'' +
                ", quantidadeDeFatalidade=" + quantidadeDeFatalidade +
                '}';
    }
}
