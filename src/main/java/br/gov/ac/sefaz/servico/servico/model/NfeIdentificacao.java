package br.gov.ac.sefaz.servico.servico.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NfeIdentificacao implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CHAVE_ACESSO")
    private String chaveAcesso;

    @Column(name = "CNPJ_CPF_DESTINATARIO")
    private String cnpjCpfDestinatario;

    @Column(name = "CNPJ_CPF_EMITENTE")
    private String cnpjCpfEmitente;

    @Column(name = "DATA_EMISSAO")
    private String dataEmissao;

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getCnpjCpfDestinatario() {
        return cnpjCpfDestinatario;
    }

    public void setCnpjCpfDestinatario(String cnpjCpfDestinatario) {
        this.cnpjCpfDestinatario = cnpjCpfDestinatario;
    }

    public String getCnpjCpfEmitente() {
        return cnpjCpfEmitente;
    }

    public void setCnpjCpfEmitente(String cnpjCpfEmitente) {
        this.cnpjCpfEmitente = cnpjCpfEmitente;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chaveAcesso, cnpjCpfDestinatario, cnpjCpfEmitente, dataEmissao);
    }

    @Override
    public boolean equals(Object obj) {
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
    }

    @Override
    public String toString() {
        return "NfeIdentificacao [chaveAcesso=" + chaveAcesso + ", cnpjCpfDestinatario=" + cnpjCpfDestinatario
                + ", cnpjCpfEmitente=" + cnpjCpfEmitente + ", dataEmissao=" + dataEmissao + "]";
    }



}
