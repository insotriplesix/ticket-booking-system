package com.github.saboteur.ticketbookingsystem.ticketbookingservice.dto

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(value = "User")
data class UserDto(

    @ApiModelProperty(value = "login")
    val login: String,

    @ApiModelProperty(value = "email")
    val email: String,

    @ApiModelProperty(value = "isAdmin")
    val isAdmin: Boolean,

    @ApiModelProperty(value = "clientProfile")
    val clientProfile: ClientProfileDto?

) {
    companion object {
        val empty = UserDto(
            login = "",
            email = "",
            isAdmin = false,
            clientProfile = null
        )
    }
}