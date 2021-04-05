package ObjectOrientedProgramming;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);

    }
}

class Point {
    int x = 10;
    int y = 30;

    Point() {
        // 디폴트할때 멤버변수의 값이 초기값으로 세팅된다.
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
        // 조상클래스에 디폴트 생성자가 있을 경우!
        // 조상 클래스의 디폴트 값인 10,30으로 초기화되고
        // z만이 파라미터로 들어온 300으로 초기화된다.

        // 조상클래스에 디폴트 생성자가 없을 경우!
        // super(x,y);
        // super의 경우 Point 클래스를 부를 때,
        // x와 y가 10과 30으로 초기화되고
        // Print3D를 디폴트 생성자를 부르고
        // 디폴트 생성자가 파라미터가 있는 생성자를 부른다.
        // 거기에서 Point 클래스의 파라미터가 있는 생성자를 부르고
        // 그래서 Point3D의 생성자인 초기값이 파라미터로 들어가서
        // 100,200,300이 할당된다.

        this.z = z;

    }
}