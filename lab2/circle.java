package lab2;

class circle extends figure {
    String color;
    float radius;

    @Override
    public void GetInfo() {
        System.out.println(name + " окрасился в " + color);
    }
    
    public float GetV() {
        return (float)Math.PI * (float)Math.pow(radius, 3) * (4/3);
    }

    public float GetS() {
        return 4 * (float)Math.PI * (float)Math.pow(radius, 2);
    }
}