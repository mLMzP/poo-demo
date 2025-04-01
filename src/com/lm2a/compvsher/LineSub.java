package com.lm2a.compvsher;

public class LineSub extends Point {
    Point end;

    public LineSub(int x, int y, Point end) {
        super(x, y);
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "begin="+ super.toString() +
                "end=" + end +
                '}';
    }
}
