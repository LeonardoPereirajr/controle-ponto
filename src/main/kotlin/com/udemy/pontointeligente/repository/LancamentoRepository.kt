package com.udemy.pontointeligente.repository

import com.udemy.pontointeligente.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.mongodb.repository.MongoRepository
import java.awt.print.Pageable

interface LancamentoRepository : MongoRepository<Lancamento,String>{

    fun findByfuncionarioId(funcionarioId: String, pageable: Pageable): Page<Lancamento>

}