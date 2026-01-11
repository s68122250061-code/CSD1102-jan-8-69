public class TestStudentMain {
    public static void main(String[] args) {
        //สร้างอ็อบเจ็กต์ Student อย่างน้อย 2 คน และเรียกใช้ displayInfo()
        Student std1 = new Student("Id001", "Gee", "comsci", 3.5);
        Student std2 = new Student("Id002", "Dee", "comsci", 3.2);

        std1.displayInfo();
        std2.displayInfo();

        //4.สร้าง Student[] students = new Student[3];//array ของ refernece students[0] = new Student(...); //สร้าง object
        Student[] students = new Student[3];
        students[0] = new Student("Id003", "Ree", "comsci", 3.0);
        students[1] = new Student("Id004", "Nee", "comsci", 2.8);
        students[2] = new Student("Id005", "Mee", "comsci", 2.5);

        //5.แสดงข้อมูลทั้งหมดด้วย loop
        for (Student i : students) {
            i.displayInfo();
        }
    }
}
