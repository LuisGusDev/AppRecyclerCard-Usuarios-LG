package mx.edu.utng.recyclercardgds0343;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /* View Components (vistas a las que accede el controlador) */
    //Declarar un Recycler y un Adaptador
    RecyclerView recyclerUsuario;
    UsuarioAdaptador usuarioAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarElementos();
    }

    private void inicializarElementos() {
        recyclerUsuario=findViewById(R.id.recycler);
        recyclerUsuario.setLayoutManager(new LinearLayoutManager(this));
        //Se declara la lista sin datos
        List<Usuario> usuarioList = new ArrayList<>();

        //Cargar los datos en la lista por medio de un ciclo For
        for(int i=0; i<20; i++){
            usuarioList.add(new Usuario(i,"Nombre "+i,"apellido",
                    "https://kinsta.com/es/wp-content/uploads/sites/8/2018/09/invitar-usuario-compa%C3%B1%C3%ADa-1024x512.png",
                    "email@gmail.com"));

            //Hasta aquí llegamos en manejo de la imagen
        }//fin de for
        //Preparando el objeto Adaptador con la lista y contexto
        usuarioAdaptador=new UsuarioAdaptador(usuarioList, this);
        //Se utiliza el adaptador
        recyclerUsuario.setAdapter(usuarioAdaptador);

        Log.d("Msg","El tamaño de la lista es: " + usuarioList.size());
    }
}