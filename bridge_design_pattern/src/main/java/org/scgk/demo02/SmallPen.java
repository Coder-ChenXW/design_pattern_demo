package org.scgk.demo02;

public class SmallPen extends WritingBrush {
    public SmallPen(Color color) {
        super(color);
    }

    @Override
    public void drawing(String draw) {
        color.dye(draw);
    }

}
