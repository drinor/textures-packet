import com.badlogic.gdx.tools.imagepacker.TexturePacker2;
import com.badlogic.gdx.tools.imagepacker.TexturePacker2.Settings;

public class Packer
{
	public static void main(String[] args) 
	{ 
		Settings settings = new Settings();
		settings.maxWidth = 512;
	        settings.maxHeight = 512;
        	settings.flattenPaths = true;
           	TexturePacker2.process(settings, "images", "data", "game");
	}
}
