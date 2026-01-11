public class Student {
    private String studentId;
    private String name;
    private String major;
    private Double gpa;

    //1.สร้าง constructor เพื่อกำหนดข้อมูลทั้งหมด
    public Student(String studenId, String name, String major, Double gpa) {
        this.studentId = studenId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    //2.สร้างเมธอด displayInfo() เพื่อแสดงข้อมูลนักศึกษา
    public void displayInfo() {
        System.out.print("รหัสนักศึกษา: "+studentId);
        System.out.print("ชื่อนักศึกษา: "+name);
        System.out.print("สาขา: "+major);
        System.out.print("เกรดเฉลี่ย: "+gpa);
        System.out.println();
    }
}
