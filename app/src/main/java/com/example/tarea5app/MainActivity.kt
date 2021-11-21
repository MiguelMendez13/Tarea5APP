package com.example.tarea5app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tarea5app.databinding.ActivityMainBinding

import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val txtRes = binding.txtRes

        val gson = Gson()
        val boton = findViewById<Button>(R.id.button)
        binding.button.setOnClickListener{
            println("Presionado")
            val txtNombre = binding.txtNombre.text.toString()
            val txtCorreo = binding.txtCorreo.text.toString()
            val txtTelefono = binding.txtTelefono.text.toString()
            val txtEdad = binding.txtEdad.text.toString()
            val txtCurp = binding.txtCurp.text.toString()
            val txtEstado = binding.txtEstado.text.toString()
            val texto = Texto()

            texto.Nombre = txtNombre
            texto.Correo = txtCorreo
            texto.Telefono = txtTelefono
            texto.Edad = txtEdad
            texto.Curp = txtCurp
            texto.Estado = txtEstado

            val TextoRes="Resultado:    "+gson.toJson(texto)
            txtRes.text=TextoRes
        }



    }
}

class Texto{
    var Nombre=""
    var Correo=""
    var Telefono=""
    var Edad=""
    var Curp=""
    var Estado=""
}