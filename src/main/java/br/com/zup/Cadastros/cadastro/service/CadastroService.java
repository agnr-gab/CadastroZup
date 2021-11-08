package br.com.zup.Cadastros.cadastro.service;

import br.com.zup.Cadastros.cadastro.Cadastro;
import br.com.zup.Cadastros.cadastro.repositories.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void cadastrarPessoa (Cadastro cadastro) {
        Cadastro cadastroPessoa = new Cadastro();

        cadastro.setCpf(cadastro.getCpf());
        cadastro.setNome(cadastro.getNome());
        cadastro.setSobrenome(cadastro.getSobrenome());
        cadastro.setCidade(cadastro.getCidade());
        cadastro.setBairro(cadastro.getBairro());
        cadastro.setNomeDoParenteProximo(cadastro.getNomeDoParenteProximo());
        cadastro.setMoraSozinho(cadastro.isMoraSozinho());
        cadastro.setTemPet(cadastro.isTemPet());

        cadastroRepository.save(cadastro);
    }
}
