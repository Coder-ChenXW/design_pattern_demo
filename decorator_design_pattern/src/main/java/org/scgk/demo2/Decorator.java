package org.scgk.demo2;

public class Decorator extends Component {

    private Component component;

    public Decorator(Component component){
        this.component=component;
    }

    @Override
    public void operation() {
        component.operation();
    }

}
