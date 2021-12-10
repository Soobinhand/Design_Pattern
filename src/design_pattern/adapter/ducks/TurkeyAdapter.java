package design_pattern.adapter.ducks;

// 특정 어댑터에는 바꾸고 싶은 인터페이스를 implement 해야한다.
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            turkey.fly();
        }
    }
}
