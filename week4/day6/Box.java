class Box {

    int volume(int l, int b, int h) {
        return l * b * h;
    }

    int volume(int side) {
        return side * side * side;
    }
}