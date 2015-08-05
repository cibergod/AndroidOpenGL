package com.example.butenko.openglinit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//добавляем классы OpenGL
import android.opengl.GLSurfaceView;

public class MainActivity extends AppCompatActivity {

    //ссылка на наш OpenGL
    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //связываем наш OpenGL с окном в котором будем рисовать
        mGLView = new MyGLSurfaceView(this);
        //передаем ссылку в на наш класс
        setContentView(mGLView);

    }

    //событие срабатывает во время паузы (скрытия экрана )
    @Override
    protected void onPause() {
        super.onPause();
        mGLView.onPause();
    }

    //событие срабатывает во время показа экрана
    @Override
    protected void onResume() {
        super.onResume();
        mGLView.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
