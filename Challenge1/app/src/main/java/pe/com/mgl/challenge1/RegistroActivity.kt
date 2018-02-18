package pe.com.mgl.challenge1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        btnAceptar.setOnClickListener {
            val nick:String = edtNick.text.toString()
//            Toast.makeText(this, "nick: $nick", Toast.LENGTH_LONG).show()
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("nick", nick)
            startActivity(intent)
        }
    }

}
