package lab2;

class cylinder extends figure {
    private float radius;
    private float height;

    public cylinder(float height, float radius) {
        this.height = height;
        this.radius = radius;
     }
    
    public float GetV() {
        return (float)Math.PI * radius * height;
    }

    public float GetS() {
        return 2 * (float)Math.PI * radius * height;
    }

    public void setHeight(float newHeight) {
        this.height = newHeight;
    }

    public float getRadius() {
        return radius;
    }
}