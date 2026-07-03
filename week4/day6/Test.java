class Test {

    public static void main(String[] args) {

        Point p = new Point(10, 20);

        p.display();

        Box b = new Box();

        System.out.println(b.volume(2,3,4));

        System.out.println(b.volume(5));

        Box3D obj = new Box3D(50);

        obj.show();

        OuterClass out = new OuterClass();

        OuterClass.InnerClass in =
            out.new InnerClass();

        in.display();
    }
}