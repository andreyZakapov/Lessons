package lesson1;

public class Task1 {
    public static void main(String[] args) {

        int [] x = new int[]{8, 9,14,16 ,17};
        int [] y = new int[]{ 17};
        int [] d= Task1.merge(x,y);

    }

    //int [] x = new int[]{ 1, 2,4 ,7,14,16 ,17,};
    //int [] y = new int[]{8, 9,14,16 ,17};
    static int[] merge(int x[],int y[]) {
        int[] d = new int[x.length + y.length];
        int minSize;
        if(x.length<=y.length) {
            for (int i = 0, j = 0, k = 0; i < x.length; ) {
                if (x[i] < y[j]) {
                    d[k] = x[i];
                    i++;
                    k++;
                } else if (x[i] > y[j]) {
                    d[k] = y[j];
                    j++;
                    k++;
                } else if(x[i]==y[j]){
                    d[k] = x[i];
                    k++;
                    i++;
                    d[k] = y[j];
                    k++;
                    j++;
                }else d[k]=y[j];
            }
        } else{
            for (int i = 0, j = 0, k = 0; j < y.length;) {
                if (x[i] < y[j]) {
                    d[k] = x[i];
                    i++;
                    k++;
                } else if (x[i] > y[j]) {
                    d[k] = y[j];
                    j++;
                    k++;
                } else if(x[i]==y[j]){
                    d[k] = x[i];
                    k++;
                    i++;
                    d[k] = y[j];
                    k++;
                    j++;
                } else d[k]=x[i];
            }
        }
        return d;
    }

}