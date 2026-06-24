package week3.day6;

class TestCompartment {

    public static void main(String[] args) {

        Compartment[] c = new Compartment[4];

        c[0] = new FirstClass();
        c[1] = new Ladies();
        c[2] = new General();
        c[3] = new Luggage();

        for(int i = 0; i < c.length; i++) {
            System.out.println(c[i].notice());
        }
    }
}