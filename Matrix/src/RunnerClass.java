import ru.kpfu.npp.math.MatrixArrayImpl;

public class RunnerClass {
    public static void main(String[] args) {
       MatrixArrayImpl matrixArrayImpl;
        matrixArrayImpl = new MatrixArrayImpl();
        for (int i=0;i<30;i++){
            for (int j=0;j<30;j++)
                matrixArrayImpl.setValue(i, j, i + j);
        }
        System.out.println(matrixArrayImpl);
    }


}
