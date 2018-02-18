package pe.com.mgl.challenge1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Invocar al método onCreate del padre
        // Cada vez que se cambia la orientación del movil, la actividad se vuelve a crear
        // savedInstanceState guarda valores en la memoria
        super.onCreate(savedInstanceState)

        //Asignar el archivo layout a esta actividad
        setContentView(R.layout.activity_home)
    }
}
