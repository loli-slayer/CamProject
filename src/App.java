import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Room r = new Room(20.0,20.0,20.0);
        Camera c = new Camera(0,0,20,60,60);
        r.addCam(c);
        // Camera c1 = new Camera(7,0,6,60,60);
        // r.addCam(c1);
        Points A = new Points(5,5,0);
        Points B = new Points(5,10,0);
        Points C = new Points(10,10,0);
        Points D = new Points(10,5,0);
        Object o = new Object(A,B,C,D,15);
        r.addObj(o);
        // Points A1 = new Points(1,1,0);
        // Points B1 = new Points(3,3,0);
        // Points C1 = new Points(3,1,0);
        // Points D1 = new Points(1,3,0);
        // Object o1 = new Object(A1,B1,C1,D1,8);
        // r.addObj(o1);
        // System.out.println(o1.checkInObj(new Points(2,1,0)));
        // Points a2 = new Points(1,1,6);
        // Points b2 = new Points(2,2,6);
        // Points c2 = new Points(2,1,6);
        // Points d2 = new Points(1,2,6);
        // Object o2 = new Object(a2,b2,c2,d2,4);
        // r.addObj(o2);
        //System.out.println(r.IsLight(new Points(2,2,0)));
        // System.out.println(r.perLighter() + "%");
        // System.out.println(r.lBot().size());
        // getDraw g = new getDraw(r,1);
        // g.show();
        Max m = new Max(r,60,60);
        m.CameraUnlimited();
        // r.addCam(new Camera(0.0,20.0 ,20.0,60,60));
        //r.addCam(new Camera(2.0,20.0 ,20.0,60,60));
        //r.addCam(new Camera(4.0 ,20.0 ,20.0,60,60));
        //r.addCam(new Camera(6.0 ,20.0 ,20.0,60,60));
        // r.addCam(new Camera(8.0 ,20.0 ,20.0,60,60));
        // r.addCam(new Camera(10.0 ,20.0 ,20.0,60,60));
        // r.addCam(new Camera(12.0 ,20.0 ,20.0,60,60));
        // r.addCam(new Camera(14.0 ,20.0 ,20.0,60,60));
        // r.addCam(new Camera(16.0 ,20.0 ,20.0,60,60));
        // r.addCam(new Camera(18.0 ,20.0 ,20.0,60,60));
        // r.addCam(new Camera(0.0 ,0.0 ,20.0,60,60));
        // r.addCam(new Camera(0.0 ,2.0 ,20.0,60,60));
        //r.addCam(new Camera(0.0,8.0 ,20.0,60,60));
        // r.addCam(new Camera(0.0 ,10.0 ,20.0,60,60));
        // r.addCam(new Camera(0.0 ,12.0 ,20.0,60,60));
        // r.addCam(new Camera(0.0 ,14.0 ,20.0,60,60));
        //r.addCam(new Camera(0.0 ,16.0 ,20.0,60,60));
        //r.addCam(new Camera(0.0 ,18.0 ,20.0,60,60));
        //System.out.println(r.perLighter() + "%");
        // r.addCam(c);
        // r.getCams().remove(c);
        // System.out.println(r.getCams().size());

    }
}
