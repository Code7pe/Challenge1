package pe.com.mgl.challenge1


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity

class HomeActivity : AppCompatActivity() {

   // lateinit var persona : String

    override fun onCreate(savedInstanceState: Bundle?) {
        // Invocar al método onCreate del padre
        // Cada vez que se cambia la orientación del movil, la actividad se vuelve a crear
        // savedInstanceState guarda valores en la memoria
        super.onCreate(savedInstanceState)

        //Asignar el archivo layout a esta actividad
        setContentView(R.layout.activity_home)

        // Declaración de variables
        var nombre = "Konrad" // var se puede modificar
        val apellido = "Code" // val es un constante

        nombre = "123"


    }

    fun ingresar(view: View) {


//        startActivity(intentFor<RegistroActivity>())
        startActivity<RegistroActivity>()
//        val intent = Intent(this, RegistroActivity::class.java)
//        startActivity(intent)

    }

}
