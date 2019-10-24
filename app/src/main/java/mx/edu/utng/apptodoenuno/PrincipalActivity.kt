package mx.edu.utng.apptodoenuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Se crea objeto para cargar menú
        val inflater: MenuInflater = menuInflater
        //Se indica el xml que contiene los items
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    // actions on click menu items
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.itmAPP -> {
            val intent = Intent(this, activity_viaje::class.java)

            startActivity(intent)
            true
        }
        R.id.itmInstalacion->{
            val intent = Intent(this, SimuladorPres::class.java)

            startActivity(intent)
            true


        }
        R.id.itmAcerca->{
            val intent = Intent(this, Install::class.java)

            startActivity(intent)
            true


        }
        R.id.itmSalir->{
            System.exit(0)
            true


        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }


}