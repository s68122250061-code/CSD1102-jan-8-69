public class Method2d {
    public static void main(String[] args) {
        //1.ประกาศตัวแปร int[][] ที่มีขนาด 10× 10 เพื่อใช้เก็บข้อมูลตัวเลขจำนวนเต็ม
        int[][] arr1 = new int[10][10];

        //2.เขียน method สำหรับ สุ่มค่าตัวเลขจำนวนเต็มระหว่าง 50 – 59 แล้วนำไปเก็บลงในทุกตำแหน่งของ 2D Array
        System.out.println("Array 1: ");
        randomArray(arr1);
        displayArray(arr1);        

        //3.เขียน method สำหรับแสดงค่าข้อมูลทั้งหมดใน 2DArray โดยแสดงผลเป็นลักษณะตาราง
        System.out.println("Array 2: ");
        displayArray(arr1);

        //4.ให้ประกาศ 2D Array ขนาด 10 × 10 อีก 1 ตัว 
        //จากนั้นเขียน method เพื่อ บวกค่าของ array ทั้งสองตัวในตำแหน่งเดียวกัน และเก็บผลลัพธ์ลงใน array ใหม่
        int[][] arr2 = new int[10][10];
        addArray(arr1, arr2);
        int[][] result = addArray(arr1, arr2);
        System.out.println("result: ");
        displayArray(result); 
    }

    //2.เขียน method ramdom 50-59 รับพารามิเตอร์เป็น 2D Array และไม่คืนค่า(void)
    public static void randomArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = 50 + (int)(Math.random() * 10);
            }
        }
    }


    //3.เขียน method สำหรับแสดงค่าข้อมูลทั้งหมดใน 2D Array โดยแสดงผลเป็นลักษณะตาราง รับพารามิเตอร์เป็น 2D Array ใช้ nested loop และแสดงผลแต่ละแถวในบรรทัดเดียว
    public static void displayArray(int[][] arr) {
        for (int[] row : arr) {
            for (int v : row) {
                System.out.print(v +" ");
            }
            System.out.println();
        }
    }
    //4.จากนั้นเขียน method เพื่อ บวกค่าของ array ทั้งสองตัวในตำแหน่งเดียวกัน และเก็บผลลัพธ์ลงใน array ใหม่ (รับพารามิเตอร์เป็น 2D Array จำนวน 2 ตัว คืนค่าเป็น 2D Array ตัวใหม่ และใช้ nested loop)
    public static int[][] addArray(int[][] arr1, int[][] arr2) {
        int[][] result = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }
}