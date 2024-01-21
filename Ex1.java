public class Ex1 {
    public static int[] SumArrays(int[] x, int[] y){
        int maxlength = Math.max(x.length, y.length);
        int Diff = x.length-y.length;
        int[] result = new int[maxlength];
        for(int i = 0;i < maxlength; i++){
            if (i < x.length && i < y.length) {
                // รวมค่าทั้งสองค่า
                result[i] = x[i] + y[i];
              } else if (i < x.length) {
                // อาร์เรย์ x มีความยาวมากกว่า
                result[i] = x[i];
              } else {
                // อาร์เรย์ y มีความยาวมากกว่า
                result[i] = y[i];
              }
        }

        return result;
    }



    public static void main(String[] args){
        //s
        int[] A = {6,2,1};
        int[] B = {1,2};
        int[] C = SumArrays(A, B);

        for(int i = 0; i<C.length;i++){
            System.out.print(C[i]);
        }


    }
}
