package pe.com.mgl.challenge1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Debug
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.util.Log.d
import android.view.View
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.activity_welcome.*
import org.json.JSONObject
import pe.com.mgl.challenge1.R.id.*

class RegistroActivity : AppCompatActivity(), Response.ErrorListener {
    override fun onErrorResponse(error: VolleyError?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        /*btnAceptar.setOnClickListener {
            val nick:String = edtNick.text.toString()
//            Toast.makeText(this, "nick: $nick", Toast.LENGTH_LONG).show()
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("nick", nick)
            startActivity(intent)
        }*/
    }

    fun registrar(view: View) {
        val url = Uri.parse("http://192.168.1.22/Proyectos/Rest/Service/api.php").buildUpon()
                .appendQueryParameter("name", edtNombre.text.toString())
                .build().toString()

        d("Code7", url)

        val req = JsonObjectRequest(Request.Method.GET,
                url,
                null,
                Response.Listener<JSONObject> {response ->
                    d("code7", "Volley Exito")
                    d("code7", response.getString("data"))
//                    JSONObject.quote("data");
                },
                Response.ErrorListener {
                    d("code7", "oops")

        })

        VolleyHelper.getInstance(applicationContext).addToRequestQueue(req)




    }

}
