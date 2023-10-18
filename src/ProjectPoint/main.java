package ProjectPoint;

import ProjectPoint.circle;

public class main {
    /**Main Method*/
    public static void main( String args[] )
    {
// Membuat instans dari kelas anak dan memanggil method yang dimilikinya
        circle circle1=new circle(6.5f, 8.2f, 1.9f);
        circle1.cetakPoint();
        System.out.println(" ");
        circle circle2=new circle (10, 5, 5);
        circle2.cetakPoint();
    }
}