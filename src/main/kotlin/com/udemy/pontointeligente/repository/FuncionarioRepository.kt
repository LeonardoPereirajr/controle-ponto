package com.udemy.pontointeligente.repository

import com.udemy.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario,String>{
    fun findByemail(email: String): Funcionario?

    fun findBycpf(cpf: String): Funcionario?
}