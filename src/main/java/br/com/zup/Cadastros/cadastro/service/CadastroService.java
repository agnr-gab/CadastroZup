package br.com.zup.Cadastros.cadastro.service;

import br.com.zup.Cadastros.cadastro.Cadastro;
import br.com.zup.Cadastros.cadastro.repositories.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public Cadastro cadastrarPessoa (Cadastro cadastro) {
        Cadastro cadastroPessoa = new Cadastro();

        cadastro.setCpf(cadastro.getCpf());
        cadastro.setNome(cadastro.getNome());
        cadastro.setSobrenome(cadastro.getSobrenome());
        cadastro.setCidade(cadastro.getCidade());
        cadastro.setBairro(cadastro.getBairro());
        cadastro.setNomeDoParenteProximo(cadastro.getNomeDoParenteProximo());
        cadastro.setMoraSozinho(cadastro.isMoraSozinho());
        cadastro.setTemPet(cadastro.isTemPet());
        cadastro.setIdade(cadastro.getIdade());
        cadastro.setDataDoCadastro(cadastro.getDataDoCadastro());
        cadastroRepository.save(cadastro);
        return cadastro;
    }

    public List<Cadastro> exibirListaCadastro () {
        Iterable<Cadastro> listaCadastros = cadastroRepository.findAll();
        return (List<Cadastro>) listaCadastros;
    }

   /* public Cadastro burcarPorMoraSozinho (boolean moraSozinho) {
        Optional<Cadastro> cadastro = cadastroRepository.findAll(burcarPorMoraSozinho(moraSozinho));
    }*/
}
