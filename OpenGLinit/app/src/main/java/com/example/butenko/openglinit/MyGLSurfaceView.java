package com.example.butenko.openglinit;


//для работы с OpenGL  нужна данная библиотека
import android.opengl.GLSurfaceView;
//для работы с контекстом окна нужна эта библиотека
import android.content.Context;
//библиотека отслеживающая события нажатия  на экран
import android.view.MotionEvent;


/**
 * Created by butenko on 05.08.2015.
 */
public class MyGLSurfaceView extends GLSurfaceView  {

    //ссылка на описание параметров рисования
    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        // создаем OpenGL 2 версии .
        setEGLContextClientVersion(2);

        // задаем поверхность для рисования нашей сцены
        mRenderer = new MyGLRenderer();
        setRenderer(mRenderer);

        // задаем параметр обновления экрана
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

}
