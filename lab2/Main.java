package lab2;

public class Main {
    public static void main(String[] args) {
        // Цилиндр
        cylinder clndr = new cylinder(10, 5);
        clndr.name = "Цилиндр";
        
        clndr.GetInfo();
        System.out.println("радиус фигуры: " + clndr.getRadius());
        System.out.println("площадь поверхности: " + clndr.GetS());
        System.out.println("объем: " + clndr.GetV());

        System.out.println("поменяем значение высоты и посчитаем по новой");
        clndr.setHeight(6);

        System.out.println("новая площадь поверхности: " + clndr.GetS());
        System.out.println("новый объем: " + clndr.GetV() + "\n");

        // Шар 
        circle crcl = new circle();
        crcl.name = "\nШар";
        crcl.color = "черный";
        crcl.radius = 10;

        crcl.GetInfo();
        System.out.println("площадь поверхности: " + crcl.GetS());
        System.out.println("объем: " + crcl.GetV());

        // Параллелепипед
        square sqr = new square();
        sqr.name = "\nПараллелепипед";
        sqr.height = 10;
        sqr.weidth = 5;
        sqr.length = 1;

        sqr.GetInfo();
        System.out.println("Кол-во созданных фигур: " + sqr.squareCounter);
        System.out.println("площадь поверхности: " + sqr.GetS());
        System.out.println("объем: " + sqr.GetV() + "\n");

        
        System.out.println("создадим еще одну фигуру и выведем их кол-во");
        square sqr2 = new square();
        System.out.println("Кол-во созданных фигур: " + sqr2.squareCounter);
    }
}