public class A {
    private int A1;
    private float A2;

    public int getA1() {
        return A1;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }

    public float getA2() {
        return A2;
    }

    public void setA2(float A2) {
        this.A2 = A2;
    }

    public void MA1() {
        System.out.println("Executando método MA1 de A");
    }

    public void MA2() {
        System.out.println("Executando método MA2 de A");
    }

    public void MA3() {
        System.out.println("Alteração da classe A apartir do clone!");
    }
    public void getSoma(int A1, float A2){
        soma = A1 + A2;
    }
}
