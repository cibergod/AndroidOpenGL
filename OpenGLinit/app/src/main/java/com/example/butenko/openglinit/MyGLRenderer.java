package com.example.butenko.openglinit;

//библиотеки работы с графикой
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
/*библотеки потдерживающие типы данный настроек OpenGL*/
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/**
 * Created by butenko on 05.08.2015.
 */
public class MyGLRenderer
    //класс наследуюеться из GLSurfaceView.Renderer
        implements GLSurfaceView.Renderer {

    //переписываем функцию на свой лад
    @Override
    public void onSurfaceCreated(GL10 unused, EGLConfig config)
    {
        // Задаем цвет очистки экрана
        GLES20.glClearColor(1, 1, 1, 1.0f);


    }
    //переписываем функцию на свой лад
    @Override
    public void onDrawFrame(GL10 unused)
    {
        // Очистка окна заданным цветом
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);


    }
    //переписываем функцию на свой лад
    @Override
    public void onSurfaceChanged(GL10 unused, int width, int height) {
        // при изменении окна меняем его параметры чтобы подогнать под размер вида

        GLES20.glViewport(0, 0, width, height);
    }
}
