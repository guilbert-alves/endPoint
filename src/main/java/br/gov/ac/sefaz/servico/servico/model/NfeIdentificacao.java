package br.gov.ac.sefaz.servico.servico.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "NFE_IDENTIFICACAO", schema = "NFE")
public class NfeIdentificacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(
            name = "CHAVE_ACESSO"
    )
    private String chaveAcesso;
    @Column(
            name = "CNPJ_CPF_DESTINATARIO"
    )
    private String cnpjCpfDestinatario;
    @Column(
            name = "CNPJ_CPF_EMITENTE"
    )
    private String cnpjCpfEmitente;
    @Column(
            name = "DATA_EMISSAO"
    )
    private String dataEmissao;

    public NfeIdentificacao() {
    }

    public String getChaveAcesso() {
        return this.chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getCnpjCpfDestinatario() {
        return this.cnpjCpfDestinatario;
    }

    public void setCnpjCpfDestinatario(String cnpjCpfDestinatario) {
        this.cnpjCpfDestinatario = cnpjCpfDestinatario;
    }

    public String getCnpjCpfEmitente() {
        return this.cnpjCpfEmitente;
    }

    public void setCnpjCpfEmitente(String cnpjCpfEmitente) {
        this.cnpjCpfEmitente = cnpjCpfEmitente;
    }

    public String getDataEmissao() {
        return this.dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.chaveAcesso, this.cnpjCpfDestinatario, this.cnpjCpfEmitente, this.dataEmissao});
    }

    public boolean equals(Object obj) {
<<<<<<< HEAD
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            NfeIdentificacao other = (NfeIdentificacao) obj;
            return Objects.equals(this.chaveAcesso, other.chaveAcesso) && Objects.equals(this.cnpjCpfDestinatario, other.cnpjCpfDestinatario) && Objects.equals(this.cnpjCpfEmitente, other.cnpjCpfEmitente) && Objects.equals(this.dataEmissao, other.dataEmissao);
        }
=======

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;
        
        NfeIdentificacao other = (NfeIdentificacao) obj;
        return Objects.equals(chaveAcesso, other.chaveAcesso)
                && Objects.equals(cnpjCpfDestinatario, other.cnpjCpfDestinatario)
                && Objects.equals(cnpjCpfEmitente, other.cnpjCpfEmitente)
                && Objects.equals(dataEmissao, other.dataEmissao);
>>>>>>> reswerva2
    }

    public String toString() {
        return "NfeIdentificacao [chaveAcesso=" + this.chaveAcesso + ", cnpjCpfDestinatario=" + this.cnpjCpfDestinatario + ", cnpjCpfEmitente=" + this.cnpjCpfEmitente + ", dataEmissao=" + this.dataEmissao + "]";
    }
}

