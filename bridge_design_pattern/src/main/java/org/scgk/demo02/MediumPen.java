package org.scgk.demo02;

public class MediumPen extends WritingBrush {


    public MediumPen(Color color) {
        super(color);
    }

    @Override
    public void drawing(String draw) {
        color.dye(draw);
    }

}
