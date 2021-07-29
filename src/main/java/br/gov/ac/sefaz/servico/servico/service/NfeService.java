package br.gov.ac.sefaz.servico.servico.service;


import br.gov.ac.sefaz.servico.servico.model.NfeIdentificacao;
import br.gov.ac.sefaz.servico.servico.repository.NfeIdentificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NfeService {

    @Autowired
    private NfeIdentificacaoRepository nfeIdentificacaoRepository;

    public List<NfeIdentificacao> nomeDeSuaEscolha(String documento) {
        documento = documento.replaceAll("[^0-9]", "");

        documento = documento.trim();

        if (documento.length() == 11 || documento.length() == 14) {
            return  nfeIdentificacaoRepository.findByCnpjCpfEmitente(documento);
        }

        return null;
    }


}
