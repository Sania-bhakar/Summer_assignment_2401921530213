class Box3D extends Box {

    int weight;

    Box3D(int weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("Weight = " + weight);
    }
}