public class EmailAutomatico implements Cloneable{
    String remetente;
    String destinatario;
    Template template;
    String mensagemPadrão;

    public EmailAutomatico(String remetente, String destinatario, Template template, String mensagemPadrão) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.template = template;
        this.mensagemPadrão = mensagemPadrão;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public String getMensagemPadrão() {
        return mensagemPadrão;
    }

    public void setMensagemPadrão(String mensagemPadrão) {
        this.mensagemPadrão = mensagemPadrão;
    }

    @Override
    public EmailAutomatico clone() throws CloneNotSupportedException {
        EmailAutomatico emailClone = (EmailAutomatico)  super.clone();
        emailClone.template = (Template) emailClone.template.clone();
        return emailClone;
    }

    @Override
    public String toString() {
        return "EmailAutomatico{" +
                "remetente='" + remetente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", template=" + template +
                ", mensagemPadrão='" + mensagemPadrão + '\'' +
                '}';
    }
}
