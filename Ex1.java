public class Ex1 {
    public static int[] SumArrays(int[] x, int[] y){
        int maxlength = Math.max(x.length, y.length);
        int[] result = new int[maxlength];
        for(int i = 0;i < maxlength; i++){
            result[i] = x[i]+y[i]; 
        }

        return result;
    }



    public static void main(String[] args){
        int[] A = {6,2,1};
        int[] B = {1,2,3};
        int[] C = SumArrays(A, B);

        for(int i = 0; i<C.length;i++){
            System.out.print(C[i]);
        }


    }
}
