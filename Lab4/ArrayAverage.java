// Измененная версия, для изначальной смотреть прошлый коммит !!!!
public class ArrayAverage {
    public static void main(String[] args) {
        double sum = 0;

        Object[] numbers = {
            10.6,          
            10.8f,          
            10,           
            10,           
            "Hello",    
        };

        try {
            for (int i = 0; i < numbers.length; i++) {
                try {
                    if (numbers[i] instanceof Integer){
                        sum += (Integer) numbers[i];
                    } else if (numbers[i] instanceof Double) {
                        sum += (Double) numbers[i];
                    } else if (numbers[i] instanceof Float) {
                        sum += (Float) numbers[i];
                    } else {
                        throw new ClassCastException(numbers[i] + " не числовой тип");
                    }
                } catch (ClassCastException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sum / numbers.length);

    }
}