public class A{
    private int A1;
    private float A2;

    public int getA1(){
        return A1;
    }

    public float getA2(){
        return A2;
    }

    public void setA1(int newValueA1){
        A1 = newValueA1;
    }

    public void setA2(float newValueA2){
        A2 = newValueA2;
    }

    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }

    public void MA3(){
        System.out.println("Alteracao a classe A a partir do clone");
    }
}