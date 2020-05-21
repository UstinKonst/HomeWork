package Stage2Lesson2;


public class Main {

    public static void main(String[] args) {
        Object[][] arr;
        int sum = 0;
        try {
            arr = array(4, 4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += (int) arr[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("в ячейке [" + i + "],[" + j + "] находится не int.");
                }
            }
        System.out.println("Сумма массива = " + sum);
    }

    public static Object[][] array(int a, int b) throws MyArraySizeException {
        if (a != 4 || b != 4) {
            throw new MyArraySizeException("Массив должен быть 4х4.");
        }
        return new Object[][]{{1, 1, 1, 1}, {2, 2, 2, 2}};
    }
}

