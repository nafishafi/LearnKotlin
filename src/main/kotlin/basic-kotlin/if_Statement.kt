package com.dicoding.kotlin.`basic-kotlin`

fun main(){
    val openHours = 7
    val now = 20
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    println(office)

//    val openHours = 7
//    val now = 20
//    val office: String
//    office = if (now > openHours) {
//        "Office already open"
//    } else {
//        "Office is closed"
//    }
//
//    print(office)

//    Nested If
    val jamBuka = 7
    val sekarang = 7
    val kantor: String
    kantor = if (sekarang > 7) {
        "Office already open"
    } else if (now == jamBuka){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}