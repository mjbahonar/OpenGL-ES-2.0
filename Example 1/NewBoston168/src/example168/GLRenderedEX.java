package example168;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView.Renderer;


public class GLRenderedEX implements Renderer {

	
	//7- The rendered class implement Renderer
	//8- Add unimplemented methods, OnDraw,onSurfaceChange and onSurfaceCreated
	//	 Tip: It's better to bring up onSurfaceCreated
	//	 Tip: It might be better if you change some default arguments
	//	 OnSurfaceCreate is called when our surface is created
	//	 onDrawFrame change the screen - this is the part that refreshed
	//	 onSurfaceChange is when screen is changed like when screen in cjnge from landscape to portraite. It's basiclly changes every thing seted up
	//9- glClearColor is setting the color and then we should mask
	
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig eglConfig) {
		// TODO Auto-generated method stub
		gl.glClearColor(0.8f, 0f, 0.1f, 1f);
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		gl.glClearDepthf(1);
		
	}
	
	@Override
	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	
}
