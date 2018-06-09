package net.dp.decorator.decorator1;

/**
 * 定义装饰者
 * @author liang
 *
 */
public abstract class Decorator implements Human {  
    private Human human;  
  
    public Decorator(Human human) {  
        this.human = human;  
    }  
  
    public void wearClothes() {  
        human.wearClothes();
    }  
  
    public void walkToWhere() {  
        human.walkToWhere();  
    }  
}  
