package com.example.projectbp2665

import java.util.Objects

class Login {
    var username = ""
    var password = ""

    fun loginCheck(): Boolean {
        if (Objects.equals(username, "sani") && Objects.equals(password, "amikom")) {
            return true
        } else {
            return false
        }
    }
}
