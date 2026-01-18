package lab2; 

class square extends figure {
    float height;
    float length;
    float weidth;

    static int squareCounter = 0;

    public square() {
        squareCounter++;
    }

    public float GetV() {
        return height * length * weidth;
    }

    public float GetS() {
        return (height * weidth * 2) + (height * length * 4);
    }
}