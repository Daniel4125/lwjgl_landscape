package landscape;

import org.lwjgl.glfw.*;
import static org.lwjgl.opengl.GL11.glViewport;
import landscape.IGameLogic;
import landscape.Window;

public class Game implements IGameLogic {
	private int direction = 0;

    private float color = 0.0f;

    private final Renderer renderer;

    public Game() {
        renderer = new Renderer();
    }

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		renderer.init();
		
	}

	@Override
	public void input(Window window) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float interval) {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void render(Window window) {
		// TODO Auto-generated method stub
		if (window.isResized() ) {
            glViewport(0, 0, window.getWidth(), window.getHeight());
            window.setResized(false);
        }

        window.setClearColor(1.0f, 0.0f, 0.0f, 0.0f);
        renderer.clear();
	}

}
