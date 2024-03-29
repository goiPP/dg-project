package render;

import java.awt.Graphics2D;

public interface IRenderable {
	public void draw(Graphics2D e);

	public boolean isVisible();

	public int getZ();
}