package com.example.pertemuan_5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variable variable untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableMapOf(value="") }
    var textAlamat by remember { mutableListOf(value="") }
    var textJK by remember { mutableMapOf(value="") }

    //variabel-variable untuk menyimpan data yang di peroleh dari komponen UI
    var nama by remember { mutableMapOf(value="") }
    var alamat by remember { mutableMapOf(value="" }
    var jenis by remember { mutableMapOf(value="") }
    var gender:List<String> = listOf("laki-laki","perempuan")
}
