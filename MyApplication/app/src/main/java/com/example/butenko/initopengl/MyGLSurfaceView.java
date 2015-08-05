package com.example.butenko.initopengl;

//для работы с OpenGL  нужна данная библиотека
import android.opengl.GLSurfaceView;
//для работы с контекстом окна нужна эта библиотека
import android.content.Context;
//библиотека отслеживающая события нажатия  на экран
import android.view.MotionEvent;



public class MyGLSurfaceView extends GLSurfaceView {

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

    //обработка нажатия на экран
    @Override
    public boolean onTouchEvent(MotionEvent e) {

        //когда пользователь нажал на экран мы считываем позицию куда он нажал
        float x = e.getX();
        float y = e.getY();

        //если он чет нажал вернем правду например чтобы обновить окно
        return true;
    }

}
