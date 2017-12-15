package example168;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class GLExample extends Activity {

	//CREATED BY opengles2.wordpress.com
	//1- Build 3 classes on src folder
	//2- extend the activity class on Activity
	//3- Create OpenGL object: GLSurafceView
	//	 on the onCreate function you should refrence this as new serface view like as :ourSurface = new GLSurfaceView(this);
	//	 we have to set content view by this method on onCreate func = 
	//4- Create resume and pause method
	//	 Add onPause and on Resume onpause and resume functions
	
	
	//5- We should set rendered on onCreate: ourSurface.setRenderer(new GLRenderedEX());
	//6- Next steps go on Rendered Class
	
	GLSurfaceView ourSurface;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ourSurface = new GLSurfaceView(this);
		ourSurface.setRenderer(new GLRenderedEX());
		setContentView(ourSurface);
	}
	

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSurface.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		ourSurface.onResume();
	}

	
}
