package com.sv.hashcode;
/**
 * 
 * @author venkat
 *
 */
public class Shape {

	private int shapeCd;
	private String shapeName;
	
	
	public Shape(int shapeCd, String shapeName) {
		super();
		this.shapeCd = shapeCd;
		this.shapeName = shapeName;
	}
	public int getShapeCd() {
		return shapeCd;
	}
	public void setShapeCd(int shapeCd) {
		this.shapeCd = shapeCd;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	@Override
	public String toString() {
		return "\nShape [shapeCd=" + shapeCd + ", shapeName=" + shapeName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shapeCd;
		result = prime * result + ((shapeName == null) ? 0 : shapeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		if (shapeCd != other.shapeCd)
			return false;
		if (shapeName == null) {
			if (other.shapeName != null)
				return false;
		} else if (!shapeName.equals(other.shapeName))
			return false;
		return true;
	}
	
	
}
