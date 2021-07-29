package br.gov.ac.sefaz.servico.servico.controller;

import br.gov.ac.sefaz.servico.servico.repository.NfeIdentificacaoRepository;
import br.gov.ac.sefaz.servico.servico.service.NfeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import br.gov.ac.sefaz.servico.servico.model.NfeIdentificacao;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/nfe")
public class NfeController {

    @Autowired
    private NfeService nfeService;

    @GetMapping(path = "/emitente/{cpfCnpj}")
    public ResponseEntity<?> getNfeForEmitente(@PathVariable(name = "cpfCnpj") String documento) {
        List<NfeIdentificacao> response = nfeService.nomeDeSuaEscolha(documento);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }

}
