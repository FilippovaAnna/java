package lesson2;

public class Main {
    public static int array(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Длина массива != 4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Высота массива != 4");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не число в элементе:" + i + "," + j);
                }
            }

        }
        return sum;

    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String [][] arr1 = new String[][]{{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            System.out.println(array(arr1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        String [][] arr2 = new String[][]{{"1","2d","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            System.out.println(array(arr2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        String [][] arr3 = new String[][]{{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            System.out.println(array(arr3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        String [][] arr4 = new String[][]{{"1","2","3","4"},{"1","2","3","4","5"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            System.out.println(array(arr4));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

