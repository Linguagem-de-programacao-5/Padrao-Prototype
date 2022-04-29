import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailAutomaticoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        EmailAutomatico email = new EmailAutomatico("empresaX@empresax.com", "pessoa1@gmail.com", new Template("EX","Promoção do produto y","Empresa X",
                "123.438.735.345-22","Insta: empresaX", "0800 000 000", "Rua dos bobos", 0,"000000-000", "Juiz de Fora","MG"),"Atenciosamente Equipe Empresa X");

        EmailAutomatico emailClone = email.clone();
        emailClone.setDestinatario("pessoa2@gmail.com");
        emailClone.getTemplate().setAssunto("Compra realizada com sucesso");

        assertEquals("EmailAutomatico{remetente='empresaX@empresax.com', destinatario='pessoa1@gmail.com', " +
                "template=Template{logo='EX', assunto='Promoção do produto y', nomeEmpresa='Empresa X', cnpj='123.438.735.345-22', " +
                "redesSociais='Insta: empresaX', ouvidoria='0800 000 000', rua='Rua dos bobos', numero=0, cep='000000-000', cidade='Juiz de Fora', " +
                "siglaEstado='MG'}, mensagemPadrão='Atenciosamente Equipe Empresa X'}", email.toString());


        assertEquals("EmailAutomatico{remetente='empresaX@empresax.com', destinatario='pessoa2@gmail.com', " +
                "template=Template{logo='EX', assunto='Compra realizada com sucesso', nomeEmpresa='Empresa X', cnpj='123.438.735.345-22'," +
                " redesSociais='Insta: empresaX', ouvidoria='0800 000 000', rua='Rua dos bobos', numero=0, cep='000000-000', cidade='Juiz de Fora'," +
                " siglaEstado='MG'}, mensagemPadrão='Atenciosamente Equipe Empresa X'}", emailClone.toString());
    }
}