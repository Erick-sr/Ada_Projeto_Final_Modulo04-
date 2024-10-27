package entities;

public class Ocorrencia {
    private Integer codigoOcorrencia;
    private String classificacao;
    private String tipo;
    private String localidade;
    private String uf;
    private String diaOcorrencia;

    public Ocorrencia(Integer codigoOcorrencia, String classificacao, String tipo, String localidade, String uf, String diaOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
        this.classificacao = classificacao;
        this.tipo = tipo;
        this.localidade = localidade;
        this.uf = uf;
        this.diaOcorrencia = diaOcorrencia;
    }

    public int getCodigoOcorrencia() {
        return codigoOcorrencia;
    }

    public void setCodigoOcorrencia(int codigoOcorrencia) {
        this.codigoOcorrencia = codigoOcorrencia;
    }

    public String getDiaOcorrencia() {
        return diaOcorrencia;
    }

    public void setDiaOcorrencia(String diaOcorrencia) {
        this.diaOcorrencia = diaOcorrencia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getAnoOcorrencia() {
        return diaOcorrencia != null && diaOcorrencia.length() >= 4 ? diaOcorrencia.substring(0, 4) : "Indefinido";
    }

    @Override
    public String toString() {
        return
                "codigoOcorrencia=" + codigoOcorrencia +
                        ", classificacao= " + classificacao +
                        ", tipo= " + tipo +
                        ", localidade= " + localidade +
                        ", uf='" + uf +
                        ", diaOcorrencia='" + diaOcorrencia;
    }
}
