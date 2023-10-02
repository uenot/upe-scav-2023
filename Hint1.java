public class Hint1 {

    private static class Foo {
        private int x;
        private int y;

        public Foo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }

        public int getY() { return y; }

        public Foo join(Foo other) {
            return new Foo(this.x + other.x, this.y + other.y);
        }

        public char decode() {
            return (char) (this.getX() + this.getY());
        }
    }

    private static class Bar extends Foo {
        public Bar(int z) {
            super(z, z);
        }

        public Bar join(Bar other) {
            return new Bar(this.getX() + other.getY());
        }
    }


    public static void main(String[] args) {
        Bar a = new Bar(9);
        Bar b = new Bar(20);

        Bar c = a.join(b);

        Foo d = new Foo(c.getX(), b.getY());

        Foo e = d.join(a);
        
        System.out.println(e.decode());
    }
}