package br.gov.ac.sefaz.servico.servico.repository;

import br.gov.ac.sefaz.servico.servico.model.NfeIdentificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NfeIdentificacaoRepository extends JpaRepository<NfeIdentificacao, String> {

    public List<NfeIdentificacao> findByCnpjCpfEmitente(String cnpjCpfEmitente);

//    public List<NfeIdentificacaoRepository> findByCnpjCpfEmitenteContaining(String cnpjCpfEmitente);


}
