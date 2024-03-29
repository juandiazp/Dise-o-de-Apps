package mx.edu.utng.apptodoenuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=6000 //mili seg(6 seg)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val animacion: Animation = AnimationUtils.loadAnimation(this, R.anim.animacion)
        txvUno.startAnimation(animacion)

        //Se inicia la actividad principal (Principal Activity)
        Handler().postDelayed({
            startActivity(Intent(this, PrincipalActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}
