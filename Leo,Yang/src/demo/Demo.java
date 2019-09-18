package demo;

import Processing.core.PApplet;

public class Demo extends PApplet
{
	
public static void amin(String[] args)
{
	PApplet.main("demo.Demo");
}

private int centerX;

private int centerXy;

public void settings()
{
	size(800,600);
	}

	public void setup()
	{
		centerX = 400;
	}

	public void draw()
	{
		background(73, 219, 245);
		
		ellipse(centerX,300,200,200);
		
		centerX -= 1;
		
		
	}
	}
}