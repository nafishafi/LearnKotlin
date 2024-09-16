package com.dicoding.kotlin.`basic-kotlin`

fun main(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
//  val isOpen : Boolean
//  && (AND)
    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")
//  ============
//    SIMPEL
//    val isOpen = now >= officeOpen && now <= officeClosed
//
//    print("Office is open : $isOpen"

//    ===========
//    || (OR)
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")
//    ===========
//    ! (NOT)
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}