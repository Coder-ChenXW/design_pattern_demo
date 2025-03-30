package org.scgk.demo02;

public class BigPen extends WritingBrush {
    public BigPen(Color color) {
        super(color);
    }

    @Override
    public void drawing(String draw) {
        color.dye(draw);
    }


}
