package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.user.JavaUser
import javax.persistence.*

@Entity
class UserLoanHistory(
    @ManyToOne
    val user: JavaUser,

    val bookName: String,

    var isReturn: Boolean,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
){
    fun doReturn() {
        this.isReturn = true
    }
}