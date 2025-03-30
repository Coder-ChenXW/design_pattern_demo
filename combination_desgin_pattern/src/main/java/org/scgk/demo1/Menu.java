package org.scgk.demo1;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    // 菜单可以有多个子菜单
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    public Menu(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }

}
