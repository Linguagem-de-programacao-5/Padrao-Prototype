public class Template implements Cloneable{
    String logo;
    String assunto;
    String nomeEmpresa;
    String cnpj;
    String redesSociais;
    String ouvidoria;
    String rua;
    int numero;
    String cep;
    String cidade;
    String siglaEstado;

    public Template(String logo, String assunto, String nomeEmpresa, String cnpj, String redesSociais, String ouvidoria, String rua, int numero, String cep, String cidade, String siglaEstado) {
        super();
        this.logo = logo;
        this.assunto = assunto;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.redesSociais = redesSociais;
        this.ouvidoria = ouvidoria;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.siglaEstado = siglaEstado;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(String redesSociais) {
        this.redesSociais = redesSociais;
    }

    public String getOuvidoria() {
        return ouvidoria;
    }

    public void setOuvidoria(String ouvidoria) {
        this.ouvidoria = ouvidoria;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Template{" +
                "logo='" + logo + '\'' +
                ", assunto='" + assunto + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", redesSociais='" + redesSociais + '\'' +
                ", ouvidoria='" + ouvidoria + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", siglaEstado='" + siglaEstado + '\'' +
                '}';
    }
}
