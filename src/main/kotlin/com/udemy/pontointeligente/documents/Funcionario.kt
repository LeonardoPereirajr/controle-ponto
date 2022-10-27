package com.udemy.pontointeligente.documents

import com.udemy.pontointeligente.enums.PerfilEnum
import org.springframework.data.annotation.Id

data class Funcionario(
    val nome: String,
    val email: String,
    val senha: String,
    val cpf: String,
    val perfil: PerfilEnum,
    val empresaId: String?,
    val valorHora: Double? = 0.0,
    val qtdHorasTrabalhoDia: Float? = 0.0f,
    val qtdHorasAlmoco: Float? = 0.0f,

    @Id
    val id: String? = null
)