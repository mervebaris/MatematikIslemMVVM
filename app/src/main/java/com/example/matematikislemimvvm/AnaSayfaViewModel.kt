package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnaSayfaViewModel : ViewModel() {
    var sonuc = MutableLiveData("0")

    fun topla(alinanSayi1:String, alinanSayi2:String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2

        sonuc.value = toplam.toString()
    }
}

