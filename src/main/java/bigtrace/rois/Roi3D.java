package bigtrace.rois;

import java.awt.Color;

import org.joml.Matrix4fc;

import com.jogamp.opengl.GL3;

public interface Roi3D 
{

	public static final int POINT=0, POLYLINE=1, LINE_TRACE=2; // Types
	
	/** returns ROI type**/
	public int getType();
	
	/** Returns the name of this ROI, or null. */
	public String getName();

	/** Sets the name of this ROI. */
	public void setName(String name);
	
	/** Draws ROI into the volume **/
	public void draw( GL3 gl, Matrix4fc pvm,  final double [] screen_size);
	public void setLineColor(Color lineColor_);
	public void setPointColor(Color pointColor_);
	public float getLineThickness();
	public float getPointSize();
	public void setLineThickness(final float line_thickness);
	public void setPointSize(final float point_size);
	
}
