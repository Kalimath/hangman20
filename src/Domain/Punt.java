package Domain;

public class Punt {
	private int x;
	private int y;
	
	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == null) { return false; }  
        if (getClass() != object.getClass()) { return false; }  
        if (! super.equals(object)) return false;
        else {
           Punt p = (Punt) object;
           if(this.x == p.getX() && this.y == p.getY()) return true;
           return false;
        }
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	
}
